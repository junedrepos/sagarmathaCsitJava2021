package np.edu.scst.classnobject.nestedinnerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Parent p = new Parent(){
            @Override
            public void method1(){
                System.out.println("I am method of abstract class defined from anonymous inner class");
            }
        };
        p.method1();
        
    }
}

abstract class Parent{
    public abstract void method1();
}