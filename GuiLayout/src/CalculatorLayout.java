import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CalculatorLayout extends JFrame implements ActionListener {
	final int SIZE = 4;
	JTextField [] txtNumber = new JTextField[SIZE];
	JLabel output = new JLabel("0");
	JLabel label = new JLabel("Enter four numbers");
	JButton button = new JButton("Calculate");
	JButton button2 = new JButton("ButtonForFlowLayout!");
	JPanel panel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JPanel labelPanel = new JPanel();
	public CalculatorLayout() {
		
		
		//panels
		add(panel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		add(labelPanel, BorderLayout.NORTH);
		buttonPanel.setBackground(Color.GRAY);
		panel.setBackground(Color.BLACK);
		labelPanel.setBackground(Color.GRAY);
		panel.setLayout(new GridLayout(2,2));
		
		button.addActionListener(this);
		buttonPanel.add(output);
		labelPanel.add(label);
		setLayout(new FlowLayout());
		buttonPanel.add(button);
		buttonPanel.add(button2);
		
	txtNumber[0] = new JTextField(5);
	txtNumber[1] = new JTextField(5);
	txtNumber[2] = new JTextField(5);
	txtNumber[3] = new JTextField(5);
	
	for (int i=0; i<SIZE; i++) {
		panel.add(txtNumber[i]);
	}
		
		
		//frame
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(250, 250));
		
		
		
		
	}public void actionPerformed(ActionEvent e) {
		double number1 = Double.parseDouble(txtNumber[0].getText());
		double number2 = Double.parseDouble(txtNumber[1].getText());
		double number3 = Double.parseDouble(txtNumber[2].getText());
		double number4 = Double.parseDouble(txtNumber[3].getText());
		double result = number1 + number2 + number3 + number4;
		output.setText(String.valueOf(result));
	}

}
