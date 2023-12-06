  nn 
  
  
  
  
  package experiments;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.err.println(i);
                sum +=i;
            }
        }
        System.out.println("sum of even number is " + sum);
    }
}
