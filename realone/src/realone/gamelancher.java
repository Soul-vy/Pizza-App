package realone;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class gamelancher {
	
	
	JFrame frame;
	JButton button;
	JButton button1;
  gamelancher()
  {
	    frame = new JFrame("win1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
      
        JButton button=new JButton("xo 1v1");
	    button.setFocusable(false);
	    button.setBounds(20,20,140,50);
		button.addActionListener(e -> dothis(1));
	    button.setForeground(Color.black);
	    button.setBackground(Color.white);
	    
	    JButton button1=new JButton("tetris");
	    button1.setFocusable(false);
	    button1.setBounds(20,90,140,50);
		button1.addActionListener(e -> dothis(2));
	    button1.setForeground(Color.black);
	    button1.setBackground(Color.white); 
	    
	    
	    frame.add(button);
	    frame.add(button1);
	    
  }
  void dothis(int x)
  {
	  
	  frame.dispose();
	  if (x==1)
	  new game1();
	  else 
		System.out.println("sorry this game is under establishing");  
  }

}
