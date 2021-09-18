package np.edu.scst.classnobject.inheritance.single;

public class Child extends Parent {
    int property2=10000000;
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.eyeColor);
        System.out.println(c.property);
        System.out.println(c.property2);
        c.car();
        Parent p = new Parent();
        System.out.println(p.property);
        //System.out.println(p.property2);
        //single directional inheritance
    }
}
