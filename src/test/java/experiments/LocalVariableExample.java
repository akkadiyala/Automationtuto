package experiments;

public class LocalVariableExample {
	static String global = "hello static ";
	 String globalvariable= "hello universe";
    public void printMessage() {
        String message = "Hello, World!";  // Local variable
        System.out.println(message);
    }

    public static void main(String[] args) {
        LocalVariableExample example = new LocalVariableExample();
        example.printMessage();
     
        System.out.println(example.globalvariable);
        System.out.println(LocalVariableExample.global);
        
       // LocalVariableExample.main(args);

        // Uncommenting the line below would result in a compilation error
        // System.out.println(message);  // Error: Cannot find symbol
    }
}
