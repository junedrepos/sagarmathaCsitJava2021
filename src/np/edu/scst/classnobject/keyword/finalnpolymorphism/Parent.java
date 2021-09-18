package np.edu.scst.classnobject.keyword.finalnpolymorphism;
public class Parent {
    public double area(double r){//overload for same class level
        return Math.PI*r*r;
    }
    public double area(int l, double b){//overload for same class level
        return l*b;
    }
    public double area(double l, int b, String a){
        return 0.0;
    }    
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.area(10.0));
        System.out.println(p.area( (int) 10.0, 20));
    }
}
