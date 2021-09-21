package np.edu.scst.ioandstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("apple.txt");
        FileOutputStream fos = new FileOutputStream("ball.txt");
        int i =0;
        while((i=fis.read())!=-1){
            System.out.print((char) i);
            fos.write(i);
        }
        fis.close();
        fos.close();
    }
    
}
