package experiments;

import java.lang.reflect.Method;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("main method");

        // Calling method String with null
        method(null);

        // Creating an object and calling method with the object
        Object myObject = new Object();
        
        method(myObject);
        method(null); // The method method(String) is ambiguous for the type MainMethod if Interger a passed instaed of int a
        method(3);
        // Calling the overloaded main methods
        main("hello");
        main(6);

        // Counting main and method methods
        int countMain = 0;
        int countMethod = 0;

        for (Method method : MainMethod.class.getDeclaredMethods()) {
            if (method.getName().equals("main")) {
                countMain++;
            } else if (method.getName().equals("method")) {
                countMethod++;
            }
        }
 int totalmethod=MainMethod.class.getDeclaredMethods().length;
        System.out.println("Number of main methods: " + countMain);
        System.out.println("Number of method methods: " + countMethod);
        System.out.println("Total Number of methods in class: " + totalmethod);
    }

    public static void main(String args) {
        System.out.println("main string ");
    }
    

    public static void main(int a) {
        System.out.println("main integer");
    }

    public static void method(String a) {  // incase we provide Integer in palce odf string by running null passing in main method get ambigious issue;
        System.out.println("method string");
    }

    public static void method(Object b) {
        System.out.println("method object");
    }
    public static void method(int a) {
    	System.out.println(" method integer");
    }
}
