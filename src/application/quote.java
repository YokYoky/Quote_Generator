package application;
import java.util.Random;
import java.util.Scanner;

public class quote {
	static void quoteGen() {
		Scanner in = new Scanner(System.in);
		String quotes[] = {"hatdog - hatdog", "Skrrt Skrrt - lil pp", "Banana - Minion"};        
		Random r=new Random(); 
		String key = "";
	    int randomNumber=r.nextInt(quotes.length);
	
	
	    while(key.isEmpty()) {
	    	System.out.println("enter any key");
	        key = in.nextLine();
	        
	        if(!key.isEmpty()) {
	        	System.out.println(quotes[randomNumber]);
	        }
	    }
	}
}
