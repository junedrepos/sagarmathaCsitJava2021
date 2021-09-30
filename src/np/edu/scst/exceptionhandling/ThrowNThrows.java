package np.edu.scst.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

//import java.lang.*;

public class ThrowNThrows {
    public static void main(String[] args) {
        int balance = 500;
        int withdraw = 1000;
        if(balance < withdraw){
            throw   new ArithmeticException("In sufficient balance");
        }
        
       ThrowNThrows obj = new ThrowNThrows();
        try {
            obj.readFile();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
    }
    
    public void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("apple.txt"));
        
    }
    
}
