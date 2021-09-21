package np.edu.scst.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("apple");
        System.out.println("ball");
        File f = new File("apple.txt");
        
        
         
        
        try{
            System.out.println("a1");
            System.out.println(10/0);
            System.out.println("a2");
//           FileInputStream fis = new FileInputStream(f);
        }
        catch(Exception e){
            System.out.println("you did some mistake; never divide by zero");
            try{
                System.out.println(10/0);
            }catch(ArithmeticException ex){
                System.out.println(ex);
            }
            
            
//            e.printStackTrace();
        }
        finally{
            System.out.println("Thankyou for using our calculator");
        }
        
        
        System.out.println("cat");
        System.out.println("dog");
//        String[] arr = {"apple","ball","cat","dog"};
//        for (int i = 0; i <= arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println("elephant");
    }
}
