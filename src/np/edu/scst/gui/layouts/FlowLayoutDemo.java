package np.edu.scst.gui.layouts;
import javax.swing.*;//for swing components
import java.awt.*;//for layout classes
public class FlowLayoutDemo extends JFrame{
    FlowLayoutDemo(){
        JLabel jLabel = new JLabel("I am first Jlabel");
        JLabel jLabel2 = new JLabel("I am second Jlabel");
        
        setLayout(new FlowLayout());
        
        add(jLabel);
        add(jLabel2);
        
        
        setVisible(true);
        setTitle("Flow Layout");
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
    
}
