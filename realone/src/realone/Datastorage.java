package realone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datastorage {

	 LocalDateTime now=  LocalDateTime.now();
	 DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	 String formatterDateTime= now.format(formatter);
	 int check;
	 boolean nameFound = false; 
     Datastorage(String name,int total,String order,String num)
	{
		
		try(FileWriter file=new FileWriter("C:/Users/Ahmed Emad/OneDrive/Documents/store.txt",true))
		{
		file.write(name +" - "+num+" - " + total + " - " + order + " - "+formatterDateTime+"\n");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	Datastorage (String name)
	{
		try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Ahmed Emad/OneDrive/Documents/store.txt"))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] parts = line.split(" - ");
	            if (parts.length > 0 && parts[0].equals(name)) {
	                nameFound = true;
	                System.out.println(name);
	                new order(name, parts[1],"");
	                break;
	            }
	        }
	        if (!nameFound) {
	            System.out.println("Sorry, wrong name. Check again.");
	            new lanch2();
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	

}
