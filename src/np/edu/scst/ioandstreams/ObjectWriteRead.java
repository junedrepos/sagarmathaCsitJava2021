package np.edu.scst.ioandstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectWriteRead {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
//        System.out.println("Writing of object");
//        Player p1 = new Player(1, "Ram", 7);
//        FileOutputStream fos  = new FileOutputStream("score.ser");
//        ObjectOutputStream  oos = new ObjectOutputStream(fos);
//        oos.writeObject(p1);
//        oos.close();fos.close();
        System.out.println("Reading object from file");
        FileInputStream fis = new FileInputStream("score.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Player scoreFromFile = (Player) ois.readObject();
        System.out.println("The score of the player is:");
        System.out.println(scoreFromFile.id);
        System.out.println(scoreFromFile.name);
        System.out.println(scoreFromFile.score);
        
    }
}

class Player implements Serializable{
    int id;
    String name;
    int score;
    static int money;
    public Player(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    
}