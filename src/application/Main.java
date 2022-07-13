package application;

import java.util.Random;
import java.util.Scanner;

public class Main{ 
	static Scanner in = new Scanner(System.in);
	static void quoteGen() {
		
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
    public static void main(String[] args) { 
    	quoteGen();
    }
}
