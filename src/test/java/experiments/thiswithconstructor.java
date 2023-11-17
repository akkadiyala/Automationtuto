package experiments;

public class thiswithconstructor {

	    private String name;

	    public thiswithconstructor(String name) {
	        this.name = name;
	    }

	    public void printName() {
	        System.out.println("Name: " + this.name);
	    }

	    public static void main(String[] args) {
	    	thiswithconstructor person = new thiswithconstructor("John");
	        person.printName();
	    }
	}


