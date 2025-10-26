package realone;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class order {
	
	
	
	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    JPanel panel;
    JLabel label;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JRadioButton chicken;
    JRadioButton beef;
    JRadioButton fish;
    JRadioButton thin;
    JRadioButton stuffed;
    JRadioButton deep;
    JRadioButton mozzarella;
    JRadioButton cheddar;
    JRadioButton bluecheese;
    JRadioButton chilipeper;
    JRadioButton onion;
    JRadioButton olive;
    JButton button;
    JPanel panelbutton;
    JComboBox combo1;
    JComboBox combo2;
    static int total;
    static String order="your order is:- ";
    static int z=0;
    int y=0;
    String name;
    String num;
	order(String name,String num,String order)
	{
		    this.name=name;
		    this.num=num;
	        //frame
		    frame = new JFrame("win5");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(800, 600);
	        frame.setResizable(false);
	        frame.setLayout(null);
	        frame.getContentPane().setBackground(Color.red);
	        frame.setVisible(true);
	        
	        //label
	        label = new JLabel("welcome "+name+" you can customize your pizza ");
	        label.setHorizontalAlignment(SwingConstants.CENTER);
	        label.setFont(new Font("Mv Boli",Font.PLAIN,30));
	        label.setBounds(0, 0, 800, 50);
	        label.setBackground(Color.white);
	        
	        label1 = new JLabel("protien");
	        label1.setHorizontalAlignment(SwingConstants.CENTER);
	        label1.setFont(new Font("Mv Boli",Font.PLAIN,20));
	        label1.setBounds(0, 50, 200, 50);
	        label1.setBackground(Color.red);
	        
	        label2 = new JLabel("crust");
	        label2.setHorizontalAlignment(SwingConstants.CENTER);
	        label2.setFont(new Font("Mv Boli",Font.PLAIN,20));
	        label2.setBounds(200, 50, 200, 50);
	        label2.setBackground(Color.orange); 
	        
	        label3 = new JLabel("cheese");
	    	label3.setHorizontalAlignment(SwingConstants.CENTER);
	        label3.setFont(new Font("Mv Boli",Font.PLAIN,20));
	        label3.setBounds(400, 50, 200, 50);
	        label3.setBackground(Color.yellow);   
	        
	        label4 = new JLabel("veggie");
	        label4.setHorizontalAlignment(SwingConstants.CENTER);
	        label4.setFont(new Font("Mv Boli",Font.PLAIN,20));
	        label4.setBounds(600, 50, 200, 50);
	        label4.setBackground(Color.green);
	        
	        label5 = new JLabel("you can add--->");
	        label5.setHorizontalAlignment(SwingConstants.CENTER);
	        label5.setFont(new Font("Consolas",Font.PLAIN,20));
	        label5.setBounds(200, 10, 200, 50);
	        label5.setBackground(Color.white);

            //panel & radio buttons
	        panelbutton=new JPanel();
	        panelbutton.setLayout(null);
		    panelbutton.setBounds(0, 500, 800, 100);
			panelbutton.setBackground(Color.white);
	        panel1=new JPanel(); //protein
	        chicken=new JRadioButton("chicken");
	        chicken.addActionListener(e -> dothat());
	        chicken.setBackground(Color.red);
		    beef=new JRadioButton("beef");
		    beef.setBackground(Color.red);
		    beef.addActionListener(e -> dothat());
		    fish=new JRadioButton("fish");
		    fish.setBackground(Color.red);
		    fish.addActionListener(e -> dothat());
		    panel2=new JPanel(); //crust
		    thin=new JRadioButton("thin");
		    thin.addActionListener(e -> dothat());
		    thin.setBackground(Color.yellow);
		    stuffed=new JRadioButton("stuffed");
		    stuffed.addActionListener(e -> dothat());
		    stuffed.setBackground(Color.yellow);
		    deep=new JRadioButton("deep");
		    deep.addActionListener(e -> dothat());
		    deep.setBackground(Color.yellow);
		    panel3=new JPanel(); //cheese
            mozzarella=new JRadioButton("mozzarella");
            mozzarella.addActionListener(e -> dothat());
            mozzarella.setBackground(Color.orange);
            cheddar=new JRadioButton("Cheddar");
            cheddar.addActionListener(e -> dothat());
            cheddar.setBackground(Color.orange);
            bluecheese=new JRadioButton("Bluecheese");
            bluecheese.addActionListener(e -> dothat());
            bluecheese.setBackground(Color.orange);
			panel4=new JPanel(); //top
			chilipeper=new JRadioButton("chili peper");
			chilipeper.addActionListener(e -> dothat());
			chilipeper.setBackground(Color.green);
		    onion=new JRadioButton("onion");
		    onion.addActionListener(e -> dothat());
			onion.setBackground(Color.green);
			olive=new JRadioButton("olive");
			olive.addActionListener(e -> dothat());
			olive.setBackground(Color.green);
			panel5=new JPanel(); // group
			panel=new JPanel(); //welcome
		    panel5.setLayout(new GridLayout(1,4,0,0));
		    panel.setLayout(null);
		    panel5.setBounds(0, 100, 800, 400);
		    panel.setBounds(0, 0, 800, 100);
			panel.setBackground(Color.white);
			panel1.setBackground(Color.red);
			panel1.setLayout(new GridLayout(3,1,10,10));
			panel2.setBackground(Color.yellow);
			panel2.setLayout(new GridLayout(3,1,10,10));
			panel3.setBackground(Color.orange);
			panel3.setLayout(new GridLayout(3,1,10,10));
			panel4.setBackground(Color.green);
			panel4.setLayout(new GridLayout(3,1,10,10));
			panel5.setBackground(Color.white);
			
			// buttons
		    button=new JButton("submit");
		    button.setBounds(50,10,100,50);
		    button.setFocusable(false);
		    button.addActionListener(e -> dothis());
			button.setForeground(Color.black);
			button.setBackground(Color.white);
			
			String[] drink= {"lemon juice","soda","water"};
			combo1=new JComboBox(drink);
			combo1.setBounds(400,10,150,50);
			combo1.addActionListener(e -> then());
			String[] extra= {"extra sauce","extra cheese","extra toppings"};
			combo2=new JComboBox(extra);
			combo2.setBounds(600,10,150,50);
		    combo2.addActionListener(e -> then());
			
			// add items
			panel5.add(panel1);
			panel5.add(panel2);
			panel5.add(panel3);
			panel5.add(panel4);
			panel.add(label);
			panel.add(label1);
			panel.add(label2);
			panel.add(label3);
			panel.add(label4);
			frame.add(panel);
			frame.add(panel5);
			frame.add(panelbutton);
			panel1.add(chicken);
			panel1.add(beef);
			panel1.add(fish);
			panel2.add(thin);
			panel2.add(stuffed);
			panel2.add(deep);
			panel3.add(mozzarella);
			panel3.add(cheddar);
			panel3.add(bluecheese);
			panel4.add(chilipeper);
			panel4.add(onion);
			panel4.add(olive);
			panelbutton.add(button);
			panelbutton.add(combo1);
			panelbutton.add(combo2);
			panelbutton.add(label5);
			
			
	      
	}
	void dothat()
	{
		 /*chicken.addActionListener(e -> dothat());
		 beef.addActionListener(e -> dothat());
		 fish.addActionListener(e -> dothat());
		 thin.addActionListener(e -> dothat());
		 stuffed.addActionListener(e -> dothat());
		 deep.addActionListener(e -> dothat());
		 mozzarella.addActionListener(e -> dothat());
		 cheddar.addActionListener(e -> dothat());
		 bluecheese.addActionListener(e -> dothat());
		 chilipeper.addActionListener(e -> dothat());
		 onion.addActionListener(e -> dothat());
		 olive.addActionListener(e -> dothat());
		 */
		// System.out.println("hi");
		 
	}
	void dothis()
	{   
		
		    if (chicken.isSelected()) {
		         total+=5;
		         order+="chicken,";
		         total++;
		    }
		    if (beef.isSelected()) {
		         total+=6;
		         order+="beef,";
		    }
		    if (fish.isSelected()) {
		    	 total+=9;
		    	 order+="fish,";
		    }
		    if (thin.isSelected()) {
		    	 total+=3;  
		    	 order+="thin crust,";
		    }
		    if (stuffed.isSelected()) {
		    	 total+=8;
		    	 order+="stuffed crust,";
		    }
		    if (deep.isSelected()) {
		    	 total+=10;
		    	 order+="deep crust,";
		    }
		    if (mozzarella.isSelected()) {
		    	 total+=5;
		    	 order+="mozzarella,";
		    }
		    if (cheddar.isSelected()) {
		    	 total+=4;
		    	 order+="cheddar,";
		    }
		    if (bluecheese.isSelected()) {
		    	 total+=3;
		    	 order+="blue cheese,";
		    }
		    if (chilipeper.isSelected()) {
		    	 total+=2;
		    	 order+="chilipeper,";
		    }
		    if (onion.isSelected()) {
		    	 total+=1;
		    	 order+="onion,";
		    }
		    if (olive.isSelected()) {
		    	 total+=1;
		    	 order+="olive,";
		    }
		    dothis(total,name,num);
	}
    void then()
    {
    Object string;
    total++;
	string=combo1.getSelectedItem();
    order+=string+",";
    string=combo2.getSelectedItem();
    order+=string+",";
    }
    void dothis(int total,String name,String num)
  	{
    	
		 int x=JOptionPane.showConfirmDialog(null, "do you want to add any thing to the order",null, JOptionPane.YES_NO_CANCEL_OPTION);
		 if (x==0)
		 {
			    System.out.println("total money is "+total+" and->");
  		        System.out.println(order+"and");
  		        frame.dispose();
				new order(name,num,order);
		 }
		 else if(x==1 && z==0)
		 {
			 int y=JOptionPane.showConfirmDialog(null, "there is a offer if you take two pizza","are you sure", JOptionPane.YES_NO_CANCEL_OPTION);
			 if (y==0)
			 {
				 System.out.println("total money is "+total+" and->");
	  		     System.out.println(order+"and");
	  		     frame.dispose();
			    	new order(name,num,order);
			    	z++;
			 }
			 else
			 {
  		     System.out.println("total money is "+total);
  		     System.out.println(order);
  		     frame.dispose();
  		     new cash(name,total,order);
  		     //new Datastorage(name,total,order,num);
		     }
		 }
		 else if (z!=0)
		 {
		  frame.dispose();
		  new cash(name,total,order);
		  //new Datastorage(name,total,order,num);
		 }
  		 
  	}

}
