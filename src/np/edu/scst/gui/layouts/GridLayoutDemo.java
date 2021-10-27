package np.edu.scst.gui.layouts;
import javax.swing.*;//for swing components
import java.awt.*;//for layout classes
public class GridLayoutDemo extends JFrame{
   GridLayoutDemo(){
        JLabel jLabel = new JLabel("I am first Jlabel");
        JLabel jLabel2 = new JLabel("I am second Jlabel");
        JLabel jLabel3 = new JLabel("I am third Jlabel");
        JLabel jLabel4 = new JLabel("I am fourth Jlabel");
        
        setLayout(new GridLayout(2,2));
        
        add(jLabel);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        
        
        setVisible(true);
        setTitle("Flow Layout");
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
    
}
