package MultyThreading;

// We can set the priority of thread 

/*
  1. Priority Levels : Java threads have priority levels from 1(Lowest) to 10(highest) , with a default
  value of 5.
  2. Influence on Exexution : A thread's priority can suggests the 
  importance of a thread to the operating Systeam.
  3. Set and Get priority : - Use setPriority to set the priority of the thread
  and getPriority is used to get the Priority of the thread.
 */


 // Example of how to setPriority or getPriority

 class MyThread extends Thread {
  public void run() {
      System.out.println(Thread.currentThread().getName() + 
          " → Priority: " + Thread.currentThread().getPriority());
  }
}

public class Main {
  public static void main(String[] args) {

      MyThread t1 = new MyThread();
      MyThread t2 = new MyThread();
      MyThread t3 = new MyThread();

      // Set names
      t1.setName("Thread-1");
      t2.setName("Thread-2");
      t3.setName("Thread-3");

      // Set priorities
      t1.setPriority(Thread.MIN_PRIORITY); // 1
      t2.setPriority(Thread.NORM_PRIORITY); // 5 (default)
      t3.setPriority(Thread.MAX_PRIORITY); // 10

      // Start all threads
      t1.start();
      t2.start();
      t3.start();
  }
}



 // Note : Priority doesn't gurantee the order of exacution