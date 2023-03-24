package topic1;
import java.util.Scanner;


public class exercise3 {
	public static void main(String[]args) {
		
	
		Scanner sc= new Scanner(System.in);
			System.out.println("Retail price:");
			double retail= sc.nextDouble();
			
			System.out.println("Sales tax rate:");
			double sales_tax_rate = sc.nextDouble();
			
			double sales_tax = retail * sales_tax_rate /100 ;
			double total = retail + sales_tax;
					
			
				
				
				
				System.out.println("Sale tax is"+ String.format("%.2f",total));
				System.out.println("Total "+ String.format("%.2f",total));
		}
	}
//author
