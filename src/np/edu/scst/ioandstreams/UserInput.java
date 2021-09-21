package np.edu.scst.ioandstreams;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.err.println("This is an error message");
         Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String result = input.nextLine();
        System.out.println("your entered string is "+result);
        System.out.println("Please enter a integer: ");
        int intResult = input.nextInt();
        System.out.println("your entered integer is "+intResult);
        
    }
}
