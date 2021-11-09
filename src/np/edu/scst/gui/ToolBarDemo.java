package np.edu.scst.gui;
import javax.swing.*;//for swing components
import java.awt.*;//for layout classes

public class ToolBarDemo extends JFrame{
    ToolBarDemo(){
        JButton jButton = new JButton("Pencil");
        JLabel jLabel = new JLabel("Line");
        JCheckBox jCheckBox = new JCheckBox("Fill");
        //horizontal = 0; vertical = 1; for orientation
        JToolBar jToolBar = new JToolBar("My ToolBar",1);
        
        jToolBar.add(jButton);
        jToolBar.add(jLabel);
        jToolBar.add(jCheckBox);
        
        setLayout(new BorderLayout());
        
        add(BorderLayout.EAST,jToolBar);
        
        setTitle("ToolBar Demo");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new ToolBarDemo();
    }
}
