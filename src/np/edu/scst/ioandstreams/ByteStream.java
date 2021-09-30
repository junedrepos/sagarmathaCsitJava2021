package np.edu.scst.ioandstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("apple.txt");
        FileOutputStream fos = new FileOutputStream("cat.txt", true);
     
       int i =0;
        //              assign                          check
        while(   (i=fis.read())         !=         -1           ){
            System.out.print((char) i);
            fos.write((char)i);
        }
        fos.write(13);
           String hello = "hello world";
           char[] c = hello.toCharArray();
           for(int j = 0; j<c.length;j++){
               fos.write(c[j]);
           }
          
//        fos.write(48);
        fis.close();
        fos.close();
    }
    
}
