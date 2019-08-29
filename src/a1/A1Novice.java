package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numCustomers = scan.nextInt();

		for (int i=0; i<numCustomers; i++) {
			char first = scan.next().charAt(0);
			String lastName = scan.next();
			
			int count = scan.nextInt();
			
			double total = 0.0;
			
			for (int j=0; j<count; j++) {
				int numItems = scan.nextInt();
				scan.next();
				double price = scan.nextDouble();
				
				total += price * numItems;
			}
			
			System.out.println(first + ". " + lastName + ": " + 
					String.format("%.2f", total));
		}
		
		scan.close();
	}
}
