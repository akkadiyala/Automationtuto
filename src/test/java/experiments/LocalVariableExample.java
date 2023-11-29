package experiments;

public class LocalVariableExample {
    public void printMessage() {
        String message = "Hello, World!";  // Local variable
        System.out.println(message);
    }

    public static void main(String[] args) {
        LocalVariableExample example = new LocalVariableExample();
        example.printMessage();

        // Uncommenting the line below would result in a compilation error
        // System.out.println(message);  // Error: Cannot find symbol
    }
}
