package calculator;

import java.awt.event.*;
import javax.swing.*;

public class GUICalculator implements ActionListener{

	JTextField screen;

	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, add,sub, mul, div, eq, clr;
	Double a,b, result;
	int c=0; int operator;
	
	GUICalculator()

	{

	JFrame frame = new JFrame("My Calculator");
	frame.setSize(400,400);
	JPanel panel = new JPanel();
	panel.setLayout(null);
	
	screen = new JTextField();
	screen.setBounds(100,100,200,30);
	b0=new JButton("0");
	b1=new JButton("1");
	b2=new JButton("2");
	b3=new JButton("3");
	b4=new JButton("4");
	b5=new JButton("5");
	b6=new JButton("6");
	b7=new JButton("7");
	b8=new JButton("8");
	b9=new JButton("9");
	
	add=new JButton("+");
	sub=new JButton("-");
	mul=new JButton("*");
	div=new JButton("/");
	eq=new JButton("=");
	clr=new JButton("C");

	b1.setBounds(100,140,50,30);
	b2.setBounds(150,140,50,30);
	b3.setBounds(200,140,50,30);
	b4.setBounds(100,180,50,30);
	b5.setBounds(150,180,50,30);
	b6.setBounds(200,180,50,30);
	b7.setBounds(100,220,50,30);
	b8.setBounds(150,220,50,30);
	b9.setBounds(200,220,50,30);
	b0.setBounds(100,260,50,30);
	
	add.setBounds(250,140,50,30);
	sub.setBounds(250,180,50,30);
	mul.setBounds(250,220,50,30);
	div.setBounds(250,260,50,30);
	eq.setBounds(200,260,50,30);
	clr.setBounds(150,260,50,30);

	panel.add(screen);
	panel.add(b0);
	panel.add(b1);
	panel.add(b2);
	panel.add(b3);
	panel.add(b4);
	panel.add(b5);
	panel.add(b6);
	panel.add(b7);
	panel.add(b8);
	panel.add(b9);
	
	panel.add(add);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	panel.add(eq);
	panel.add(clr);
	
	frame.add(panel);
	
	b0.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	
	add.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	eq.addActionListener(this);
	clr.addActionListener(this);

	frame.setVisible(true);
	frame.setResizable(false);
	}
	
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == b0) screen.setText(screen.getText() + "0");
	    if (e.getSource() == b1) screen.setText(screen.getText() + "1");
	    if (e.getSource() == b2) screen.setText(screen.getText() + "2");
	    if (e.getSource() == b3) screen.setText(screen.getText() + "3");
	    if (e.getSource() == b4) screen.setText(screen.getText() + "4");
	    if (e.getSource() == b5) screen.setText(screen.getText() + "5");
	    if (e.getSource() == b6) screen.setText(screen.getText() + "6");
	    if (e.getSource() == b7) screen.setText(screen.getText() + "7");
	    if (e.getSource() == b8) screen.setText(screen.getText() + "8");
	    if (e.getSource() == b9) screen.setText(screen.getText() + "9");

	    // Perform operations
	    if (e.getSource() == add) {
	        a = Double.parseDouble(screen.getText());
	        operator = 1; // Addition
	        screen.setText("");
	    } else if (e.getSource() == sub) {
	        a = Double.parseDouble(screen.getText());
	        operator = 2; // Subtraction
	        screen.setText("");
	    } else if (e.getSource() == mul) {
	        a = Double.parseDouble(screen.getText());
	        operator = 3; // Multiplication
	        screen.setText("");
	    } else if (e.getSource() == div) {
	        a = Double.parseDouble(screen.getText());
	        operator = 4; // Division
	        screen.setText("");
	    }
	    else if (e.getSource() == clr) {
	    	screen.setText("");
	    }

	    // Calculate and display the result
	    else if (e.getSource() == eq) {
	        b = Double.parseDouble(screen.getText());

	        try {
	            switch (operator) {
	                case 1: result = a + b; break;
	                case 2: result = a - b; break;
	                case 3: result = a * b; break;
	                case 4:
	                    if (b != 0) {
	                        result = a / b;
	                    } else {
	                    	screen.setText("Error: Divide by zero");
	                        return;
	                    }
	                    break;
	            }
	            screen.setText(String.valueOf(result)); // Display result
	        } catch (Exception c) {
	            System.out.println(c.getMessage());
	        }
	    }
	}


	public static void main(String[] args) {
		new GUICalculator();
	}
}