package np.edu.scst.gui.eventhandling;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterDemo extends JFrame{
    MouseAdapterDemo(){
        JButton jButton = new JButton("Click me");
       
        jButton.addMouseListener(new MouseAdapter() {
          @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouse was clicked");
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouse was released");
            }
        });
        
        add(jButton);
        setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(1000,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}