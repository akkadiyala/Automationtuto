package experiments;

import java.util.Scanner;

public class Reverse_ofString {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter String of original ");
		String sentence = scan.nextLine();
		StringBuilder builder = new StringBuilder();
		builder.append(sentence);
		String reverse =builder.reverse().toString();
		System.out.println("reverse of String is "+ reverse);
		if(reverse.equalsIgnoreCase(sentence)) {
			System.out.println("given sentence is palidrome " + sentence);
		}
		else {
			System.err.println("given sentence is not palidrome " + sentence);
		}
	}
	}


