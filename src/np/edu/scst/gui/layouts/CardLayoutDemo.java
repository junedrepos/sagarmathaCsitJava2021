package np.edu.scst.gui.layouts;
import javax.swing.*;//for swing components
import java.awt.*;//for layout classes

public class CardLayoutDemo extends JFrame{
    CardLayoutDemo(){
        JLabel jLabel = new JLabel("I am first Jlabel");
        JLabel jLabel2 = new JLabel("I am second Jlabel");
        
        jLabel.setBounds(10,10,50,20);
        jLabel2.setBounds(10,30,50,40);
        
        add(jLabel);
        add(jLabel2);
        
        setVisible(true);
        setTitle("Card Layout");
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
