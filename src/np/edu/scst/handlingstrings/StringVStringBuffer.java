package np.edu.scst.handlingstrings;

public class StringVStringBuffer {
     public static void main(String[] args) {
        String str1 = new String("apple");
        str1 = str1.concat(" ball");
        
         System.out.println(str1);//apple ball
         
         StringBuffer sb = new StringBuffer("apple");
         sb = sb.append(" ball");
         System.out.println(sb);// apple ball
         
         final int i = 10;
//         i =20;
        
    }
    
}
