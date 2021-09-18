package np.edu.scst.method;

                    //tole 1
public class Prashant {
    
//                          home
    public static void main(String[] args) {
        Worldlink w = new Worldlink();
        System.out.println("brush refresh");
        System.out.println("no internet");
         w.complain();
         cook();
         w.complain();
         System.out.println("ac not working");
         int change = electrician(500);
         w.complain();
    }
    public static void cook(){
        System.out.println("Food is prepared");
    }
    public static int electrician(int given){
        int charge = 300;
        System.out.println("repaired AC. pleas give me"+charge);
        return given - charge;
    }
}
