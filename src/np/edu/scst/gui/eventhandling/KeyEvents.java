package np.edu.scst.gui.eventhandling;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class KeyEvents extends JFrame{
    KeyEvents(){
        JTextField jTextField = new JTextField(20);
        
        jTextField.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("key is typed"); 
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("key is pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("key is released");
            }
        });
        
        add(jTextField);
      setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(1000,500);
        
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new KeyEvents();
    }
}
