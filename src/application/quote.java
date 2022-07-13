package application;
import java.util.Random;
import java.util.Scanner;

public class quote {
	static void quoteGen() {
		Scanner in = new Scanner(System.in);
		
		// array to store quotes
		String quotes[] = {"hatdog - hatdog", "Skrrt Skrrt - lil pp", "Banana - Minion"};     
		
		// instance of random class
		Random r=new Random(); 
		
		// initialize the key variable
		String key = "";
		
		// randomize the array
	    int randomNumber = r.nextInt(quotes.length);
	
	
	// loop the user input, if the the user input is empty it will loop
	    while(key.isEmpty()) {
		    
	    	System.out.println("enter any key");
	        key = in.nextLine();
	        
		// if the user enter key it will print the randomize array
	        if(!key.isEmpty()) {
	        	System.out.println(quotes[randomNumber]);
	        }
	    }
	}
}
