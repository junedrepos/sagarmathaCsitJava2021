package np.edu.scst.gui.layouts;
import javax.swing.*;//for swing components
import java.awt.*;//for layout classes
public class GroupLayoutDemo  extends JFrame{
   GroupLayoutDemo(){
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(groupLayout);
        
        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(jButton1).addComponent(jButton2)
                            .addGroup(groupLayout.createParallelGroup()
                                    .addComponent(jButton3).addComponent(jButton4))
        
        );
        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                      .addGroup(groupLayout.createParallelGroup()
                            .addComponent(jButton1).addComponent(jButton2).addComponent(jButton3).addComponent(jButton4))
        );
        
        
        
        
        
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new GroupLayoutDemo();
    }
    

}
