package experiments;

public class EqualsVsOperatorExample {
    public static void main(String[] args) {

        // String objects
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = "Hello";

        // Using equals for content comparison
        System.out.println("Using equals for content comparison:");
        System.out.println(str1.equals(str2));  // Should print true
        System.out.println(str1.equals(str3));  // Should print true
        System.out.println(str3.equals(str4));  // Should print true

        // Using == for reference comparison
        System.out.println("\nUsing == for reference comparison:");
        System.out.println(str1 == str2);  // Should print false (different objects)
        System.out.println(str1 == str3);  // Should print false (different objects)
        System.out.println(str3 == str4);  // Should print true (both point to the same string literal)

        
    }
}
