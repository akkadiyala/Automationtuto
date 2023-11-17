package experiments;

import java.util.Scanner;

public class primenumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter number of original ");
		int number = scan.nextInt();
		boolean isprime=true;
		if(number<=1) {
			isprime=false;
		}
			else {
			for(int i =2; i<=Math.sqrt(number);i++)
			{
				if(number%i==0) {
					isprime= false;
				}
			}
		}
		int original = number;
		int reverse = 0;
		while(number!=0) {
			int rem = number%10;
			reverse = reverse*10 +rem;
			number = number/10;
			
			
		}
		if (isprime) {
            System.out.println(original + " is a prime number.");
            System.out.println("Reverse of the prime number is: " + reverse);
        } else {
            System.out.println(original + " is not a prime number.");
        }
	}
	


}