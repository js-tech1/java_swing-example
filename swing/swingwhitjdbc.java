import javax.swing.*;  
import java.awt.event.*;  

public class swingwhitjdbc implements ActionListener {
    JTextField tf1;
    JButton b1;
    swingwhitjdbc()
    {
        JFrame f= new JFrame();  
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20); 

        b1=new JButton("submit");  
        b1.setBounds(120,200,50,50);  
        f.add(tf1);
        f.add(b1);
        b1.addActionListener(this); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(550, 350);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) { 
        
    }
    public static void main(String[] args) {
        new swingwhitjdbc();
    }
}
