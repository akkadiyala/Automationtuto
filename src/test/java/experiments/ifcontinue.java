package experiments;

public class ifcontinue {
	public static void main(String[] args) {
		
	
	int i = 0;
	do {
	    if (i == 5) {
	    	i++;
	        continue; // This will skip the rest of the loop when i is 5
	    }
	    System.out.println(i);
	    i++;
	} while (i < 10);

}
}