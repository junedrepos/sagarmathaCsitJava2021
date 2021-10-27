package np.edu.scst.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class SwingDemo2 extends JFrame{
    SwingDemo2(){
        JMenuBar jMenuBar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        JMenu viewMenu = new JMenu("View");
        JMenu saveAsMenu = new JMenu("Save as");
        
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem pdfItem = new JMenuItem("pdf");
        JMenuItem pngItem = new JMenuItem("png");
        //ctrl + shift + dpwn arrow
        //ctrl + d
        saveAsMenu.add(pdfItem);
        saveAsMenu.add(pngItem);
        
        //disable the menuitem
        saveItem.setEnabled(true);
//        saveItem.disable();
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsMenu);
        
        jMenuBar.add(fileMenu);
        jMenuBar.add(viewMenu);
        
        
        //adding mnemonics and accelerators
//        fileMenu.setMnemonic(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
fileMenu.setMnemonic('f');
openItem.setAccelerator(
        KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
        

        
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.red);
        
        setLayout(new FlowLayout());
        add(jMenuBar);
        add(jPanel);
        
        setTitle("My second app");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new SwingDemo2();
    }
}
