import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class GuiSortNum implements ActionListener   {
      private JFrame frame;
      private int [] numList= new int [10];
      private JPanel panel;
      private JTextField [] TextField = new JTextField[10];
      
      private JLabel label1;
      private JLabel output;
      private JLabel output1;
      private JLabel output2;
      private JLabel output3;
      private JLabel output4;
      private JLabel output5;
      private JLabel output6;
      private JLabel output7;
      private JLabel output8;
      private JLabel output9;
      private JButton button;
      
      public GuiSortNum () {
    	  frame = new JFrame ();
    	  frame.setSize(new Dimension(600,150));
    	 
    	  TextField[0]= new JTextField(5);
    	  TextField[1]= new JTextField(5);
    	  TextField[2]= new JTextField(5);
    	  TextField[3]= new JTextField(5);
    	  TextField[4]= new JTextField(5);
    	  TextField[5]= new JTextField(5);
    	  TextField[6]= new JTextField(5);
    	  TextField[7]= new JTextField(5);
    	  TextField[8]= new JTextField(5);
    	  TextField[9]= new JTextField(5);
    	  
    	  panel= new JPanel();
    	  panel.setLayout(new GridLayout(5,10));
    	  panel.setBackground(Color.GRAY);
    	  label1 = new JLabel();
    	  label1.setText("Enter 10 numbers");
    	  panel.add(label1);
    	  panel.add(TextField[0]);
    	  panel.add(TextField[1]);
    	  panel.add(TextField[2]);
    	  panel.add(TextField[3]);
    	  panel.add(TextField[4]);
    	  panel.add(TextField[5]);
    	  panel.add(TextField[6]);
    	  panel.add(TextField[7]);
    	  panel.add(TextField[8]);
    	  panel.add(TextField[9]);
    	  
    	  button = new JButton("Sort");
    	  button.addActionListener(this);
    	  
    	  panel.add(button);
    	  output = new JLabel();
    	  output.setText("-");
    	  output1 = new JLabel();
    	  output1.setText("-");
    	  output2 = new JLabel();
    	  output2.setText("-");
    	  output3 = new JLabel();
    	  output3.setText("-");
    	  output4 = new JLabel();
    	  output4.setText("-");
    	  output5 = new JLabel();
    	  output5.setText("-");
    	  output6 = new JLabel();
    	  output6.setText("-");
    	  output7 = new JLabel();
    	  output7.setText("-");
    	  output8 = new JLabel();
    	  output8.setText("-");
    	  output9 = new JLabel();
    	  output9.setText("-");
    	  
    	  panel.add(output);
    	  panel.add(output1);
    	  panel.add(output2);
    	  panel.add(output3);
    	  panel.add(output4);
    	  panel.add(output5);
    	  panel.add(output6);
    	  panel.add(output7);
    	  panel.add(output8);
    	  panel.add(output9);
    	  
    	  frame.add(panel);
    	  frame.setVisible(true);
    	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      private static void swap(int[] numList, int i, int j) {
    	  int temp=numList[i];
    	  numList[i]=numList[j];
    	  numList[j]=temp;}
      public void actionPerformed(ActionEvent e) {
    	  for(int i=0; i<TextField.length;i++)
    		  numList[i]=Integer.parseInt(TextField[i].getText());
    	  for(int i=0; i<TextField.length;i++)
    		  for(int j=0;  j<TextField.length;j++)
    			  if(numList[j]>numList[i])
    				  swap(numList,i,j);
    	  output.setText(String.valueOf(numList[0]));
    	  output1.setText(String.valueOf(numList[1]));
    	  output2.setText(String.valueOf(numList[2]));
    	  output3.setText(String.valueOf(numList[3]));
    	  output4.setText(String.valueOf(numList[4]));
    	  output5.setText(String.valueOf(numList[5]));
    	  output6.setText(String.valueOf(numList[6]));
    	  output7.setText(String.valueOf(numList[7]));
    	  output8.setText(String.valueOf(numList[8]));
    	  output9.setText(String.valueOf(numList[9]));
      }
         public static void main(String[] args)
         {   new GuiSortNum(); }
   }
      