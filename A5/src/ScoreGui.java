import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * Sefacan Agirbasli
 * CSC 200
 * Assignment 5 - Score Calculator
 */

public class ScoreGui extends JFrame implements ActionListener  {
	final int SIZE = 4;
	
	JButton button = new JButton("Calculate");
	JTextField []jtxtScore = new JTextField[SIZE];
	JTextField []jtxtWeight = new JTextField[SIZE];
	JLabel [] ModuleName = new JLabel[SIZE];
	JLabel output = new JLabel("0");
	JPanel panel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JFrame frame = new JFrame("Score Calculator");
	
	public ScoreGui() {
		
		ModuleName[0] = new JLabel("Assigments");
		ModuleName[1] = new JLabel("Midterm Exam");
		ModuleName[2] = new JLabel("Final Project");
		ModuleName[3] = new JLabel("Final Exam");
		
		panel.setBackground(Color.yellow);
		panel.setLayout(new GridLayout(4,3));
		
		for(int i=0; i<SIZE; i++) {
			panel.add(ModuleName[i]);
			jtxtScore[i] = new JTextField(5);
			panel.add(jtxtScore[i]);
			jtxtWeight[i] = new JTextField(5);
			panel.add(jtxtWeight[i]);
		}
		//button panel
		buttonPanel.setBackground(Color.blue);
		button.addActionListener(this);
		buttonPanel.add(button);
		add(panel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		buttonPanel.add(output);
		
		
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(250, 180));
	
}   // Transaction and output
	public void actionPerformed(ActionEvent e) {
		double AssigmentGrade = Double.parseDouble(jtxtScore[0].getText());
		double AssigmentWeight = Double.parseDouble(jtxtWeight[0].getText());
		double MidTermGrade = Double.parseDouble(jtxtScore[1].getText());
		double MidTermWeight = Double.parseDouble(jtxtWeight[1].getText());
		double ProjectGrade = Double.parseDouble(jtxtScore[2].getText());
		double ProjectWeight = Double.parseDouble(jtxtWeight[2].getText());
		double FinalExamGrade = Double.parseDouble(jtxtScore[3].getText());
		double FinalExamWeight = Double.parseDouble(jtxtWeight[3].getText());
		double grade = (AssigmentGrade*AssigmentWeight) + (MidTermGrade*MidTermWeight) + (ProjectGrade*ProjectWeight)
				+ (FinalExamGrade*FinalExamWeight);
	output.setText(String.valueOf(grade));
		
	}

}
