package np.edu.scst.gui.layouts;
import javax.swing.*;//for swing components
import java.awt.*;//for layout classes
public class GroupLayoutDemo  extends JFrame{
   GroupLayoutDemo(){
      JButton north = new JButton("North");
      JButton south = new JButton("South");
      JButton west = new JButton("West");
      JButton east = new JButton("East");
      JButton center = new JButton("Center");
       
      JPanel jPanel = new JPanel();
      jPanel.setBackground(Color.red);
      GroupLayout groupLayout = new GroupLayout(jPanel);
      jPanel.setLayout(groupLayout);
      
      add(jPanel);
      groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup());
      
       
        
       add(BorderLayout.NORTH,north);
       add(BorderLayout.SOUTH,south);
       add(BorderLayout.WEST,west);
       add(BorderLayout.EAST,east);
       add(BorderLayout.CENTER,center);
       
        setVisible(true);
        setTitle("Flow Layout");
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new GroupLayoutDemo();
    }
    

}
