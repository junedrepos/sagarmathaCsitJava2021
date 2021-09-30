package np.edu.scst.exceptionhandling;

public class ExceptionOccurence {
    public static void main(String[] args) {
        System.out.println("apple");
        System.out.println("ball");
        try{
        System.out.println(10/0);
        }catch(Exception e){
            System.out.println(e);
            System.out.println("You cannot divide by zero");
        }finally{
            System.out.println("I will be executed anyways");
        }
        
        System.out.println("cat");
        System.out.println("dog");
    }
}
