import java.util.Scanner;

public class BooleanConditionalLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * Teenager Grocery Run Program
		 */
		
//		boolean hasLicense = true;
//		int age = 16;
//		if (age >= 16 && hasLicense == true) {
//			System.out.println("You can drive.");
//		} else {
//			System.out.println("You cannot drive.");
//		};
//		
//	
//		double costOfMilk = 2.50;
//		int thirstLevel = 7;
//		
//		if (costOfMilk < 2.50 || thirstLevel > 6) {
//			System.out.println("Milk Please. ");
//		} else {
//				System.out.println("No thanks.");
//			}
//		

		/**
		 * Cookie Rationing Program
		 */
		
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("How many cookies are there? ");
//		int numberOfCookies = sc.nextInt();
//		System.out.println("How many children are there? ");
//		int numberOfChildren = sc.nextInt();
//		
//		if (numberOfCookies % numberOfChildren == 0) {
//			System.out.println("Sad face");
//		} else if (numberOfCookies % numberOfChildren < 2) {
//			System.out.println("Yes!");
//		} else if (numberOfCookies % numberOfChildren < 5) {
//			System.out.println("Whoohoooo!");
//		} else {
//			System.out.println("Jackpot!");
//		}
//		
//		
	/**
	 * Loyalty Discount Program	
	 */
		
//		String loyaltyMemberStatus = "GOLD";
//		double loyaltyMemberDiscount = 0.0;
//		
//		switch (loyaltyMemberStatus) {
//			case "SILVER":
//				loyaltyMemberDiscount = 0.10;
//				break;
//			case "GOLD":
//				loyaltyMemberDiscount = 0.15;
//				break;
//			case "PLATINUM":
//				loyaltyMemberDiscount = 0.25;
//				break;
//			} System.out.println("Your loyalty member discount is " + loyaltyMemberDiscount + ".");
//		
//		
//		
//		double billTotal = 600;
//		double adjustedBillTotal = billTotal - (billTotal * loyaltyMemberDiscount);
//		
////		if (adjustedBillTotal > 500.00 && loyaltyMemberStatus == "SILVER") {
////			loyaltyMemberStatus = "GOLD";
////		} else if 
////		
//		if (adjustedBillTotal > 500.00) {
//			if (loyaltyMemberStatus == "SILVER") {
//				loyaltyMemberStatus = "GOLD";
//				System.out.println("Your new loyalty member status is: " + loyaltyMemberStatus);
//			} else if (loyaltyMemberStatus == "GOLD") {
//				loyaltyMemberStatus = "PLATINUM";
//				System.out.println("Your bill is: " + adjustedBillTotal + ".");
//				System.out.println("Your new loyalty member status is: " + loyaltyMemberStatus);
//		} else {
//			}
//		}
//	
		
		
		
		/**
		 * Username and Password Verification Program
		 */
//		String userName = "Tommy";
//		String password = "12345";
//		
//		// When comparing Strings, do not use "==", use variableName.equals("stringNameHere")
//		
//		if (userName.equals("Tommy") && password.equals("12345")) {
//			System.out.println("Login successful.");
//		} else {
//			System.out.println("Access denied.");
//		}
//		
		
//		// FOR LOOP: Use when you KNOW how many times something needs to be iterated
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		
//		// WHILE LOOP: DO something until a condition is met when you don't know how long something needs to be iterated
//		int x = 10;
//		while (x < 10) {
//			System.out.println(x);
//			x++;
//		}
//		
//		
//		// DO WHILE LOOP: Will always iterate at least once, checks the last statement first. 
//		do {
//			System.out.println(x);
//			x++;
//		} while (x < 2);
//		
//		
//		for (int i = 0; i <= 9; i++) {
//			System.out.println(i);
//		}
//		
//		for (int i = 10; i >= 0; i--) {
//			System.out.println(i);
//		}
		
//		/**
//		 *  Program that identifies numbers as odd or even
//		 */
//		for (int i = 0; i <= 100; i++) {
//			if (i % 2 == 0) {
//			System.out.println(i + " is even");
//		} else if (i % 2 == 1) {
//			System.out.println(i + " is odd");
//		}
//		}
//			
//		
		
		int x = 10;
		while (x > 0) {
			x = x - 1;
			System.out.println("There are now " + x + " bottles of coke on the wall.");
		}
		
		
		for (int x1 = 3; x1 < 10; x1 = x1 + 2) {
		System.out.println(x1);
		}
		
		
		do {
			System.out.println(x);
			x = x * 2;
		} while (x < 10);
		
		
		
	}

}
