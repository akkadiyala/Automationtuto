package experiments;

import java.util.Scanner;

public class Reverse_of_number {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("enter number of original ");
	int number = scan.nextInt();
	int original = number;
	int reverse = 0;
	while(number!=0) {
		int rem = number%10;
		reverse = reverse*10 +rem;
		number = number/10;
		
		
	}
	System.out.println("reverse of number is "+ reverse);
	if(reverse==original) {
		System.out.println("given number is palidrome " + original);
	}
	else {
		System.err.println("given numbner is not palidrome " + original);
	}
}
}
