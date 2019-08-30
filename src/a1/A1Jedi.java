package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int itemCount = scan.nextInt();
		
		String[] itemList = new String[itemCount];
		
		for (int i=0; i<itemCount; i++) {
			itemList[i] = scan.next();
			scan.nextDouble();
		}
		
		int numCustomers = scan.nextInt();
		
		int[] count = new int[itemCount];
		int[] customersBought = new int[itemCount];
		
		for (int i=0; i<numCustomers; i++) {
			boolean[] alreadyBought = new boolean[itemCount];

			scan.next();
			scan.next();
						
			int itemsBought = scan.nextInt();
			
			for (int j=0; j<itemsBought; j++) {
				int quantity = scan.nextInt();
				String item = scan.next();
				
				for (int k=0; k<itemCount; k++) {
					if (item.equals(itemList[k])) {
						count[k] += quantity;
						
						if (!alreadyBought[k]) {
							alreadyBought[k] = true;
							customersBought[k]++;
						}
					}
				}
			}
		}
		
		for (int i=0; i<itemCount; i++) {
			if (customersBought[i] == 0) {
				System.out.println("No customers bought " + itemList[i]);
			} else {
				System.out.println(customersBought[i] + " customers bought " + count[i] + " " + itemList[i]);
			}			
		}
		
		scan.close();
	}
}
