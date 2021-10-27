package np.edu.scst.gui;

import javax.swing.JOptionPane;
public class InputDialogBoxDemo {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Please enter your name");
        System.out.println(name);
    }
}
