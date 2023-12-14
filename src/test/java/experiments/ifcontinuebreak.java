package experiments;

public class ifcontinuebreak {
	
	    public static void main(String[] args) {
	        int i = 0;

	        System.out.println("Using Continue:");
	        do {
	            if (i == 5) {
	                i++;
	                continue; // Skips the rest of the loop for i = 5
	            }
	            System.out.println(i);
	            i++;
	        } while (i < 10);

	        i = 0; // Reset i for the next example

	        System.out.println("\nUsing Break:");
	        do {
	            if (i == 5) {
	            	i++;
	                break; // Exits the loop when i = 5
	            }
	            System.out.println(i);
	            i++;
	        } while (i < 10);
	    }
	}


