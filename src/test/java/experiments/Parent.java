package experiments;

public class Parent {
    private String name;

    // Constructor for the Parent class
    public Parent(String SURNAME) {
        this.name = SURNAME;
    }

    // Method to display the name in the Parent class
    public void display() {
        System.out.println("Parent SURNAME IS : " + name);
    }
}

class Child extends Parent {
    private String childName;

    // Constructor for the Child class
    public Child(String SURNAMEname, String childSurName) {
        super(SURNAMEname); // Call the constructor of the Parent class using super
        this.childName = childSurName;
    }

    // Method to display names in both Parent and Child classes
    @Override
    public void display() {
        super.display(); // Call the display method of the Parent class using super
        System.out.println("Child surname class: " + childName);
    }

    public static void main(String[] args) {
        // Example usage
        Parent parentObj = new Parent("kadiyala");
        parentObj.display();

        Child childObj = new Child("kadiyala", "kadiyala");
        childObj.display();
    }
}
