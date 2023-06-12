import javax.swing.*;
import java.awt.*;

public class JLabelDemo extends JFrame {
    JLabel jl;

    JLabelDemo() {
        jl = new JLabel("Good Morning");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.blue);
        Font f = new Font("arial", Font.BOLD, 34);
        jl.setFont(f);
        jl.setBackground(Color.white);
        c.add(jl);
        this.setVisible(true);
        this.setSize(400, 400);
        this.setTitle("Label");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JLabelDemo();
    }
}
