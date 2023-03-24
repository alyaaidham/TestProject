package topic1;

import java.util.Scanner;

public class lab2csc { 

	public static void main(String[]args) {

	double kilo= 1.6; 
	Scanner sc= new Scanner(System.in);
	System.out.print("mile");
	int mile= sc.nextInt(); 
	
	
	double total= mile*kilo; 
	System.out.println("Total="+ String.format("%.2f",total));
	
	}
}
	
	
	
	

