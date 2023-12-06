package interfacefull;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the size of array");
int size =	scan.nextInt();
//int list[]= new int[size]; both are valid
int[] list= new int[size]; 
System.out.println("enter values");
for(int i = 0 ; i < size ; i++) {
	list[i]= scan.nextInt();
	
}
System.out.println("Array values : ");  
System.out.print("[");
for(int i =0 ;i<size;i++)
{
	System.out.print(list[i] + " ");
	  if (i < list.length - 1) {
          System.out.print(",");
      }
  }
  System.out.println("]");
  
}
}
	

