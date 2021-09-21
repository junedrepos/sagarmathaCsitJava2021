package np.edu.scst.classnobject.passbyvaluerefernce;

public class PassByValue {
    public static void m1(int y){// y = 5
        y = y-1;
    }
    // byte shor int long float double char boolean
    public static void main(String[] args) {
        int x = 5;
        m1(x);
        System.out.println(x);
    }
}
