package np.edu.scst.gui;
import javax.swing.*;
public class StandardDialogBox {
    public static void main(String[] args) {
                                                                //parent , message , title, message type
        JOptionPane.showMessageDialog(null, "Hello world from my first dialog box","Ordinay Message"
                                                                    , JOptionPane.PLAIN_MESSAGE);
           JOptionPane.showMessageDialog(null, "Critical message","Very Critical"
                                                                    , JOptionPane.ERROR_MESSAGE);
                                                                  
    }
}
