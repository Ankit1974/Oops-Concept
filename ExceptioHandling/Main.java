package ExceptioHandling;


// Note : We can write Multiple catch Block

/* Note : we can Directly use Exception insted of type of exception to catch all
          the exception occured.public class TryCatch 
*/
          

/* 
    Defination of try Block

    A Block of code that causes an exception
*/    

/* 
   Defination of catch 
    
   Follow the try block and handles the exceptions thrown by the
   try block


   When the exception occurs in the try block, the control is
   transferred to the catch block , here the exception is handled.

 */



 // Example or how to use try , catch block


 public class Main {
  public static void main(String[] args) {
      try {
          int[] arr = new int[3];
          System.out.println(10 / 0);     // ArithmeticException
          System.out.println(arr[5]);     // ArrayIndexOutOfBoundsException
      } 
      catch (ArithmeticException e) {
          System.out.println("🔢 Cannot divide by zero!");
      } 
      catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("📦 Array index is out of bounds!");
      } 
      catch (Exception e) {
          System.out.println("💥 Some other exception occurred.");
      }

      System.out.println("✅ Program continues after handling exceptions.");
  }
}

 



