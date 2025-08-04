package MultyThreading;

/* 
   Multithreading is a feature in Java (and many other languages) that allows multiple threads 
   to run concurrently — meaning, multiple parts of your program can run at the same time.
*/

// Think of it like this:
    
/* 
   Imagine you're cooking:

   1. You're boiling water (Thread 1)

   2. You're chopping vegetables (Thread 2)

   3. You're heating oil (Thread 3)
*/   

/*
   A Thread is a lightweight process. You can create threads by:

   1. Extending Thread class

   2. Implementing Runnable interface
 */


 // Note : Number of thread created depends on the number of object created of class.


 // Example of creating a thread by extending Thread class

 class MyThread extends Thread {
   private String threadName;

   MyThread(String name) {
       this.threadName = name;
   }

   public void run() {
       for (int i = 1; i <= 5; i++) {
           System.out.println(threadName + " is running: " + i);
           try {
               Thread.sleep(500); // sleep for 500ms
           } catch (InterruptedException e) {
               System.out.println(threadName + " interrupted.");
           }
       }
       System.out.println(threadName + " finished.");
   }
}

public class Main {
   public static void main(String[] args) {
       MyThread t1 = new MyThread("Thread-1");
       MyThread t2 = new MyThread("Thread-2");
       MyThread t3 = new MyThread("Thread-3");
       MyThread t4 = new MyThread("Thread-4");

       t1.start();
       t2.start();
       t3.start();
       t4.start();
   }
}

// Outout

Thread-1 is running: 1
Thread-2 is running: 1
Thread-3 is running: 1
Thread-4 is running: 1
Thread-1 is running: 2
Thread-2 is running: 2
...
Thread-4 finished.




// Example of creating a thread by implementing Runnable interface

class MyRunnable implements Runnable {
   private String threadName;

   MyRunnable(String name) {
       this.threadName = name;
   }

   public void run() {
       for (int i = 1; i <= 5; i++) {
           System.out.println(threadName + " is running: " + i);
           try {
               Thread.sleep(500); // 500 milliseconds
           } catch (InterruptedException e) {
               System.out.println(threadName + " interrupted.");
           }
       }
       System.out.println(threadName + " finished.");
   }
}

public class Main {
   public static void main(String[] args) {
       // Creating Runnable objects
       MyRunnable r1 = new MyRunnable("Thread-1");
       MyRunnable r2 = new MyRunnable("Thread-2");
       MyRunnable r3 = new MyRunnable("Thread-3");
       MyRunnable r4 = new MyRunnable("Thread-4");

       // Passing Runnable to Thread objects
       Thread t1 = new Thread(r1);
       Thread t2 = new Thread(r2);
       Thread t3 = new Thread(r3);
       Thread t4 = new Thread(r4);

       // Starting threads
       t1.start();
       t2.start();
       t3.start();
       t4.start();
   }
}


//  Why we use Runnable instead of extending Thread?


/* 
   Java does not support multiple inheritance of classes, so a class can only extend one class at a time.

    So if your class is already extending another class, you can’t extend Thread.
    In that case, implementing Runnable is the best option.
*/    