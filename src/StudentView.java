import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.net.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.io.*;
import java.net.*;
import java.awt.Color;

import java.awt.Component;
import javax.swing.JTextArea;

public class StudentView {

	private JFrame frame;
	private JTextField textField;
	private JPanel panelStudentView;
	private JPanel StudentQuestion1View;
	private JPanel StudentQuestion2View;
	private JPanel StudentQuestion3View;
	private JPanel StudentQuestion4View;
	private JPanel StudentQuestion5View;
	private JPanel panelResultView;
	private JTextField textField_1;
	
	private String host="localhost";
	private int portNumber=1098;
	
	private double CalculateMarks=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					StudentView window = new StudentView();
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
	public StudentView() {
		initialize();
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 818, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel panelStudentView = new JPanel();
		panelStudentView.setBackground(Color.cyan);
		frame.getContentPane().add(panelStudentView, "name_1380359031015940");
		panelStudentView.setLayout(null);
		
		final JPanel StudentQuestion1View = new JPanel();
		StudentQuestion1View.setForeground(Color.BLACK);
		StudentQuestion1View.setBackground(Color.CYAN);
		frame.getContentPane().add(StudentQuestion1View, "name_1380362792810388");
		StudentQuestion1View.setLayout(null);
		
		final JPanel StudentQuestion2View = new JPanel();
		StudentQuestion2View.setBackground(Color.CYAN);
		StudentQuestion2View.setForeground(Color.BLACK);
		frame.getContentPane().add(StudentQuestion2View, "name_197868992389074");
		StudentQuestion2View.setLayout(null);
		
		final JPanel StudentQuestion3View = new JPanel();
		StudentQuestion3View.setBackground(Color.CYAN);
		StudentQuestion3View.setForeground(Color.BLACK);
		frame.getContentPane().add(StudentQuestion3View, "name_197879539123971");
		StudentQuestion3View.setLayout(null);
		
		final JPanel StudentQuestion4View = new JPanel();
		StudentQuestion4View.setBackground(Color.CYAN);
		StudentQuestion4View.setForeground(Color.BLACK);
		frame.getContentPane().add(StudentQuestion4View, "name_197888394868345");
		StudentQuestion4View.setLayout(null);
		
		final JPanel StudentQuestion5View = new JPanel();
		StudentQuestion5View.setBackground(Color.CYAN);
		StudentQuestion5View.setForeground(Color.BLACK);
		frame.getContentPane().add(StudentQuestion5View, "name_197978677673863");
		StudentQuestion5View.setLayout(null);
		
		final JPanel ResultView = new JPanel();
		ResultView.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(ResultView, "name_1380366411365982");
		ResultView.setLayout(null);
		
		JLabel YourScore = new JLabel("Your have scored");
		YourScore.setHorizontalAlignment(SwingConstants.CENTER);
		YourScore.setFont(new Font("Times New Roman", Font.BOLD, 41));
		YourScore.setBounds(114, 52, 427, 112);
		ResultView.add(YourScore);
		
		final JLabel StudentScore = new JLabel("");
		StudentScore.setHorizontalAlignment(SwingConstants.CENTER);
		StudentScore.setFont(new Font("Times New Roman", Font.BOLD, 41));
		StudentScore.setBounds(124, 166, 427, 112);
		ResultView.add(StudentScore);
		
		final JLabel label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 29));
		label_4.setBounds(124, 305, 427, 112);
		ResultView.add(label_4);
		
		JButton btnDownloadYourResult = new JButton("Download your Result");
		btnDownloadYourResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					//String name="rmi://"+""+"/"+textField.getText();
					Registry rc=LocateRegistry.getRegistry(host,portNumber);
					MarksCalculation fi=(MarksCalculation)rc.lookup("MarksCalculationService");				
					byte[]filedata=fi.downloadFile(textField.getText()+".txt");
					File file=new File(textField.getText()+".txt");
					BufferedOutputStream Output=new BufferedOutputStream(new FileOutputStream(file.getName()));
					Output.write(filedata,0,filedata.length);
					Output.flush();
					Output.close();
					JOptionPane.showMessageDialog(null, "Download successful", 
							"Message!", JOptionPane.WARNING_MESSAGE);
					
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnDownloadYourResult.setBackground(Color.RED);
		btnDownloadYourResult.setBounds(580, 403, 176, 31);
		ResultView.add(btnDownloadYourResult);
		
		
		final JLabel label = new JLabel("IQ TEST");
		label.setForeground(Color.RED);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Traditional Arabic", Font.BOLD, 43));
		label.setBounds(121, 23, 475, 93);
		panelStudentView.add(label);
		
		
		JLabel label_1 = new JLabel("Name :");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label_1.setBounds(93, 316, 111, 27);
		panelStudentView.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(188, 313, 342, 34);
		panelStudentView.add(textField);
		
		final JLabel Q1 = new JLabel("");
		Q1.setBounds(73, 53, 410, 52);
		StudentQuestion1View.add(Q1);
		
		final JLabel Q2 = new JLabel("");
		Q2.setBounds(73, 53, 410, 52);
		StudentQuestion2View.add(Q2);
		
		final JLabel Q3 = new JLabel("");
		Q3.setBounds(73, 53, 410, 52);
		StudentQuestion3View.add(Q3);
		
		final JLabel Q4 = new JLabel("");
		Q4.setBounds(73, 53, 410, 52);
		StudentQuestion4View.add(Q4);
		
		final JLabel Q5 = new JLabel("");
		Q5.setBounds(73, 53, 410, 52);
		StudentQuestion5View.add(Q5);
		
		final JRadioButton A1 = new JRadioButton("");
		A1.setBounds(111, 144, 242, 25);
		StudentQuestion1View.add(A1);
		
		final JRadioButton A2 = new JRadioButton("");
		A2.setBounds(111, 204, 242, 25);
		StudentQuestion1View.add(A2);
		
		final JRadioButton A3 = new JRadioButton("");
		A3.setBounds(111, 264, 242, 25);
		StudentQuestion1View.add(A3);
		
		final JRadioButton A4 = new JRadioButton("");
		A4.setBounds(111, 324, 242, 25);
		StudentQuestion1View.add(A4);
	
		final JRadioButton B1 = new JRadioButton("");
		B1.setBounds(111, 144, 242, 25);
		StudentQuestion2View.add(B1);
		
		final JRadioButton B2 = new JRadioButton("");
		B2.setBounds(111, 204, 242, 25);
		StudentQuestion2View.add(B2);
		
		final JRadioButton B3 = new JRadioButton("");
		B3.setBounds(111, 264, 242, 25);
		StudentQuestion2View.add(B3);
		
		final JRadioButton B4 = new JRadioButton("");
		B4.setBounds(111, 324, 242, 25);
		StudentQuestion2View.add(B4);
		
		final JRadioButton C1 = new JRadioButton("");
		C1.setBounds(111, 144, 242, 25);
		StudentQuestion3View.add(C1);
		
		final JRadioButton C2 = new JRadioButton("");
		C2.setBounds(111, 204, 242, 25);
		StudentQuestion3View.add(C2);
		
		final JRadioButton C3 = new JRadioButton("");
		C3.setBounds(111, 264, 242, 25);
		StudentQuestion3View.add(C3);
		
		final JRadioButton C4 = new JRadioButton("");
		C4.setBounds(111, 324, 242, 25);
		StudentQuestion3View.add(C4);
		
		final JRadioButton D1 = new JRadioButton("");
		D1.setBounds(111, 144, 242, 25);
		StudentQuestion4View.add(D1);
		
		final JRadioButton D2 = new JRadioButton("");
		D2.setBounds(111, 204, 242, 25);
		StudentQuestion4View.add(D2);
		
		final JRadioButton D3 = new JRadioButton("");
		D3.setBounds(111, 264, 242, 25);
		StudentQuestion4View.add(D3);
		
		final JRadioButton D4 = new JRadioButton("");
		D4.setBounds(111, 324, 242, 25);
		StudentQuestion4View.add(D4);
		
		final JRadioButton E1 = new JRadioButton("");
		E1.setBounds(111, 144, 242, 25);
		StudentQuestion5View.add(E1);
		
		final JRadioButton E2 = new JRadioButton("");
		E2.setBounds(111, 204, 242, 25);
		StudentQuestion5View.add(E2);
		
		final JRadioButton E3 = new JRadioButton("");
		E3.setBounds(111, 264, 242, 25);
		StudentQuestion5View.add(E3);
		
		final JRadioButton E4 = new JRadioButton("");
		E4.setBounds(111, 324, 242, 25);
		StudentQuestion5View.add(E4);
		

		
		JButton button = new JButton("START");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					
					
					String name = textField.getText();
					String email = textField_1.getText();

					
					Registry creg=LocateRegistry.getRegistry(host,portNumber);
					MarksCalculation cstub =(MarksCalculation)creg.lookup("MarksCalculationService");
					
					ArrayList <String> Question=cstub.Question (name);
					
					Q1.setText(Question.get(0));
					A1.setText(Question.get(5));
					A2.setText(Question.get(6));
					A3.setText(Question.get(7));
					A4.setText(Question.get(8));
					
					Q2.setText(Question.get(1));
					B1.setText(Question.get(9));
					B2.setText(Question.get(10));
					B3.setText(Question.get(11));
					B4.setText(Question.get(12));
					
					Q3.setText(Question.get(2));
					C1.setText(Question.get(13));
					C2.setText(Question.get(14));
					C3.setText(Question.get(15));
					C4.setText(Question.get(16));
					
					Q4.setText(Question.get(3));
					D1.setText(Question.get(17));
					D2.setText(Question.get(18));
					D3.setText(Question.get(19));
					D4.setText(Question.get(20));
					
					Q5.setText(Question.get(4));
					E1.setText(Question.get(21));
					E2.setText(Question.get(22));
					E3.setText(Question.get(23));
					E4.setText(Question.get(24));
					

					//display to the console
					
					StudentQuestion1View.setVisible(true);
					panelStudentView.setVisible(false);
				}
				catch (IOException ioerr)
				{
					System.out.println("I/O error : " + ioerr);
				}
				catch(Exception err)
				{
					System.out.println("Error : " + err);
				}
				
				
				
				
				
				
			}
		});
		button.setBounds(433, 404, 97, 34);
		panelStudentView.add(button);
		
		JLabel label_6 = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("login.png")).getImage();
		
		label_6.setIcon(new ImageIcon(img));
		label_6.setBounds(557, 127, 231, 256);
		panelStudentView.add(label_6);
		
		JLabel lblH = new JLabel("Welcome to this IQ Test, you have answer");
		lblH.setToolTipText("");
		lblH.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblH.setBounds(33, 103, 563, 51);
		panelStudentView.add(lblH);
		
		JLabel lblYouWillSee = new JLabel("will appear.");
		lblYouWillSee.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblYouWillSee.setBounds(33, 185, 209, 34);
		panelStudentView.add(lblYouWillSee);
		
		JLabel lblNewLabel = new JLabel("all the 5 questions, then your IQ level");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(33, 141, 545, 52);
		panelStudentView.add(lblNewLabel);
		
		JLabel lblPleaseEnterYour = new JLabel("Please enter your name before you start: ");
		lblPleaseEnterYour.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPleaseEnterYour.setBounds(121, 270, 370, 16);
		panelStudentView.add(lblPleaseEnterYour);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 356, 342, 34);
		panelStudentView.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("email :");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblEmail.setBounds(93, 365, 56, 16);
		panelStudentView.add(lblEmail);
		
		
		
		JButton button_1 = new JButton("1");
		button_1.setBackground(Color.PINK);
		button_1.setBounds(540, 84, 97, 44);
		StudentQuestion1View.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion2View.setVisible(true);
				StudentQuestion1View.setVisible(false);
			}
		});
		button_2.setBounds(540, 144, 97, 44);
		StudentQuestion1View.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion3View.setVisible(true);
				StudentQuestion1View.setVisible(false);
			}
		});
		button_3.setBounds(540, 204, 97, 44);
		StudentQuestion1View.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion4View.setVisible(true);
				StudentQuestion1View.setVisible(false);
			}
		});
		button_4.setBounds(540, 264, 97, 44);
		StudentQuestion1View.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion5View.setVisible(true);
				StudentQuestion1View.setVisible(false);
			}
		});
		button_5.setBounds(540, 324, 97, 44);
		StudentQuestion1View.add(button_5);
		
		
		
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
        
        
		JLabel label_3 = new JLabel("Question");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_3.setBounds(540, 39, 97, 32);
		StudentQuestion1View.add(label_3);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion2View.setVisible(true);
				StudentQuestion1View.setVisible(false);
			}
		});
		btnNext.setBounds(271, 382, 97, 43);
		StudentQuestion1View.add(btnNext);
		
		
		
		
		
		
		JButton button_6 = new JButton("1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion1View.setVisible(true);
				StudentQuestion2View.setVisible(false);
			}
		});
		button_6.setBounds(540, 84, 97, 44);
		StudentQuestion2View.add(button_6);
		
		JButton button_8 = new JButton("2");
		button_8.setBackground(Color.PINK);
		button_8.setBounds(540, 144, 97, 44);
		StudentQuestion2View.add(button_8);
		
		JButton button_9 = new JButton("3");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion3View.setVisible(true);
				StudentQuestion2View.setVisible(false);
			}
		});
		button_9.setBounds(540, 204, 97, 44);
		StudentQuestion2View.add(button_9);
		
		JButton button_10 = new JButton("4");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion4View.setVisible(true);
				StudentQuestion2View.setVisible(false);
			}
		});
		button_10.setBounds(540, 264, 97, 44);
		StudentQuestion2View.add(button_10);
		
		JButton button_11 = new JButton("5");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion5View.setVisible(true);
				StudentQuestion2View.setVisible(false);
			}
		});
		button_11.setBounds(540, 324, 97, 44);
		StudentQuestion2View.add(button_11);
		
		JLabel label_5 = new JLabel("Question");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_5.setBounds(540, 39, 97, 32);
		StudentQuestion2View.add(label_5);
		
		JButton btnNext_1 = new JButton("Next");
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion3View.setVisible(true);
				StudentQuestion2View.setVisible(false);
			}
		});
		btnNext_1.setBounds(271, 382, 97, 43);
		StudentQuestion2View.add(btnNext_1);
		
		
		
		
		
		JButton button_13 = new JButton("1");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion1View.setVisible(true);
				StudentQuestion3View.setVisible(false);
			}
		});
		button_13.setBounds(540, 84, 97, 44);
		StudentQuestion3View.add(button_13);
		
		JButton button_14 = new JButton("2");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion2View.setVisible(true);
				StudentQuestion3View.setVisible(false);
			}
		});
		button_14.setBounds(540, 144, 97, 44);
		StudentQuestion3View.add(button_14);
		
		JButton button_15 = new JButton("3");
		button_15.setBackground(Color.PINK);
		button_15.setBounds(540, 204, 97, 44);
		StudentQuestion3View.add(button_15);
		
		JButton button_16 = new JButton("4");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion4View.setVisible(true);
				StudentQuestion3View.setVisible(false);
			}
		});
		button_16.setBounds(540, 264, 97, 44);
		StudentQuestion3View.add(button_16);
		
		JButton button_17 = new JButton("5");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion5View.setVisible(true);
				StudentQuestion3View.setVisible(false);
			}
		});
		button_17.setBounds(540, 324, 97, 44);
		StudentQuestion3View.add(button_17);
		
		JLabel label_7 = new JLabel("Question");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_7.setBounds(540, 39, 97, 32);
		StudentQuestion3View.add(label_7);
		
		JButton button_7 = new JButton("Next");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion4View.setVisible(true);
				StudentQuestion3View.setVisible(false);
			}
		});
		button_7.setBounds(271, 382, 97, 43);
		StudentQuestion3View.add(button_7);
		
		
		
		
		
		
		JButton button_19 = new JButton("1");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion1View.setVisible(true);
				StudentQuestion4View.setVisible(false);
			}
		});
		button_19.setBounds(540, 84, 97, 44);
		StudentQuestion4View.add(button_19);
		
		JButton button_20 = new JButton("2");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion2View.setVisible(true);
				StudentQuestion4View.setVisible(false);
			}
		});
		button_20.setBounds(540, 144, 97, 44);
		StudentQuestion4View.add(button_20);
		
		JButton button_21 = new JButton("3");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion3View.setVisible(true);
				StudentQuestion4View.setVisible(false);
			}
		});
		button_21.setBounds(540, 204, 97, 44);
		StudentQuestion4View.add(button_21);
		
		JButton button_22 = new JButton("4");
		button_22.setBackground(Color.PINK);
		button_22.setBounds(540, 264, 97, 44);
		StudentQuestion4View.add(button_22);
		
		JButton button_23 = new JButton("5");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion5View.setVisible(true);
				StudentQuestion4View.setVisible(false);
			}
		});
		button_23.setBounds(540, 324, 97, 44);
		StudentQuestion4View.add(button_23);
		
		JLabel label_9 = new JLabel("Question");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_9.setBounds(540, 39, 97, 32);
		StudentQuestion4View.add(label_9);
		
		JButton button_12 = new JButton("Next");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion5View.setVisible(true);
				StudentQuestion4View.setVisible(false);
			}
		});
		button_12.setBounds(271, 382, 97, 43);
		StudentQuestion4View.add(button_12);
		
		
		
		
		
		
		JButton button_25 = new JButton("1");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion1View.setVisible(true);
				StudentQuestion5View.setVisible(false);
			}
		});
		button_25.setBounds(540, 84, 97, 44);
		StudentQuestion5View.add(button_25);
		
		JButton button_26 = new JButton("2");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion2View.setVisible(true);
				StudentQuestion5View.setVisible(false);
			}
		});
		button_26.setBounds(540, 144, 97, 44);
		StudentQuestion5View.add(button_26);
		
		JButton button_27 = new JButton("3");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion3View.setVisible(true);
				StudentQuestion5View.setVisible(false);
			}
		});
		button_27.setBounds(540, 204, 97, 44);
		StudentQuestion5View.add(button_27);
		
		JButton button_28 = new JButton("4");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentQuestion4View.setVisible(true);
				StudentQuestion5View.setVisible(false);
			}
		});
		button_28.setBounds(540, 264, 97, 44);
		StudentQuestion5View.add(button_28);
		
		JButton button_29 = new JButton("5");
		button_29.setBackground(Color.PINK);
		button_29.setBounds(540, 324, 97, 44);
		StudentQuestion5View.add(button_29);
		
		JLabel label_11 = new JLabel("Question");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_11.setBounds(540, 39, 97, 32);
		StudentQuestion5View.add(label_11);
		
		JButton button_30 = new JButton("Submit");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int action=JOptionPane.showConfirmDialog(null, "Do you really want to submit","Ok",JOptionPane.YES_NO_OPTION);
				
				if (action==0){
				try
				{
					String StudentA1 = "";
     				String StudentA2 = "";
     				String StudentA3 = "";
     				String StudentA4 = "";
     				String StudentA5 = "";
     				
     				if(A1.isSelected())
     					StudentA1 = A1.getText();
     				else if (A2.isSelected())
     					StudentA1 = A2.getText();
     				else if (A3.isSelected())
     					StudentA1 = A3.getText();
     				else if (A4.isSelected())
     					StudentA1 = A4.getText();
     				
     				if(B1.isSelected())
     					StudentA2 = B1.getText();
     				else if (B2.isSelected())
     					StudentA2 = B2.getText();
     				else if (B3.isSelected())
     					StudentA2 = B3.getText();
     				else if (B4.isSelected())
     					StudentA2 = B4.getText();
     				
     				if(C1.isSelected())
     					StudentA3 = C1.getText();
     				else if (C2.isSelected())
     					StudentA3 = C2.getText();
     				else if (C3.isSelected())
     					StudentA3 = C3.getText();
     				else if (C4.isSelected())
     					StudentA3 = C4.getText();
     				
     				if(D1.isSelected())
     					StudentA4 = D1.getText();
     				else if (D2.isSelected())
     					StudentA4 = D2.getText();
     				else if (D3.isSelected())
     					StudentA4 = D3.getText();
     				else if (D4.isSelected())
     					StudentA4 = D4.getText();
     				
     				if(E1.isSelected())
     					StudentA5 = E1.getText();
     				else if (E2.isSelected())
     					StudentA5 = E2.getText();
     				else if (E3.isSelected())
     					StudentA5 = E3.getText();
     				else if (E4.isSelected())
     					StudentA5 = E4.getText();
     				
     				
					
					ArrayList <String> StudentAnswer = new ArrayList<>();
					StudentAnswer.add(StudentA1);
					StudentAnswer.add(StudentA2);
					StudentAnswer.add(StudentA3);
					StudentAnswer.add(StudentA4);
					StudentAnswer.add(StudentA5);
					StudentAnswer.add(textField.getText());
					StudentAnswer.add(textField_1.getText());
					
					
					Registry creg=LocateRegistry.getRegistry(host,portNumber);
					MarksCalculation cstub =(MarksCalculation)creg.lookup("MarksCalculationService");
					
					CalculateMarks=cstub.CalculateMarks(StudentAnswer);

					
					System.out.println("Score : " + CalculateMarks);

					StudentScore.setText(String.format("%.2f", CalculateMarks)+"%");
					
					double correct = CalculateMarks / 20;
					label_4.setText("Total " + String.format("%.0f", correct) + " question that is correct.");

					ResultView.setVisible(true);
					StudentQuestion5View.setVisible(false);
					
				}
				catch (IOException ioerr)
				{
					System.out.println("I/O error : " + ioerr);
				}
				catch(Exception err)
				{
					System.out.println("Error : " + err);
				}
				
				}
				
			}
		});
		button_30.setBounds(271, 382, 97, 43);
		StudentQuestion5View.add(button_30);
		
		
		
		
	}
}
