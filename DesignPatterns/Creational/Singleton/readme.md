
# Singleton Design Pattern

The **Singleton Pattern** is a creational design pattern that ensures a class has only one instance and provides a global point of access to it. This is useful when exactly one object is needed to coordinate actions across a system.

## Why Use Singleton?

Creating multiple instances of certain classes can lead to problems such as:
- **Resource wastage:** Multiple objects may consume unnecessary memory or system resources.
- **Inconsistent behavior:** Different instances may lead to conflicting states or outputs.

Common examples where Singleton is used:
- Thread Pools
- Caches
- Loggers
- Configuration Managers

## How Singleton Works

Singleton restricts the instantiation of a class to one object. It does this by:
- Making the constructor private.
- Providing a static method that returns the single instance.

## Ways to Implement Singleton

There are several ways to implement the Singleton pattern in Java:

1. **Eager Initialization:**  
   The instance is created at the time of class loading.
   ```java
   public class EagerSingleton {
	   private static final EagerSingleton instance = new EagerSingleton();
	   private EagerSingleton() {}
	   public static EagerSingleton getInstance() {
		   return instance;
	   }
   }
   ```

2. **Lazy Initialization:**  
   The instance is created only when it is needed.
   ```java
   public class LazySingleton {
	   private static LazySingleton instance;
	   private LazySingleton() {}
	   public static LazySingleton getInstance() {
		   if (instance == null) {
			   instance = new LazySingleton();
		   }
		   return instance;
	   }
   }
   ```

3. **Synchronized Method:**  
   Thread-safe lazy initialization using synchronized keyword.
   ```java
   public class SynchronizedSingleton {
	   private static SynchronizedSingleton instance;
	   private SynchronizedSingleton() {}
	   public static synchronized SynchronizedSingleton getInstance() {
		   if (instance == null) {
			   instance = new SynchronizedSingleton();
		   }
		   return instance;
	   }
   }
   ```

4. **Double-Checked Locking:**  
   Improves performance by reducing the overhead of synchronized method.
   ```java
   public class DoubleCheckedSingleton {
	   private static volatile DoubleCheckedSingleton instance;
	   private DoubleCheckedSingleton() {}
	   public static DoubleCheckedSingleton getInstance() {
		   if (instance == null) {
			   synchronized (DoubleCheckedSingleton.class) {
				   if (instance == null) {
					   instance = new DoubleCheckedSingleton();
				   }
			   }
		   }
		   return instance;
	   }
   }
   ```

## Pros and Cons

### Pros
- Controlled access to a single instance.
- Saves resources by preventing unnecessary object creation.
- Useful for shared resources (e.g., configuration, logging).
- Can be extended to support lazy initialization and thread safety.

### Cons
- Can make unit testing difficult due to global state.
- May introduce hidden dependencies in code.
- Not suitable for classes that require multiple instances.
- Can lead to issues in multi-threaded environments if not implemented carefully.

## Summary

The Singleton pattern is ideal when you need to control access to shared resources and ensure consistency throughout your application. Choose the implementation based on your application's requirements for performance and thread safety.