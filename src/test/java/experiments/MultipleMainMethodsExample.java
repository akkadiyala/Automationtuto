package experiments;

public class MultipleMainMethodsExample {

    public static void main(String[] args) {
        System.out.println("This is the main method 1");
        // Code for main method 1
        main(5);
        main("anil" , "kumar");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("This is the main method 2");
        // Code for main method 2
    }

    public static void main(int num) {
        System.out.println("This is the main method 3");
        // Code for main method 3
    }
}
