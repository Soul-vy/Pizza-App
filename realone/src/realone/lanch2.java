package realone;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class lanch2 {
	
	
	JFrame frame;
	JButton button;
	JTextField text1;
	String name;
	JPanel panel;
	JLabel label;
	lanch2()
	{
		    // frame
		    frame = new JFrame("win4");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 300);
	        frame.setResizable(false);
	        frame.setLayout(null);
	        frame.getContentPane().setBackground(Color.red);
	        frame.setVisible(true);
	        
	        //label
	        label = new JLabel("welcome to bit-za");
	        label.setFont(new Font("Mv Boli",Font.PLAIN,30));
	        label.setBounds(10, 10, 300, 100);
	        label.setBackground(Color.red);
	        
	        //panel
	        panel=new JPanel();
	        panel.setBounds(75, 100, 150, 100);
	    	panel.setBackground(Color.red);
	        panel.setLayout(new GridLayout(3,1,10,0));
	        
	        //button
	        button=new JButton("submit");
	        button.setPreferredSize(new Dimension(50,50));
		    button.setFocusable(false);
			button.addActionListener(e -> dothis());
		    button.setForeground(Color.black);
		    button.setBackground(Color.white);
		    
		    // text field
		    text1=new JTextField("enter your name to check");
		    text1.setPreferredSize(new Dimension(100,50));
		    
            // add items
		    frame.add(panel);
		    frame.add(label);
		    panel.add(text1);
		    panel.add(button);
		 
		
		
	}
	void dothis()
	{
		 name=text1.getText();
		 new Datastorage(name);
		 frame.dispose();
 	 
	}

	
}
