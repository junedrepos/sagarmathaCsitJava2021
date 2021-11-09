package np.edu.scst.gui.eventhandling;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MouseDemo extends JFrame{
    MouseDemo(){
        JButton jButton = new JButton("Click me");
       
        jButton.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouse was clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mouse was pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouse was released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse was entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouse was exited");
         
            }
            
        });
        
        add(jButton);
        setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(1000,500);
        setTitle("Addition");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new MouseDemo();
    }
}
