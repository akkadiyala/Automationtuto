package experiments;

class MyClass {
    // A large object to consume memory
    private byte[] data = new byte[10 * 1024 * 1024];

    // Finalize method to be called by the garbage collector
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being finalized");
    }
}

public class GarbageCollectorExample {
    public static void main(String[] args) {
        // Creating an object
        MyClass myObject = new MyClass();

        // Making the reference null, suggesting it for garbage collection
        myObject = null;

        // Explicitly requesting garbage collection (though not guaranteed to be immediate)
        System.gc();

        // Adding a delay to allow the garbage collector to run (not recommended in real-world scenarios)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main");
    }
}
