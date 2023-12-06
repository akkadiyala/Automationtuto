package experiments;

import java.util.Scanner;

public class dowhile1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int number;
        char choice;

        do {
        	System.out.println("enter number");
        	number = scanner.nextInt();
        	int sq = number *number;
        	System.out.println("square of number i s " + sq );
        	System.out.println("do you want to continue yes/no");
        	choice = scanner.next().charAt(0);
        	
        }while(choice=='y' || choice == 'Y' );
        System.out.println("terminated");
	}

}