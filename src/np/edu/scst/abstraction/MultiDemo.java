package np.edu.scst.abstraction;

class Parent1{
    String eyeColor ="black";
}
class Parent2{
    String eyeColor ="Blue";
}

public class MultiDemo extends Parent1, Parent2{
    public static void main (String[] args){
    MultiDemo m = new MultiDemo();
        System.out.println(m.eyeColor);
}
}
