package np.edu.scst.recursion;

public class Factorial {
    public int factorial(int i){
       // 7*6*5*4*3*2*1
       if(i <0){// no factorial for negarive number
           System.out.println("Cannot have factorial of a negative number");
           return 0;
       }
       else if (i==0 || i ==1){
           return 1;
       }
       
        return i  *  factorial(i-1);   // 7  *  ( 6  * (5  * (4 *(3  *(2  *(1))))))
    }
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println("Factorial of 7 is "+fact.factorial(7));
    }
}
