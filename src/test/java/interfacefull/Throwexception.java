package interfacefull;

import java.util.Scanner;

public class Throwexception {
	
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("please provide the balance and withdraw amount");
	    	int balance = scan.nextInt();
	    	
            int withdrawAmount = scan.nextInt();
	        try {
	            
	            if (withdrawAmount <= balance) {
	            	 balance -= withdrawAmount;// substrate the withdraw banlance and backt o balance
		                System.out.println("Withdrawal successful. Remaining balance: " + balance);
	            } else {
	               
	                throw new ArithmeticException("Insufficient balance");
	            }
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
}


