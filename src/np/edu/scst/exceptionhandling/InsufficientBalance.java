package np.edu.scst.exceptionhandling;

public class InsufficientBalance extends Exception {
    public InsufficientBalance(String s) {
        super(s);
    }
}

class ATM{
    public static void main(String[] args) {
        int balance = 500;
        int withdraw = 1000;
        if(balance < withdraw){
            try {
                throw   new InsufficientBalance("In sufficient balance");
            } catch (InsufficientBalance ex) {
                System.out.println(ex);  
            }
        }
    }
}