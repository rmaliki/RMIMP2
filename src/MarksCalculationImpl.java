import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.sql.*;

public class MarksCalculationImpl extends UnicastRemoteObject implements MarksCalculation
{
	
	public MarksCalculationImpl() throws RemoteException
		{
			super();
		}
		
	public double CalculateMarks(ArrayList <String> StudentAnswer)
	{
		int correct = 0;
		
		String StudentA1 = StudentAnswer.get(0);
		String StudentA2 = StudentAnswer.get(1);
		String StudentA3 = StudentAnswer.get(2);
		String StudentA4 = StudentAnswer.get(3);
		String StudentA5 = StudentAnswer.get(4);
		String name = StudentAnswer.get(5);
		String email = StudentAnswer.get(6);
		
		String A1 = "";
		String A2 = "";
		String A3 = "";
		String A4 = "";
		String A5 = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlanswer1 = "select Detail from Answer where idAnswer = 1";
			
			Statement stmt1 = dbcon.createStatement();
			String sqlanswer2 = "select Detail from Answer where idAnswer = 2";
			
			Statement stmt2 = dbcon.createStatement();
			String sqlanswer3 = "select Detail from Answer where idAnswer = 3";
			
			Statement stmt3 = dbcon.createStatement();
			String sqlanswer4 = "select Detail from Answer where idAnswer = 4";
			
			Statement stmt4 = dbcon.createStatement();
			String sqlanswer5 = "select Detail from Answer where idAnswer = 5";
			
			
			ResultSet result = stmt.executeQuery(sqlanswer1);
			while (result.next()) {
				A1 = result.getString("Detail");
				  
				}
			
			ResultSet result1 = stmt1.executeQuery(sqlanswer2);
			while (result1.next()) {
				A2 = result1.getString("Detail");
				  
				}
			
			ResultSet result2 = stmt2.executeQuery(sqlanswer3);
			while (result2.next()) {
				A3 = result2.getString("Detail");
				  
				}
			
			ResultSet result3 = stmt3.executeQuery(sqlanswer4);
			while (result3.next()) {
				A4 = result3.getString("Detail");
				  
				}
			
			ResultSet result4 = stmt4.executeQuery(sqlanswer5);
			while (result4.next()) {
				A5 = result4.getString("Detail");
				  
				}
			
			
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		if(StudentA1.equals(A1))
				correct=correct+1;
			if(StudentA2.equals(A2))
				correct=correct+1;
			if(StudentA3.equals(A3))
				correct=correct+1;
			if(StudentA4.equals(A4))
				correct=correct+1;
			if(StudentA5.equals(A5))
				correct=correct+1;
		
		double marks = correct * 20 ;
		

		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			
			String sql =("insert into Student (Email , StudentName, StudentScore)" + "values (?,?,?)");
			PreparedStatement ps = dbcon.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, name);
			ps.setDouble(3, marks);
			
			ps.executeUpdate();
			dbcon.close();
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		try {
			FileWriter f=new FileWriter(name+".txt");
			f.write("Your result details\n");
			f.write("Name: "+name+"\n");
			f.write("email: "+email+"\n");
			f.write("Score: "+marks+"%\n");
			f.close();
			
		} catch (IOException err) {
            err.printStackTrace();
        }
		
		return marks;
	}
	
	public ArrayList<String> Question (String a)
	{
		ArrayList<String> Question = new ArrayList<String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQuestion = "select Content from Question ";
			
			Statement stmt1 = dbcon.createStatement();
			String sqlQ1Choice = "select Detail from QuestionChoice1 ";
			
			Statement stmt2 = dbcon.createStatement();
			String sqlQ2Choice = "select Detail from QuestionChoice2";
			
			Statement stmt3 = dbcon.createStatement();
			String sqlQ3Choice = "select Detail from QuestionChoice3";
			
			Statement stmt4 = dbcon.createStatement();
			String sqlQ4Choice = "select Detail from QuestionChoice4";
			
			Statement stmt5 = dbcon.createStatement();
			String sqlQ5Choice = "select Detail from QuestionChoice5";
			
			ResultSet result = stmt.executeQuery(sqlQuestion);
			while (result.next()) {
				Question.add( result.getString("Content"));
				  
				}
			
			ResultSet result1 = stmt1.executeQuery(sqlQ1Choice);
			while (result1.next()) {
				Question.add( result1.getString("Detail"));
				  
				}
			
			ResultSet result2 = stmt2.executeQuery(sqlQ2Choice);
			while (result2.next()) {
				Question.add( result2.getString("Detail"));
				  
				}
			
			ResultSet result3 = stmt3.executeQuery(sqlQ3Choice);
			while (result3.next()) {
				Question.add( result3.getString("Detail"));
				  
				}
			
			ResultSet result4 = stmt4.executeQuery(sqlQ4Choice);
			while (result4.next()) {
				Question.add( result4.getString("Detail"));
				  
				}
			
			ResultSet result5 = stmt5.executeQuery(sqlQ5Choice);
			while (result5.next()) {
				Question.add( result5.getString("Detail"));
				  
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		
		return Question;
		
	}

	@Override
	public byte[] downloadFile(String fileName) throws RemoteException {
		// TODO Auto-generated method stub
		try
		{
		File file=new File(fileName);
		byte buffer[]=new byte[(int)file.length()];
		BufferedInputStream input=new BufferedInputStream(new FileInputStream(fileName));
		input.read(buffer,0,buffer.length);
		input.close();
		return(buffer);
		}
		catch(Exception e)
		{
		System.out.println("FileImpl : "+e.getMessage());
		e.printStackTrace();
		return(null);
		}
	
	}
	
}