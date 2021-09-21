package np.edu.scst.ioandstreams;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CharacterStream {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File file = new File("apple.txt");//alt + enter
        FileReader fr = new FileReader(file);
        FileWriter fw = new FileWriter("ball.txt");
        int i = 0;
        while(  (i=fr.read())       != -1     ){
            //1st assign value     condition check
            System.out.print( (char)   i);
            fw.write(i);
        }
        fw.close();//compulsary
        fr.close();//compulsary
    }
}
