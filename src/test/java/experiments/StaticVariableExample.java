package experiments;

public class StaticVariableExample {
    static int count = 0;  // Static variable

    public StaticVariableExample() {
        count++;  // Increment count in the constructor
    }

    public static void main(String[] args) {
        StaticVariableExample obj1 = new StaticVariableExample();
        System.out.println("Count from obj1: " + obj1.count);

        StaticVariableExample obj2 = new StaticVariableExample();
        System.out.println("Count from obj2: " + obj2.count);
        
        StaticVariableExample obj3 = new StaticVariableExample();
        System.out.println("Count from obj3: " + obj3.count);

        // Accessing static variable without creating an instance
        System.out.println("Count without creating an instance: " + StaticVariableExample.count);
    }
}
// in this example clearly when one object creation constreucot rwill increase the count when ever objct creation so as per this constrcuto will invoke when objct is creation for class