package experiments;

public class breakwhile {
public static void main(String[] args) {
	int i = 1;
	while (i <= 10) {
	    System.out.print(i + " ");
	    if (i == 5) {
	        break; // Breaks out of the loop when i equals 5
	    }
	    i++;
	}

}
}
