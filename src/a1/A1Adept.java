package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int itemCount = scan.nextInt();
		
		String[] itemList = new String[itemCount];
		double[] priceList = new double[itemCount];
		
		for (int i=0; i<itemCount; i++) {
			itemList[i] = scan.next();
			priceList[i] = scan.nextDouble();
		}
		
		int numCustomers = scan.nextInt();
		
		String[] customers = new String[numCustomers];
		double[] moneySpent = new double[numCustomers];
		
		double sum = 0.0;
		int biggestIndex = 0;
		int smallestIndex = 0;
		
		for (int i=0; i<numCustomers; i++) {
			customers[i] = scan.next() + " " + scan.next();
			
			int numItemsBought = scan.nextInt();
			double totalSpent = 0.0;
			
			for (int j=0; j<numItemsBought; j++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				
				for (int k=0; k<itemCount; k++) {
					if (itemName.equals(itemList[k])) {
						totalSpent += priceList[k] * quantity;
					}
				}
			}
			
			moneySpent[i] = totalSpent;
		
			sum += totalSpent;

			if (totalSpent > moneySpent[biggestIndex]) {
				biggestIndex = i;
			} else if (totalSpent < moneySpent[smallestIndex]) {
				smallestIndex = i;
			}
		}
		
		scan.close();
		
		System.out.println("Biggest: " + customers[biggestIndex] + 
				" (" + String.format("%.2f", moneySpent[biggestIndex]) + ")");
		
		System.out.println("Smallest: " + customers[smallestIndex] + 
				" (" + String.format("%.2f", moneySpent[smallestIndex]) + ")");
		
		System.out.println("Average: " + String.format("%.2f", sum / numCustomers));
	}
}
