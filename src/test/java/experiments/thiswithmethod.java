package experiments;

public class thiswithmethod {
    private String name;

    public  void setName(String name) {
        this.name = name;
        
    }

    public   String getName() {
        return this.name;
    }

    public static void main(String[] args) {
    	
    	thiswithmethod person = new thiswithmethod();
        person.setName("John Doe");
        System.out.println("Name: " + person.getName());
    }
}



