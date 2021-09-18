package np.edu.scst.classnobject.keyword.finalnpolymorphism;
public class Bahubali extends Shivagami{
   final int A =10;
   final double PI = 3.14;
    
    public void gift(){
        System.out.println("devsena");
//        super.gift();
    }
   
    public static void main(String[] args) {
        final int C; //b become constant
        //once assigned any value, that variable becomes constant
        C=20;
        //c=25; throw error
        String a="a";
        Bahubali b = new Bahubali();
        b.gift();
        

    }
}
