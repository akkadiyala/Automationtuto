package experiments;

//Abstract class
abstract class AbstractClass {
 // Abstract method
 public abstract void abstractMethod();

 // Concrete method
 public void concreteMethod() {
     System.out.println("This is a concrete method in the abstract class.");
 }
}

//Concrete class extending the abstract class
class ConcreteClass extends AbstractClass {
 // Implementation of the abstract method
 @Override
 public void abstractMethod() {
     System.out.println("This is the implementation of the abstract method.");
 }



 public static void main(String[] args) {
     // Cannot instantiate an abstract class directly
  //    AbstractClass abstractObj = new AbstractClass(); // This would result in a compilation error

     // Instantiate the concrete class
     ConcreteClass concreteObj = new ConcreteClass();

     // Call methods from the abstract and concrete classes
     concreteObj.abstractMethod();
     concreteObj.concreteMethod();
 }
}