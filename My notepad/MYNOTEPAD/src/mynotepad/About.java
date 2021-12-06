package mynotepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    
    JButton b1;
    About(){
        setBounds(350, 100, 700,600);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("mynotepad/icons/windows.PNG"));
        Image i2 = i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 685, 170);
        add(l1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("mynotepad/icons/notepad.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(50, 135, 70, 70);
        add(l2);
        
        
        JLabel l3 = new JLabel("<html><br>We created this notepad.<br>Here you can create new text files.<br>You can also open the text files and edit them.<br>Notepad is a simple text editor for basic text-editing program<br> which enables users to deal with text documents.<br>Implementing Data Structures STACK,ARRAY(2D),LinearSearch<br><br>MEHMOOD UL HASSAN<br>EB20102057 </html>");
        
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l3.setBounds(150, 100, 500, 300);
        add(l3);
        
        b1 = new JButton("OK");
        b1.setBounds(580, 500, 80, 25);
        b1.addActionListener(this);
        add(b1);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }
    
}
