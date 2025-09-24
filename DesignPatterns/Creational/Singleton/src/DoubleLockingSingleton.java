public class DoubleLockingSingleton {
    private static volatile DoubleLockingSingleton instance = null;
    // volatile keyword solves issues of instruction reordering and ensures visibility of changes across threads
    // volatile keyword is used to ensure that the value of the variable is fetched from the memory every time it is accessed, rather than from a thread's local cache.
    // All reads and writes of a volatile variable are done directly to and from the main memory.
    private DoubleLockingSingleton() {
        // Private constructor to prevent instantiation
    }

    public static DoubleLockingSingleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (DoubleLockingSingleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new DoubleLockingSingleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from DoubleLockingSingleton!");
    }
}
