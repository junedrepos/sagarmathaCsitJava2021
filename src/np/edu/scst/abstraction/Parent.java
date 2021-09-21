package np.edu.scst.abstraction;


public class Parent {
 public static void main(String[] args) {
        P2 p2 = new P2();
        p2.callMethod1();
    }
}

class P2{
     public void callMethod1(){
         Child c = new Child();
         ParentInterface p = new Child();
         // reference               object creation
        p.method1();
     }
}

class P3{
    
}




