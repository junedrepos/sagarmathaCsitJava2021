package np.edu.scst.gui;

import java.awt.Color;
import javax.swing.*;
import javax.swing.tree.*;

public class SwingDemo extends JFrame{
    SwingDemo(){
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.red);
        
        JButton jButton = new JButton("Click me");
        jButton.setToolTipText("Click this for magic");
        JButton jButton2 = new JButton("Click me for good luck");
        
        JLabel jLabel = new JLabel("I am a Label");
        JLabel jLabel2 = new JLabel("I am a Label 2");
        JTextField jTextField = new JTextField("This is pretext",20);
        JPasswordField jPasswordField = new JPasswordField(20);
        JCheckBox jCheckBox = new JCheckBox("I am a checkbox");
        JCheckBox jCheckBox2 = new JCheckBox("I am a checkbox 2");
        
        JRadioButton jRadioButton = new JRadioButton("Male");
        JRadioButton jRadioButton2 = new JRadioButton("Female");
        JRadioButton jRadioButton3 = new JRadioButton("Other");
        
        ButtonGroup buttonGroup = new ButtonGroup();
        
        String[] subjects = {"BCA","CSIT","BBA"};
        JComboBox jComboBox = new JComboBox(subjects);
        
        JList jList = new JList(subjects);
//        jList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        JTextArea jTextArea = new JTextArea(10,5);
         
        String[] header = {"Name","Roll No.", "Class"};
        
        String[][] tableContent = {
            {"Ram","10","7"},                                            
            {"Shyam","11","7"},                                            
            {"Hari","10","7"},                                            
        };
        //                                  body, head
        JTable jTable = new JTable(tableContent, header);
                                                                                                   //22, 22
        JScrollPane jScrollPane = new JScrollPane(jTable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
          jPanel.add(jScrollPane);
//        jPanel.add(jTable);
//jtree
DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("MenuBar");
DefaultMutableTreeNode menuNode = new DefaultMutableTreeNode("Menu");
DefaultMutableTreeNode menuItemNode = new DefaultMutableTreeNode("Menu Item");
DefaultMutableTreeNode menu2Node = new DefaultMutableTreeNode("Menu 2");
DefaultMutableTreeNode menuItem2Node = new DefaultMutableTreeNode("Menu Item 2");

menu2Node.add(menuItem2Node);

menuNode.add(menuItemNode);
menuNode.add(menu2Node);

rootNode.add(menuNode);

JTree jTree = new JTree(rootNode);

jPanel.add(jTree);
//0-horizontal alignment 1 - vertical alignment
//                                              alignment, minval, maxval, presetvalue
JSlider jSlider = new JSlider(1,0,100,77);
jPanel.add(jSlider);


//        jPanel.add(jTextArea);
      
        jPanel.add(jComboBox);
        jPanel.add(jList);
        
        
        
        
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);
        
        jPanel.add(jRadioButton);
        jPanel.add(jRadioButton2);
        jPanel.add(jRadioButton3);
        
        
        
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jPasswordField);
        jPanel.add(jCheckBox);
        jPanel.add(jCheckBox2);
        jPanel.add(jButton);
        jPanel.add(jButton2);
        jPanel.add(jLabel2);

        add(jPanel);
        
//        add(jButton);
//        add(jButton2);
        
        
        setTitle("My first swing application");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//2
    }
    public static void main(String[] args) {
         new SwingDemo();
//        JFrame j = new JFrame();
    }
}
