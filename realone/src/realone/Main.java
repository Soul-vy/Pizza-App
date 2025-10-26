package realone;

import java.awt.Color;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Main {
	    static JFrame frame;
	  static  String customerName ;
	   static String customerPhone ;
	  static Scanner scanner;
	public static void main(String[] args) {
		
		        
		       scanner = new Scanner(System.in);

	           System.out.println("Welcome to bit-za");

	           // Customer data
	           System.out.print("Please enter your name: ");
	           customerName = scanner.nextLine();

	           System.out.print("Please enter your phone number: ");
	           customerPhone = scanner.nextLine();
		        // frame
		        frame = new JFrame("win1");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(500, 500);
		        frame.setResizable(false);
		        frame.setLayout(null);
		        frame.setAlwaysOnTop(true);
		        
		        // ImageIcon image = new ImageIcon(Main.class.getResource("/logo.png")); 
		        ImageIcon image1 = new ImageIcon("logo.png");
		        ImageIcon image2 = new ImageIcon("pizza 2.png");
		        ImageIcon image3 = new ImageIcon("pizza guy.png");
		        ImageIcon image4 = new ImageIcon("images.png");
		        ImageIcon image5 = new ImageIcon("images.png");
		        
		        //  label
		        JLabel label1 = new JLabel();
		        label1.setBounds(80, 130, 240, 100);
		        label1.setIcon(image1);   
		        label1.setOpaque(true);
		        label1.setBackground(Color.red);
		    	label1.setHorizontalAlignment(JLabel.CENTER);
		    
		    	JLabel label2 = new JLabel();
			    label2.setBounds(330, 130, 100, 100);
			    label2.setIcon(image2);
			    label2.setOpaque(true);
			    label2.setBackground(Color.red);
			    label2.setHorizontalAlignment(JLabel.CENTER);
		       
				JLabel label3 = new JLabel();
			    label3.setBounds(10, 250, 150, 150);
			    label3.setIcon(image3);
			    label3.setOpaque(true);
			    label3.setBackground(Color.red);
			    label3.setHorizontalAlignment(JLabel.CENTER);
			    
			    JLabel label4 = new JLabel();
		        label4.setBounds(-90,-80, 210, 210);
		        label4.setIcon(image4);   
		        label4.setOpaque(true);
		        label4.setBackground(Color.red);
		       // label4.setVerticalAlignment(JLabel.TOP);
		    
		    	JLabel label5 = new JLabel();
			    label5.setBounds(360,-80, 210, 210);
			    label5.setIcon(image5);
			    label5.setOpaque(true);
			    label5.setBackground(Color.red);
			 //   label5.setVerticalAlignment(JLabel.TOP);
			    
			    // button
			    JButton button=new JButton();
				button.setBounds(175,300,150,50);
			    button.setFocusable(false);
				button.addActionListener(e -> dothis());
				button.setText("order now !!!");
			    button.setForeground(Color.black);
			    button.setBackground(Color.white);
			  
		        
                // add items
		        frame.add(label1);
		        frame.add(label2);
		        frame.add(label3);
		        frame.add(label4);
		        frame.add(label5);
		        frame.add(button);
		        frame.getContentPane().setBackground(Color.red);
		        frame.setVisible(true);
		  

	}
	 static void dothis()
     {
		  frame.setAlwaysOnTop(false);
		 int x=JOptionPane.showConfirmDialog(null, "do you want the menu if not you can customize it","as you want", JOptionPane.YES_NO_CANCEL_OPTION);
 		 if (x==0)
 		 {
 			frame.dispose();
 			
 		// Pizza menu
 	        System.out.println("\nChoose your pizza type:");
 	        System.out.println("1. Margherita - 60 EGP");
 	        System.out.println("2. Pepperoni - 80 EGP");
 	        System.out.println("3. BBQ Chicken - 100 EGP");
 	        System.out.println("4. Veggie - 70 EGP");
 	        System.out.print("Enter the number of your choice: ");
 	        int pizzaChoice = scanner.nextInt();
 	        scanner.nextLine(); // Consume newline

 	        String pizzaType = "";
 	        int pizzaPrice = 0;

 	        switch (pizzaChoice) {
 	            case 1:
 	                pizzaType = "Margherita";
 	                pizzaPrice = 60;
 	                break;
 	            case 2:
 	                pizzaType = "Pepperoni";
 	                pizzaPrice = 80;
 	                break;
 	            case 3:
 	                pizzaType = "BBQ Chicken";
 	                pizzaPrice = 100;
 	                break;
 	            case 4:
 	                pizzaType = "Veggie";
 	                pizzaPrice = 70;
 	                break;
 	            default:
 	                System.out.println("Invalid choice! Defaulting to Margherita.");
 	                pizzaType = "Margherita";
 	                pizzaPrice = 60;
 	        }

 	        // Drink menu
 	        System.out.println("\nChoose your drink:");
 	        System.out.println("1. Water - 10 EGP");
 	        System.out.println("2. Soda - 15 EGP");
 	        System.out.println("3. Juice - 20 EGP");
 	        System.out.print("Enter the number of your choice: ");
 	        int drinkChoice = scanner.nextInt();
 	        scanner.nextLine();
 	        String drinkType = "";
 	        int drinkPrice = 0;

 	        switch (drinkChoice) {
 	            case 1:
 	                drinkType = "Water";
 	                drinkPrice = 10;
 	                break;
 	            case 2:
 	                drinkType = "Soda";
 	                drinkPrice = 15;
 	                break;
 	            case 3:
 	                drinkType = "Juice";
 	                drinkPrice = 20;
 	                break;
 	            default:
 	                System.out.println("Invalid choice! Defaulting to Water.");
 	                drinkType = "Water";
 	                drinkPrice = 10;
 	        }

 	        // Tip
 	        System.out.print("\nWould you like to add a tip? (yes/no): ");
 	        String addTip = scanner.nextLine();
 	        int tip = 0;
 	        switch (addTip){
 	        case "yes" :
 	        System.out.print("Enter tip amount: ");
 	            tip = scanner.nextInt();
 	            break;	
 	        case "no" :	
 	        System.out.print(" you are welcome . ");	
         	break ;	
 	        }
 	        // Payment method
 	        System.out.println("\nChoose payment method:");
 	        System.out.println("1. Cash");
 	        System.out.println("2. Card");
 	        System.out.print("Enter the number of your choice: ");
 	        int paymentChoice = scanner.nextInt();
 	        scanner.nextLine(); // Consume newline

 	        String paymentMethod = (paymentChoice == 1) ? "Cash" : "Card";

 	        // Create the order details object and print the order
 	        int orderNumber = 1; // In real case this would be dynamic
 	        int tableNumber = 1; // Assuming one table per order

 	        OrderDetailsPrint orderDetails = new OrderDetailsPrint(orderNumber, tableNumber, customerName, customerPhone, pizzaType, pizzaPrice, drinkType, drinkPrice, paymentMethod, tip);
 	        orderDetails.printAllDetails();

 	        System.out.println("\nThank you for choosing our restaurant , Mr/Mrs :  " + customerName);

 		 }
 		 else if (x==1)
 		 {
 		   new order(customerName,customerPhone,"");
 	 	   frame.dispose();
 		 }
 		 else 
 			frame.dispose();   	 	
     }

}
