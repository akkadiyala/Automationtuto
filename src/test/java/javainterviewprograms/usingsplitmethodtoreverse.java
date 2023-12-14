package javainterviewprograms;

import java.util.Scanner;

public class usingsplitmethodtoreverse {
public static void main(String[] args) {
	String str;
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter your String");
    str = scan.nextLine();
    String token[] = str.split("");
    for(int i = token.length-1;i>=0;i--) {
    	System.out.print(token[i] +"");
    }
}
}
