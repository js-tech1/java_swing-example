import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LookAndFeelDemo {
    static JFrame jf;

    public static void main(String[] args) {
        jf = new JFrame();
        jf.setSize(250, 250);
        FlowLayout ob = new FlowLayout();
        jf.setLayout(ob);
        JButton jb1 = new JButton("Metal");
        JButton jb2 = new JButton("Nimbus");
        JButton jb3 = new JButton("Motif");
        JButton jb4 = new JButton("Windows");
        MyListener ob1 = new MyListener();
        jb1.addActionListener(ob1);
        jb2.addActionListener(ob1);
        jb3.addActionListener(ob1);
        jb4.addActionListener(ob1);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.setVisible(true);
    }
}

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
        try {
            String buttonname = ae.getActionCommand();
            if (buttonname.equals("Metal")) {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                SwingUtilities.updateComponentTreeUI(LookAndFeelDemo.jf);
            } else if (buttonname.equals("Nimbus")) {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.NimbusLookAndFeel");
                SwingUtilities.updateComponentTreeUI(LookAndFeelDemo.jf);
            } else if (buttonname.equals("Motif")) {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MotifLookAndFeel");
                SwingUtilities.updateComponentTreeUI(LookAndFeelDemo.jf);
            } else if (buttonname.equals("Windows")) {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.WindowsLookAndFeel");
                SwingUtilities.updateComponentTreeUI(LookAndFeelDemo.jf);
            }
        } catch (Exception e1) {
        }
    }
}