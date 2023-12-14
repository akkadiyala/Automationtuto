package experiments;

public class ifbreak {
	
	    public static void main(String[] args) {
	        int i = 0;
	        do {
	            if (i == 5) {
	            	i++;
	                break; // This will exit the loop when i is 5
	            }
	            System.out.println(i);
	            i++;
	        } while (i < 10);
	    }
	}


