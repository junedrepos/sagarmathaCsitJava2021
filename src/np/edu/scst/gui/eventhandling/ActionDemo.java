package np.edu.scst.gui.eventhandling;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class ActionDemo extends JFrame implements ActionListener{
    ActionDemo(){
        JButton jButton = new JButton("Click me");
        JButton jButton2 = new JButton("Click me for good luck");
        
        jButton.addActionListener(this);
        jButton2.addActionListener(this);
        
        add(jButton);
        add(jButton2);
        
        setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(1000,500);
        setTitle("Desktop Pane Demo");
        setDefaultCloseOperation(2);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Button was clicked");
    }
    
    public static void main(String[] args) {
        new ActionDemo();
    }
}
