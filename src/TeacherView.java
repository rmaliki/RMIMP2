import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.Vector;
import java.awt.SystemColor;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;

public class TeacherView {

	private JFrame frame;
	private JPanel ResultView;
	private JPanel TeacherView;
	private JPanel EditQuestion1View;
	private JPanel EditQuestion2View;
	private JPanel EditQuestion3View;
	private JPanel EditQuestion4View;
	private JPanel EditQuestion5View;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTable table;
	
	private int portNumber=1098;

	/**
	 * Launch the application.
	 */
	 @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherView window = new TeacherView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public TeacherView() {
		initialize();
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 674, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel TeacherView = new JPanel();
		TeacherView.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, null, null, null));
		TeacherView.setBackground(Color.GREEN);
		frame.getContentPane().add(TeacherView, "name_1393765914558837");
		TeacherView.setLayout(null);
		
		final JPanel EditQuestion1View = new JPanel();
		EditQuestion1View.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, null, null, null));
		EditQuestion1View.setBackground(Color.GREEN);
		frame.getContentPane().add(EditQuestion1View, "name_1393767769482360");
		EditQuestion1View.setLayout(null);
		
		final JPanel EditQuestion2View = new JPanel();
		EditQuestion2View.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, null, null, null));
		EditQuestion2View.setBackground(Color.GREEN);
		frame.getContentPane().add(EditQuestion2View, "name_26302107226936");
		EditQuestion2View.setLayout(null);
		
		final JPanel EditQuestion3View = new JPanel();
		EditQuestion3View.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, null, null, null));
		EditQuestion3View.setBackground(Color.GREEN);
		frame.getContentPane().add(EditQuestion3View, "name_187445781584357");
		EditQuestion3View.setLayout(null);
		
		JButton button_6 = new JButton("1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion1View.setVisible(true);
				EditQuestion2View.setVisible(false);
			}
		});
		button_6.setBackground(SystemColor.control);
		button_6.setBounds(532, 75, 97, 44);
		EditQuestion2View.add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.setBackground(Color.PINK);
		button_7.setBounds(532, 135, 97, 44);
		EditQuestion2View.add(button_7);
		
		JButton button_8 = new JButton("3");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion3View.setVisible(true);
				EditQuestion2View.setVisible(false);
			}
		});
		button_8.setBackground(SystemColor.control);
		button_8.setBounds(532, 195, 97, 44);
		EditQuestion2View.add(button_8);
		
		JButton button_9 = new JButton("4");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion4View.setVisible(true);
				EditQuestion2View.setVisible(false);
			}
		});
		button_9.setBackground(SystemColor.control);
		button_9.setBounds(532, 255, 97, 44);
		EditQuestion2View.add(button_9);
		
		JButton button_10 = new JButton("5");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion5View.setVisible(true);
				EditQuestion2View.setVisible(false);
			}
		});
		button_10.setBackground(SystemColor.control);
		button_10.setBounds(532, 315, 97, 44);
		EditQuestion2View.add(button_10);
		
		final JRadioButton B1 = new JRadioButton("");
		B1.setBounds(103, 135, 40, 25);
		EditQuestion2View.add(B1);
		
		final JRadioButton B2 = new JRadioButton("");
		B2.setBounds(103, 195, 40, 25);
		EditQuestion2View.add(B2);
		
		final JRadioButton B3 = new JRadioButton("");
		B3.setBounds(103, 255, 40, 25);
		EditQuestion2View.add(B3);
		
		final JRadioButton B4 = new JRadioButton("");
		B4.setBounds(103, 315, 40, 25);
		EditQuestion2View.add(B4);
		
		final JPanel EditQuestion4View = new JPanel();
		EditQuestion4View.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, null, null, null));
		EditQuestion4View.setBackground(Color.GREEN);
		frame.getContentPane().add(EditQuestion4View, "name_187449249890841");
		EditQuestion4View.setLayout(null);
		
		final JPanel EditQuestion5View = new JPanel();
		EditQuestion5View.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, null, null, null));
		EditQuestion5View.setBackground(Color.GREEN);
		frame.getContentPane().add(EditQuestion5View, "name_187452304956616");
		EditQuestion5View.setLayout(null);
		
		JLabel label_1 = new JLabel("Question");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_1.setBounds(532, 30, 97, 32);
		EditQuestion2View.add(label_1);
		
		final JTextPane textPane_1 = new JTextPane();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Content from Question where idQuestion = 2";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Content");
				  
				  textPane_1.setText(s1);
				}
				dbcon.close();
			
				
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		
		textPane_1.setBounds(71, 30, 413, 67);
		EditQuestion2View.add(textPane_1);
		
		textField_4 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice2 where QuestionChoice2 = 1";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_4.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_4.setColumns(10);
		textField_4.setBounds(151, 123, 306, 37);
		EditQuestion2View.add(textField_4);
		
		textField_5 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice2 where QuestionChoice2 = 2";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_5.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_5.setColumns(10);
		textField_5.setBounds(151, 183, 306, 37);
		EditQuestion2View.add(textField_5);
		
		textField_6 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice2 where QuestionChoice2 = 3";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_6.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_6.setColumns(10);
		textField_6.setBounds(151, 243, 306, 37);
		EditQuestion2View.add(textField_6);
		
		textField_7 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice2 where QuestionChoice2 = 4";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_7.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_7.setColumns(10);
		textField_7.setBounds(151, 303, 306, 37);
		EditQuestion2View.add(textField_7);
		
		
		
		JButton button_12 = new JButton("Return to Menu");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherView.setVisible(true);
				EditQuestion2View.setVisible(false);
			}
		});
		button_12.setBounds(382, 372, 174, 43);
		EditQuestion2View.add(button_12);
		
		JButton button_13 = new JButton("1");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion1View.setVisible(true);
				EditQuestion3View.setVisible(false);
			}
		});
		button_13.setBackground(SystemColor.menu);
		button_13.setBounds(532, 75, 97, 44);
		EditQuestion3View.add(button_13);
		
		JButton button_14 = new JButton("2");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion2View.setVisible(true);
				EditQuestion3View.setVisible(false);
			}
		});
		button_14.setBackground(SystemColor.control);
		button_14.setBounds(532, 135, 97, 44);
		EditQuestion3View.add(button_14);
		
		JButton button_15 = new JButton("3");
		button_15.setBackground(Color.PINK);
		button_15.setBounds(532, 195, 97, 44);
		EditQuestion3View.add(button_15);
		
		JButton button_16 = new JButton("4");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion4View.setVisible(true);
				EditQuestion3View.setVisible(false);
			}
		});
		button_16.setBackground(SystemColor.menu);
		button_16.setBounds(532, 255, 97, 44);
		EditQuestion3View.add(button_16);
		
		JButton button_17 = new JButton("5");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion5View.setVisible(true);
				EditQuestion3View.setVisible(false);
			}
		});
		button_17.setBackground(SystemColor.menu);
		button_17.setBounds(532, 315, 97, 44);
		EditQuestion3View.add(button_17);
		
		final JRadioButton C1 = new JRadioButton("");
		C1.setBounds(103, 135, 40, 25);
		EditQuestion3View.add(C1);
		
		final JRadioButton C2 = new JRadioButton("");
		C2.setBounds(103, 195, 40, 25);
		EditQuestion3View.add(C2);
		
		final JRadioButton C3 = new JRadioButton("");
		C3.setBounds(103, 255, 40, 25);
		EditQuestion3View.add(C3);
		
		final JRadioButton C4 = new JRadioButton("");
		C4.setBounds(103, 315, 40, 25);
		EditQuestion3View.add(C4);
		
		JLabel label_2 = new JLabel("Question");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_2.setBounds(532, 30, 97, 32);
		EditQuestion3View.add(label_2);
		
		final JTextPane textPane_2 = new JTextPane();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Content from Question where idQuestion = 3";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Content");
				  textPane_2.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textPane_2.setBounds(71, 30, 413, 67);
		EditQuestion3View.add(textPane_2);
		
		textField_8 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice3 where QuestionChoice3 = 1";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_8.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_8.setColumns(10);
		textField_8.setBounds(151, 123, 306, 37);
		EditQuestion3View.add(textField_8);
		
		textField_9 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice3 where QuestionChoice3 = 2";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_9.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_9.setColumns(10);
		textField_9.setBounds(151, 183, 306, 37);
		EditQuestion3View.add(textField_9);
		
		textField_10 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice3 where QuestionChoice3 = 3";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_10.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}

		textField_10.setColumns(10);
		textField_10.setBounds(151, 243, 306, 37);
		EditQuestion3View.add(textField_10);
		
		textField_11 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice3 where QuestionChoice3 = 4";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_11.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_11.setColumns(10);
		textField_11.setBounds(151, 303, 306, 37);
		EditQuestion3View.add(textField_11);
		
		
		
		JButton button_19 = new JButton("Return to Menu");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherView.setVisible(true);
				EditQuestion3View.setVisible(false);
			}
		});
		button_19.setBounds(382, 372, 174, 43);
		EditQuestion3View.add(button_19);
		
		JButton button_20 = new JButton("1");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion1View.setVisible(true);
				EditQuestion4View.setVisible(false);
			}
		});
		button_20.setBackground(SystemColor.menu);
		button_20.setBounds(532, 75, 97, 44);
		EditQuestion4View.add(button_20);
		
		JButton button_21 = new JButton("2");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion2View.setVisible(true);
				EditQuestion4View.setVisible(false);
			}
		});
		button_21.setBackground(SystemColor.control);
		button_21.setBounds(532, 135, 97, 44);
		EditQuestion4View.add(button_21);
		
		JButton button_22 = new JButton("3");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion3View.setVisible(true);
				EditQuestion4View.setVisible(false);
			}
		});
		button_22.setBackground(SystemColor.menu);
		button_22.setBounds(532, 195, 97, 44);
		EditQuestion4View.add(button_22);
		
		JButton button_23 = new JButton("4");
		button_23.setBackground(Color.PINK);
		button_23.setBounds(532, 255, 97, 44);
		EditQuestion4View.add(button_23);
		
		JButton button_24 = new JButton("5");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion5View.setVisible(true);
				EditQuestion4View.setVisible(false);
			}
		});
		button_24.setBackground(SystemColor.menu);
		button_24.setBounds(532, 315, 97, 44);
		EditQuestion4View.add(button_24);
		
		final JRadioButton D1 = new JRadioButton("");
		D1.setBounds(103, 135, 40, 25);
		EditQuestion4View.add(D1);
		
		final JRadioButton D2 = new JRadioButton("");
		D2.setBounds(103, 195, 40, 25);
		EditQuestion4View.add(D2);
		
		final JRadioButton D3 = new JRadioButton("");
		D3.setBounds(103, 255, 40, 25);
		EditQuestion4View.add(D3);
		
		final JRadioButton D4 = new JRadioButton("");
		D4.setBounds(103, 315, 40, 25);
		EditQuestion4View.add(D4);
		
		JLabel label_3 = new JLabel("Question");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_3.setBounds(532, 30, 97, 32);
		EditQuestion4View.add(label_3);
		
		final JTextPane textPane_3 = new JTextPane();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Content from Question where idQuestion = 4";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Content");
				  textPane_3.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textPane_3.setBounds(71, 30, 413, 67);
		EditQuestion4View.add(textPane_3);
		
		textField_12 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice4 where QuestionChoice4 = 1";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_12.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_12.setColumns(10);
		textField_12.setBounds(151, 123, 306, 37);
		EditQuestion4View.add(textField_12);
		
		textField_13 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice4 where QuestionChoice4 = 2";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_13.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_13.setColumns(10);
		textField_13.setBounds(151, 183, 306, 37);
		EditQuestion4View.add(textField_13);
		
		textField_14 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice4 where QuestionChoice4 = 3";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_14.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_14.setColumns(10);
		textField_14.setBounds(151, 243, 306, 37);
		EditQuestion4View.add(textField_14);
		
		textField_15 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice4 where QuestionChoice4 = 4";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_15.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_15.setColumns(10);
		textField_15.setBounds(151, 303, 306, 37);
		EditQuestion4View.add(textField_15);
		
		
		
		JButton button_26 = new JButton("Return to Menu");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherView.setVisible(true);
				EditQuestion4View.setVisible(false);
			}
		});
		button_26.setBounds(382, 372, 174, 43);
		EditQuestion4View.add(button_26);
		
		JButton button_27 = new JButton("1");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion1View.setVisible(true);
				EditQuestion5View.setVisible(false);
			}
		});
		button_27.setBackground(SystemColor.menu);
		button_27.setBounds(532, 75, 97, 44);
		EditQuestion5View.add(button_27);
		
		JButton button_28 = new JButton("2");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion2View.setVisible(true);
				EditQuestion5View.setVisible(false);
			}
		});
		button_28.setBackground(SystemColor.control);
		button_28.setBounds(532, 135, 97, 44);
		EditQuestion5View.add(button_28);
		
		JButton button_29 = new JButton("3");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion3View.setVisible(true);
				EditQuestion5View.setVisible(false);
			}
		});
		button_29.setBackground(SystemColor.menu);
		button_29.setBounds(532, 195, 97, 44);
		EditQuestion5View.add(button_29);
		
		JButton button_30 = new JButton("4");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion4View.setVisible(true);
				EditQuestion5View.setVisible(false);
			}
		});
		button_30.setBackground(SystemColor.menu);
		button_30.setBounds(532, 255, 97, 44);
		EditQuestion5View.add(button_30);
		
		JButton button_31 = new JButton("5");
		button_31.setBackground(Color.PINK);
		button_31.setBounds(532, 315, 97, 44);
		EditQuestion5View.add(button_31);
		
		final JRadioButton E1 = new JRadioButton("");
		E1.setBounds(103, 135, 40, 25);
		EditQuestion5View.add(E1);
		
		final JRadioButton E2 = new JRadioButton("");
		E2.setBounds(103, 195, 40, 25);
		EditQuestion5View.add(E2);
		
		final JRadioButton E3 = new JRadioButton("");
		E3.setBounds(103, 255, 40, 25);
		EditQuestion5View.add(E3);
		
		final JRadioButton E4 = new JRadioButton("");
		E4.setBounds(103, 315, 40, 25);
		EditQuestion5View.add(E4);
		
		JLabel label_4 = new JLabel("Question");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_4.setBounds(532, 30, 97, 32);
		EditQuestion5View.add(label_4);
		
		final JTextPane textPane_4 = new JTextPane();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Content from Question where idQuestion = 5";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Content");
				  textPane_4.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textPane_4.setBounds(71, 30, 413, 67);
		EditQuestion5View.add(textPane_4);
		
		textField_16 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice5 where QuestionChoice5 = 1";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_16.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_16.setColumns(10);
		textField_16.setBounds(151, 123, 306, 37);
		EditQuestion5View.add(textField_16);
		
		textField_17 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice5 where QuestionChoice5 = 2";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_17.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_17.setColumns(10);
		textField_17.setBounds(151, 183, 306, 37);
		EditQuestion5View.add(textField_17);
		
		textField_18 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice5 where QuestionChoice5 = 3";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_18.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_18.setColumns(10);
		textField_18.setBounds(151, 243, 306, 37);
		EditQuestion5View.add(textField_18);
		
		textField_19 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice5 where QuestionChoice5 = 4";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_19.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_19.setColumns(10);
		textField_19.setBounds(151, 303, 306, 37);
		EditQuestion5View.add(textField_19);
		
		
		
		JButton button_33 = new JButton("Return to Menu");
		button_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherView.setVisible(true);
				EditQuestion5View.setVisible(false);
			}
		});
		button_33.setBounds(382, 372, 174, 43);
		EditQuestion5View.add(button_33);
		
		final JPanel ResultView = new JPanel();
		frame.getContentPane().add(ResultView, "name_1393769647673612");
		ResultView.setLayout(null);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TeacherView.setVisible(true);
				ResultView.setVisible(false);
			}
		});
		btnNewButton.setBounds(285, 385, 97, 35);
		ResultView.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(108, 143, 444, 213);
		ResultView.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton QuestionButton = new JButton("Question");
		QuestionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditQuestion1View.setVisible(true);
				TeacherView.setVisible(false);
			}
		});
		QuestionButton.setBounds(128, 85, 184, 87);
		TeacherView.add(QuestionButton);
		
		JButton ResultButton = new JButton("Result");
		ResultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String dburl = "jdbc:mysql://localhost:3306/questionschema";
					Connection dbcon = DriverManager.getConnection(dburl,"root","");

					Statement stmt = dbcon.createStatement();
					String sqlQ1 = "select * from Student ";
					
					ResultSet rs = stmt.executeQuery(sqlQ1);
					
					ResultSetMetaData rsmetadata = rs.getMetaData();
					
					int columns = rsmetadata.getColumnCount();
					
					DefaultTableModel dtm = new DefaultTableModel();
					Vector columns_name = new Vector();
					Vector data_rows = new Vector();
					
					for (int i = 1; i<=columns ; i++){
						columns_name.addElement(rsmetadata.getColumnName(i));
					}
					dtm.setColumnIdentifiers(columns_name);
					
					while(rs.next()){
						data_rows = new Vector();
						for(int j=1; j<=columns ; j++){
							data_rows.addElement(rs.getString(j));
						}
						dtm.addRow(data_rows);
					}
					
					table.setModel(dtm);
			
						dbcon.close();
					
				}
				catch(Exception err)
				{
					System.out.println("Error : " + err);
				}
				ResultView.setVisible(true);
				TeacherView.setVisible(false);
				
			}
		});
		ResultButton.setBounds(128, 243, 184, 87);
		TeacherView.add(ResultButton);
		
		JTextArea txtrEditingTheQuestion = new JTextArea();
		txtrEditingTheQuestion.setEditable(false);
		txtrEditingTheQuestion.setLineWrap(true);
		txtrEditingTheQuestion.setOpaque(false);
		txtrEditingTheQuestion.setText("Editing the question...\r\nPlease make sure click save \r\nafter editing the question...");
		txtrEditingTheQuestion.setBounds(374, 95, 236, 64);
		TeacherView.add(txtrEditingTheQuestion);
		
		JTextArea txtrToViewAll = new JTextArea();
		txtrToViewAll.setEditable(false);
		txtrToViewAll.setLineWrap(true);
		txtrToViewAll.setOpaque(false);
		txtrToViewAll.setText("To view all the \r\nstudent results...");
		txtrToViewAll.setBounds(412, 254, 157, 48);
		TeacherView.add(txtrToViewAll);
		
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBackground(Color.PINK);
		button.setBounds(532, 75, 97, 44);
		EditQuestion1View.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBackground(SystemColor.control);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditQuestion2View.setVisible(true);
				EditQuestion1View.setVisible(false);
			}
		});
		button_1.setBounds(532, 135, 97, 44);
		EditQuestion1View.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditQuestion3View.setVisible(true);
				EditQuestion1View.setVisible(false);
			}
		});
		button_2.setBackground(SystemColor.control);
		button_2.setBounds(532, 195, 97, 44);
		EditQuestion1View.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion4View.setVisible(true);
				EditQuestion1View.setVisible(false);
			}
		});
		button_3.setBackground(SystemColor.control);
		button_3.setBounds(532, 255, 97, 44);
		EditQuestion1View.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion5View.setVisible(true);
				EditQuestion1View.setVisible(false);
			}
		});
		button_4.setBackground(SystemColor.control);
		button_4.setBounds(532, 315, 97, 44);
		EditQuestion1View.add(button_4);
		
		final JRadioButton A1 = new JRadioButton("");
		
		
		A1.setBounds(103, 135, 40, 25);
		EditQuestion1View.add(A1);
		
		final JRadioButton A2 = new JRadioButton("");
		A2.setBounds(103, 195, 40, 25);
		EditQuestion1View.add(A2);
		
		final JRadioButton A3 = new JRadioButton("");
		A3.setBounds(103, 255, 40, 25);
		EditQuestion1View.add(A3);
		
		final JRadioButton A4 = new JRadioButton("");
		A4.setBounds(103, 315, 40, 25);
		EditQuestion1View.add(A4);
		
		final ButtonGroup group = new ButtonGroup();
        group.add(A1);
        group.add(A2);
        group.add(A3);
        group.add(A4);
        
        final ButtonGroup group1 = new ButtonGroup();
        group1.add(B1);
        group1.add(B2);
        group1.add(B3);
        group1.add(B4);
        
        final ButtonGroup group2 = new ButtonGroup();
        group2.add(C1);
        group2.add(C2);
        group2.add(C3);
        group2.add(C4);
        
        final ButtonGroup group3 = new ButtonGroup();
        group3.add(D1);
        group3.add(D2);
        group3.add(D3);
        group3.add(D4);
        
        final ButtonGroup group4 = new ButtonGroup();
        group4.add(E1);
        group4.add(E2);
        group4.add(E3);
        group4.add(E4);
        
      //A1.setSelected(true);
		
		JLabel label = new JLabel("Question");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label.setBounds(532, 30, 97, 32);
		EditQuestion1View.add(label);
		
		final JTextPane textPane = new JTextPane();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Content from Question where idQuestion = 1";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Content");
				  textPane.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}

		textPane.setBounds(71, 30, 413, 67);
		EditQuestion1View.add(textPane);
		
		textField = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice1 where QuestionChoice1 = 1";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		
	
		textField.setBounds(151, 123, 306, 37);
		EditQuestion1View.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice1 where QuestionChoice1 = 2";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_1.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_1.setColumns(10);
		textField_1.setBounds(151, 183, 306, 37);
		EditQuestion1View.add(textField_1);
		
		textField_2 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice1 where QuestionChoice1 = 3";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_2.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		textField_2.setColumns(10);
		textField_2.setBounds(151, 243, 306, 37);
		EditQuestion1View.add(textField_2);
		
		textField_3 = new JTextField();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from QuestionChoice1 where QuestionChoice1 = 4";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  String s1 = result.getString("Detail");
				  textField_3.setText(s1);
				}
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		
		//CHECK QUESTION 1 ANSWER
		StringBuilder sb = new StringBuilder();
		String ss1 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from Answer where idAnswer = 1";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				   ss1 = result.getString("Detail");
				   
				 
				}
			sb.append(ss1);
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		
		final String answer=sb.toString();
		
		//CHECK QUESTION 2 ANSWER
		StringBuilder sb1 = new StringBuilder();
		String ss2 = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from Answer where idAnswer = 2";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  ss2 = result.getString("Detail");
				 
				}
			sb1.append(ss2);
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		final String answer2=sb1.toString();
		//CHECK QUESTION 3 ANSWER
		StringBuilder sb3 = new StringBuilder();
		String ss3 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from Answer where idAnswer = 3";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  ss3 = result.getString("Detail");
				 
				}
			sb3.append(ss3);
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		final String answer3=sb3.toString();
		//CHECK QUESTION 4 ANSWER
		StringBuilder sb4 = new StringBuilder();
		String ss4 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from Answer where idAnswer = 4";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				  ss4 = result.getString("Detail");
				 
				}
			sb4.append(ss4);
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		final String answer4=sb4.toString();
		//CHECK QUESTION 5 ANSWER
		StringBuilder sb5 = new StringBuilder();
		String ss5 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/questionschema";
			Connection dbcon = DriverManager.getConnection(dburl,"root","");

			Statement stmt = dbcon.createStatement();
			String sqlQ1 = "select Detail from Answer where idAnswer = 5";
			
			ResultSet result = stmt.executeQuery(sqlQ1);
			while (result.next()) {
				 ss5 = result.getString("Detail");
				 
				}
			sb5.append(ss5);
				dbcon.close();
			
		}
		catch(Exception err)
		{
			System.out.println("Error : " + err);
		}
		final String answer5=sb5.toString();
		
		if (answer.equals(textField.getText()))
			A1.setSelected(true);
		else if(answer.equals(textField_1.getText()))
			A2.setSelected(true);
		else if(answer.equals(textField_2.getText()))
			A3.setSelected(true);
		else if(answer.equals(textField_3.getText()))
			A4.setSelected(true);
		
		if (answer2.equals(textField_4.getText()))
			B1.setSelected(true);
		else if(answer2.equals(textField_5.getText()))
			B2.setSelected(true);
		else if(answer2.equals(textField_6.getText()))
			B3.setSelected(true);
		else if(answer2.equals(textField_7.getText()))
			B4.setSelected(true);
		
		if (answer3.equals(textField_8.getText()))
			C1.setSelected(true);
		else if(answer3.equals(textField_9.getText()))
			C2.setSelected(true);
		else if(answer3.equals(textField_10.getText()))
			C3.setSelected(true);
		else if(answer3.equals(textField_11.getText()))
			C4.setSelected(true);
		
		if (answer4.equals(textField_12.getText()))
			D1.setSelected(true);
		else if(answer4.equals(textField_13.getText()))
			D2.setSelected(true);
		else if(answer4.equals(textField_14.getText()))
			D3.setSelected(true);
		else if(answer4.equals(textField_15.getText()))
			D4.setSelected(true);
		
		if (answer5.equals(textField_16.getText()))
			E1.setSelected(true);
		else if(answer5.equals(textField_17.getText()))
			E2.setSelected(true);
		else if(answer5.equals(textField_18.getText()))
			E3.setSelected(true);
		else if(answer5.equals(textField_19.getText()))
			E4.setSelected(true);
		
		
		
		textField_3.setColumns(10);
		textField_3.setBounds(151, 303, 306, 37);
		EditQuestion1View.add(textField_3);
		
		JButton btnSave_4 = new JButton("Save");
		btnSave_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Question 1 has been updated", 
						"Warning Message!", JOptionPane.WARNING_MESSAGE);
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String dburl = "jdbc:mysql://localhost:3306/questionschema";
					Connection dbcon = DriverManager.getConnection(dburl,"root","");
					
					String query = "update Question set Content = ? where idQuestion = 1";
				    PreparedStatement preparedStmt = dbcon.prepareStatement(query);
				    preparedStmt.setString(1, textPane.getText());
				    
				    preparedStmt.executeUpdate();
					
				    String query1 = "update QuestionChoice1 set Detail = ? where QuestionChoice1 = 1";
				    PreparedStatement preparedStmt1 = dbcon.prepareStatement(query1);
				    preparedStmt1.setString(1, textField.getText());
				    
				    preparedStmt1.executeUpdate();
				    
				    String query2 = "update QuestionChoice1 set Detail = ? where QuestionChoice1 = 2";
				    PreparedStatement preparedStmt2 = dbcon.prepareStatement(query2);
				    preparedStmt2.setString(1, textField_1.getText());
				    
				    preparedStmt2.executeUpdate();
				 
				    String query3 = "update QuestionChoice1 set Detail = ? where QuestionChoice1 = 3";
				    PreparedStatement preparedStmt3 = dbcon.prepareStatement(query3);
				    preparedStmt3.setString(1, textField_2.getText());
				    
				    preparedStmt3.executeUpdate();
				    
				    String query4 = "update QuestionChoice1 set Detail = ? where QuestionChoice1 = 4";
				    PreparedStatement preparedStmt4 = dbcon.prepareStatement(query4);
				    preparedStmt4.setString(1, textField_3.getText());
				    
				    preparedStmt4.executeUpdate();
				    
				    
				    if (A1.isSelected()){
				    	
				    	String query5 = "update Answer set Detail = ? where idAnswer = 1";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (A2.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 1";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_1.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (A3.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 1";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_2.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (A4.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 1";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_3.getText());
					    preparedStmt5.executeUpdate();
				    }
				    
				    
					
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnSave_4.setBounds(94, 372, 174, 43);
		EditQuestion1View.add(btnSave_4);
		
		JButton btnSave_3 = new JButton("Save");
		btnSave_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Question 2 has been updated", 
						"Warning Message!", JOptionPane.WARNING_MESSAGE);

				try {
					Class.forName("com.mysql.jdbc.Driver");
					String dburl = "jdbc:mysql://localhost:3306/questionschema";
					Connection dbcon = DriverManager.getConnection(dburl,"root","");
					
					String query = "update Question set Content = ? where idQuestion = 2";
				    PreparedStatement preparedStmt = dbcon.prepareStatement(query);
				    preparedStmt.setString(1, textPane_1.getText());
				    
				    preparedStmt.executeUpdate();
					
				    String query1 = "update QuestionChoice2 set Detail = ? where QuestionChoice2 = 1";
				    PreparedStatement preparedStmt1 = dbcon.prepareStatement(query1);
				    preparedStmt1.setString(1, textField_4.getText());
				    
				    preparedStmt1.executeUpdate();
				    
				    String query2 = "update QuestionChoice2 set Detail = ? where QuestionChoice2 = 2";
				    PreparedStatement preparedStmt2 = dbcon.prepareStatement(query2);
				    preparedStmt2.setString(1, textField_5.getText());
				    
				    preparedStmt2.executeUpdate();
				 
				    String query3 = "update QuestionChoice2 set Detail = ? where QuestionChoice2 = 3";
				    PreparedStatement preparedStmt3 = dbcon.prepareStatement(query3);
				    preparedStmt3.setString(1, textField_6.getText());
				    
				    preparedStmt3.executeUpdate();
				    
				    String query4 = "update QuestionChoice2 set Detail = ? where QuestionChoice2 = 4";
				    PreparedStatement preparedStmt4 = dbcon.prepareStatement(query4);
				    preparedStmt4.setString(1, textField_7.getText());
				    
				    preparedStmt4.executeUpdate();
				    
				    
				    if (B1.isSelected()){
				    	
				    	String query5 = "update Answer set Detail = ? where idAnswer = 2";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_4.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (B2.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 2";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_5.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (B3.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 2";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_6.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (B4.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 2";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_7.getText());
					    preparedStmt5.executeUpdate();
				    }
				    
				    
					
				} catch (ClassNotFoundException | SQLException er) {
					// TODO Auto-generated catch block
					er.printStackTrace();
				}
			}
		});
		btnSave_3.setBounds(94, 372, 174, 43);
		EditQuestion2View.add(btnSave_3);
		
		JButton btnReturnToMenu = new JButton("Return to Menu");
		btnReturnToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherView.setVisible(true);
				EditQuestion1View.setVisible(false);
			}
		});
		btnReturnToMenu.setBounds(382, 372, 174, 43);
		EditQuestion1View.add(btnReturnToMenu);
		
		JButton btnSave_2 = new JButton("Save");
		btnSave_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Question 3 has been updated", 
						"Warning Message!", JOptionPane.WARNING_MESSAGE);
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String dburl = "jdbc:mysql://localhost:3306/questionschema";
					Connection dbcon = DriverManager.getConnection(dburl,"root","");
					
					String query = "update Question set Content = ? where idQuestion = 3";
				    PreparedStatement preparedStmt = dbcon.prepareStatement(query);
				    preparedStmt.setString(1, textPane_2.getText());
				    
				    preparedStmt.executeUpdate();
					
				    String query1 = "update QuestionChoice3 set Detail = ? where QuestionChoice3 = 1";
				    PreparedStatement preparedStmt1 = dbcon.prepareStatement(query1);
				    preparedStmt1.setString(1, textField_8.getText());
				    
				    preparedStmt1.executeUpdate();
				    
				    String query2 = "update QuestionChoice3 set Detail = ? where QuestionChoice3 = 2";
				    PreparedStatement preparedStmt2 = dbcon.prepareStatement(query2);
				    preparedStmt2.setString(1, textField_9.getText());
				    
				    preparedStmt2.executeUpdate();
				 
				    String query3 = "update QuestionChoice3 set Detail = ? where QuestionChoice3 = 3";
				    PreparedStatement preparedStmt3 = dbcon.prepareStatement(query3);
				    preparedStmt3.setString(1, textField_10.getText());
				    
				    preparedStmt3.executeUpdate();
				    
				    String query4 = "update QuestionChoice3 set Detail = ? where QuestionChoice3 = 4";
				    PreparedStatement preparedStmt4 = dbcon.prepareStatement(query4);
				    preparedStmt4.setString(1, textField_11.getText());
				    
				    preparedStmt4.executeUpdate();
				    
				    
				    if (C1.isSelected()){
				    	
				    	String query5 = "update Answer set Detail = ? where idAnswer = 3";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_8.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (C2.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 3";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_9.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (C3.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 3";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_10.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (C4.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 3";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_11.getText());
					    preparedStmt5.executeUpdate();
				    }
				    
				    
					
				} catch (ClassNotFoundException | SQLException er) {
					// TODO Auto-generated catch block
					er.printStackTrace();
				}
				
			}
		});
		btnSave_2.setBounds(94, 372, 174, 43);
		EditQuestion3View.add(btnSave_2);
		
		JButton btnSave_1 = new JButton("Save");
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Question 4 has been updated", 
						"Warning Message!", JOptionPane.WARNING_MESSAGE);
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String dburl = "jdbc:mysql://localhost:3306/questionschema";
					Connection dbcon = DriverManager.getConnection(dburl,"root","");
					
					String query = "update Question set Content = ? where idQuestion = 4";
				    PreparedStatement preparedStmt = dbcon.prepareStatement(query);
				    preparedStmt.setString(1, textPane_3.getText());
				    
				    preparedStmt.executeUpdate();
					
				    String query1 = "update QuestionChoice4 set Detail = ? where QuestionChoice4 = 1";
				    PreparedStatement preparedStmt1 = dbcon.prepareStatement(query1);
				    preparedStmt1.setString(1, textField_12.getText());
				    
				    preparedStmt1.executeUpdate();
				    
				    String query2 = "update QuestionChoice4 set Detail = ? where QuestionChoice4 = 2";
				    PreparedStatement preparedStmt2 = dbcon.prepareStatement(query2);
				    preparedStmt2.setString(1, textField_13.getText());
				    
				    preparedStmt2.executeUpdate();
				 
				    String query3 = "update QuestionChoice4 set Detail = ? where QuestionChoice4 = 3";
				    PreparedStatement preparedStmt3 = dbcon.prepareStatement(query3);
				    preparedStmt3.setString(1, textField_14.getText());
				    
				    preparedStmt3.executeUpdate();
				    
				    String query4 = "update QuestionChoice4 set Detail = ? where QuestionChoice4 = 4";
				    PreparedStatement preparedStmt4 = dbcon.prepareStatement(query4);
				    preparedStmt4.setString(1, textField_15.getText());
				    
				    preparedStmt4.executeUpdate();
				    
				    
				    if (D1.isSelected()){
				    	
				    	String query5 = "update Answer set Detail = ? where idAnswer = 4";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_12.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (D2.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 4";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_13.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (D3.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 4";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_14.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (D4.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 4";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_15.getText());
					    preparedStmt5.executeUpdate();
				    }
				    
				    
					
				} catch (ClassNotFoundException | SQLException er) {
					// TODO Auto-generated catch block
					er.printStackTrace();
				}
			}
		});
		btnSave_1.setBounds(94, 372, 174, 43);
		EditQuestion4View.add(btnSave_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Question 5 has been updated", 
						"Warning Message!", JOptionPane.WARNING_MESSAGE);

				try {
					Class.forName("com.mysql.jdbc.Driver");
					String dburl = "jdbc:mysql://localhost:3306/questionschema";
					Connection dbcon = DriverManager.getConnection(dburl,"root","");
					
					String query = "update Question set Content = ? where idQuestion = 5";
				    PreparedStatement preparedStmt = dbcon.prepareStatement(query);
				    preparedStmt.setString(1, textPane_4.getText());
				    
				    preparedStmt.executeUpdate();
					
				    String query1 = "update QuestionChoice5 set Detail = ? where QuestionChoice5 = 1";
				    PreparedStatement preparedStmt1 = dbcon.prepareStatement(query1);
				    preparedStmt1.setString(1, textField_16.getText());
				    
				    preparedStmt1.executeUpdate();
				    
				    String query2 = "update QuestionChoice5 set Detail = ? where QuestionChoice5 = 2";
				    PreparedStatement preparedStmt2 = dbcon.prepareStatement(query2);
				    preparedStmt2.setString(1, textField_17.getText());
				    
				    preparedStmt2.executeUpdate();
				 
				    String query3 = "update QuestionChoice5 set Detail = ? where QuestionChoice5 = 3";
				    PreparedStatement preparedStmt3 = dbcon.prepareStatement(query3);
				    preparedStmt3.setString(1, textField_18.getText());
				    
				    preparedStmt3.executeUpdate();
				    
				    String query4 = "update QuestionChoice5 set Detail = ? where QuestionChoice5 = 4";
				    PreparedStatement preparedStmt4 = dbcon.prepareStatement(query4);
				    preparedStmt4.setString(1, textField_19.getText());
				    
				    preparedStmt4.executeUpdate();
				    
				    
				    if (E1.isSelected()){
				    	
				    	String query5 = "update Answer set Detail = ? where idAnswer = 5";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_16.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (E2.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 5";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_17.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (E3.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 5";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_18.getText());
					    preparedStmt5.executeUpdate();
				    }
				    else if (E4.isSelected()){
				    	String query5 = "update Answer set Detail = ? where idAnswer = 5";
					    PreparedStatement preparedStmt5 = dbcon.prepareStatement(query5);
					    preparedStmt5.setString(1, textField_19.getText());
					    preparedStmt5.executeUpdate();
				    }
				    
				    
					
				} catch (ClassNotFoundException | SQLException er) {
					// TODO Auto-generated catch block
					er.printStackTrace();
				}
			}
		});
		btnSave.setBounds(94, 372, 174, 43);
		EditQuestion5View.add(btnSave);
		
		JOptionPane messagePane = new JOptionPane(
	            "RMI Server is starting\n Please wait...",
	            JOptionPane.INFORMATION_MESSAGE);
	      final JDialog dialog = messagePane.createDialog("");

	      new SwingWorker<Void, Void>() {

	         
	         protected Void doInBackground() throws Exception {
	        	 //Initial RMI 
	        	 try
					{
	        		 
	        		 	MarksCalculation objServer = new MarksCalculationImpl();
	        			Registry sreg = LocateRegistry.getRegistry(portNumber);
	        			sreg.bind("MarksCalculationService",objServer);
						System.out.println("RMI is running");
					}
	        	 catch(Exception e)
	     			{
	     				System.out.println(e);
	     			}
	        	 
	        	 
	        	
	        	 
	        	 
	            // do your background processing here
	            // for instance validate your board here

	            // mimics a background process that takes 3 seconds
	            // you would of course delete this in your actual progam
	            Thread.sleep(10000); 
				return null; 

	            
	         }

	         // this is called when background thread above has completed.
	         protected void done() {
	            dialog.dispose();
	         };
	      }.execute();

	      dialog.setVisible(true);

	      JOptionPane.showMessageDialog(messagePane, "RMI Server is online");
	      
	   // done RMI server
	      
	      
	   

	}
}
