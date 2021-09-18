package np.edu.scst.constructorsinlevels;
public class Child extends Parent{
    public Child(){
       this(10);
        System.out.println("this is child constructor");
    }
    public Child(int a){
        System.out.println("this is parametered constructor");
    }
    public static void main(String[] args) {
        Child c = new Child();
    }
}
