package np.edu.scst.exceptionhandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionOccurenceAndHandling {
    public static void main(String[] args) {
        System.out.println("apple");
        System.out.println("ball");
      try{
        FileInputStream fis = new FileInputStream("fis.txt");
      }catch(FileNotFoundException e){
          System.out.println("File not found");
      }
        try{
             System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
            System.out.println("sorry you cannot divide by zero");
        }finally{
            System.out.println("Thankyou for using the calculator");
        }
       
        
        
        System.out.println("cat");
        System.out.println("dog");
    }
}
