import javax.swing.*;
import java.awt.*;

public class JTabbedPaneDemo {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Technologies");
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel panel1, panel2, panel3, panel4, panel5;
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        tabbedPane.addTab("Cricket", panel1);
        tabbedPane.addTab("Badminton ", panel2);
        tabbedPane.addTab("Football", panel3);
        tabbedPane.addTab("Basketball ", panel4);
        tabbedPane.addTab("Tennis", panel5);
        frame.add(tabbedPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 350);
        frame.setVisible(true);
    }
}