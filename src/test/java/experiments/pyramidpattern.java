package experiments;

public class pyramidpattern {
	public static void main(String[] args) {
		int numberOfRows = 6 ;
		int i , j, k;
		for ( i = 1; i <= numberOfRows; i++) {

            // Inner loop to print spaces
            for (j = 1; j <= numberOfRows - i; j++) {
                System.out.print(" ");
            }

            // Inner loop to print stars
            for ( k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();

}
}
}