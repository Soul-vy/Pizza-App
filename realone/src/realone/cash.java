package realone;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class cash {
	
	JFrame frame ;
	JLabel label;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JLabel label6;
	JLabel label7;
	JPanel panel;
	JPanel panel1;
	JRadioButton paypal;
	JRadioButton visa;
	JRadioButton cash;
	JButton button ;
	//JButton buttongame ;
	ButtonGroup group; 
	ImageIcon image1;
	ImageIcon image2;
	ImageIcon image3;
	int rand1=(int)(Math.random()*100)+1;
	int rand2=(int)(Math.random()*21)+10;
    LocalDateTime now=  LocalDateTime.now();
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formatterDateTime= now.format(formatter);
	cash (String name,int total,String order)
	{
		
		    // frame
		    frame = new JFrame("win6");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 600);
	        frame.setResizable(false);
	        frame.setLayout(null);
	        frame.getContentPane().setBackground(Color.red);
	        frame.setVisible(true);
	        
	        //label
	        label = new JLabel("how do you want to pay");
	        label.setHorizontalAlignment(SwingConstants.CENTER);
	        label.setFont(new Font("Mv Boli",Font.PLAIN,30));
	        label.setBounds(0, 0, 600, 50);
	        label.setBackground(Color.red);
	        
	        label1 = new JLabel("  your total is "+total+"$");
	        //label1.setHorizontalAlignment(SwingConstants.CENTER);
	        label1.setFont(new Font("Mv Boli",Font.PLAIN,20));
	        label1.setForeground(Color.white);
	        label1.setBounds(0, 0, 200, 100);
	        label1.setBackground(Color.darkGray);
	        label1.setOpaque(true);
	        
	        label2 = new JLabel("<html><body style='width: 300px;'>"+order+"</body></html>");
	        //label2.setHorizontalAlignment(SwingConstants.CENTER);
	        label2.setFont(new Font("Mv Boli",Font.PLAIN,15));
	        label2.setForeground(Color.white);
	        label2.setBounds(200, 0, 500, 100);
	        label2.setBackground(Color.darkGray);
	        label2.setOpaque(true);
	        
	        label3 = new JLabel("  cashier :- ahmed emad");
	        //label2.setHorizontalAlignment(SwingConstants.CENTER);
	        label3.setFont(new Font("Mv Boli",Font.PLAIN,15));
	        label3.setForeground(Color.white);
	        label3.setBounds(250, 170, 300, 50);
	        label3.setBackground(Color.darkGray);
	        label3.setOpaque(true);
	        
	        label4 = new JLabel("  your table:- "+rand1);
	        label4.setFont(new Font("Mv Boli",Font.PLAIN,15));
	        label4.setForeground(Color.white);
	        label4.setBounds(250, 220, 300, 50);
	        label4.setBackground(Color.darkGray);
	        label4.setOpaque(true);
	        
	        label5 = new JLabel("  your order will take :- "+rand2+"mins");
	        label5.setFont(new Font("Mv Boli",Font.PLAIN,15));
	        label5.setForeground(Color.white);
	        label5.setBounds(250, 270, 300, 50);
	        label5.setBackground(Color.darkGray);
	        label5.setOpaque(true);
	        
	        label6= new JLabel();
	        label6.setBounds(210, 170, 20, 380);
	        label6.setBackground(Color.yellow);
	        label6.setOpaque(true);
	        
	        label7 = new JLabel("  start at  "+formatterDateTime);
	        label7.setFont(new Font("Mv Boli",Font.PLAIN,17));
	        label7.setForeground(Color.white);
	        label7.setBounds(250, 320, 300, 50);
	        label7.setBackground(Color.darkGray);
	        label7.setOpaque(true);
	        
	        // radio button
	        paypal=new JRadioButton("paypal");
	        image1= new ImageIcon("paypal.png");
	        paypal.setIcon(image1);
	        paypal.setBounds(10,10, 200, 100);
	        //paypal.addActionListener(e -> dothat());
	        paypal.setBackground(Color.red);
	        
	        visa=new JRadioButton("visa");
	        image2= new ImageIcon("visa.png");
	        visa.setIcon(image2);
	        visa.setBounds(10, 120, 200, 100);
	        //visa.addActionListener(e -> dothat());
	        visa.setBackground(Color.red);
	        
	        cash=new JRadioButton("cash");
	        image3= new ImageIcon("cash.png");
	        cash.setIcon(image3);
	        cash.setBounds(10, 230, 200, 100);
	        //cash.addActionListener(e -> dothat());
	        cash.setBackground(Color.red);
	        
	        //button
	        button=new JButton("submit");
		    button.setBounds(10,340,150,50);
		    button.setFocusable(false);
			button.addActionListener(e -> dothat());
			button.setForeground(Color.black);
			button.setBackground(Color.white);
			
			/*
			buttongame=new JButton("score for discount");
			buttongame.setBounds(325,500,150,50);
		    buttongame.setFocusable(false);
		    buttongame.addActionListener(e -> goforgames());
			buttongame.setForeground(Color.black);
		    buttongame.setBackground(Color.white);
		    */
	        
	        //panel
	        panel=new JPanel();
	        panel.setBounds(0, 50, 600, 100);
	    	panel.setBackground(Color.red);
	        panel.setLayout(null);
	        
	        panel1=new JPanel();
	        panel1.setBounds(0, 150, 300, 450);
	    	panel1.setBackground(Color.red);
	        panel1.setLayout(null);
	        
	        // add items
	        group=new ButtonGroup();
		    group.add(paypal);
		    group.add(visa);
		    group.add(cash);
	        frame.add(label);
	        frame.add(label3);
	        frame.add(label4);
	        frame.add(label5);
	        frame.add(label6);
	        frame.add(label7);
	        frame.add(panel);
	        frame.add(panel1);
	        //frame.add(buttongame);
	        panel.add(label1);
	        panel.add(label2);
	        panel1.add(paypal);
	        panel1.add(visa);
	        panel1.add(cash);
	        panel1.add(button);
		
	}
	void dothat()
	{
		 int y=JOptionPane.showConfirmDialog(null, "do you want to tip us ","plzz '_'", JOptionPane.YES_NO_CANCEL_OPTION);
		 if (y==0)
		 {
			 System.out.println("thank you ^o^");
		 }
		 else
		 {
			 System.out.println("okay -_-");
	     }
		 JOptionPane.showMessageDialog(null, "thank you for ordering from our restaurant", "your payment process completed", JOptionPane.PLAIN_MESSAGE); 
	}
	
	void goforgames()
	{
		 int y=JOptionPane.showConfirmDialog(null, "do you want to play game to take a discount for your next order ","$$$", JOptionPane.YES_NO_CANCEL_OPTION);
		 if (y==0)
		 {
		      // new gamelancher();
		       frame.dispose();
		 }
		 else
		 {
			 System.out.println("you hate discounts -_-");
	     }
		
	}

}
