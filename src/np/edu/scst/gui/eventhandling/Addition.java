package np.edu.scst.gui.eventhandling;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Addition extends JFrame{
    Addition(){
        JTextField jTextField = new JTextField(20);
        JTextField jTextField2 = new JTextField(20);
        JButton jButton = new JButton("Sum");
        JLabel jLabel = new JLabel("Result is:        ");
        
        jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    String no1 = jTextField.getText();
                    String no2 = jTextField2.getText();
                    int result = Integer.valueOf(no1)+Integer.valueOf(no2);
                    jLabel.setText("Result is: "+result);
            }
        
        });
        
        add(jTextField);
        add(jTextField2);
        add(jButton);
        add(jLabel);
        
        setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(1000,500);
        setTitle("Addition");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new Addition();
    }
}
