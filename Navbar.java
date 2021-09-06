import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class Navbar extends JPanel {
    public Navbar(){

        JLabel label =  new JLabel();
        label.setBounds(10, 0, 100, 50);
        label.setText("Split UP");
        label.setBackground(new Color(23,23,23));
        label.setLayout(null);
        label.setFont(new Font("Trebuchet", Font.BOLD + Font.ITALIC, 25));
        label.setForeground(Color.white);


        this.setBackground(new Color(23, 23, 23));
        this.setBounds(0, 0, 800, 50);
        this.add(label);
        this.setLayout(null);
    }
    
}