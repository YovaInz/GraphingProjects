package DrawHouse;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfaz extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(100, 100, 200, 200);
        g.drawLine(500, 300, 530, 330);
        g.fillRect(500, 300, 530, 330);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HOUSE");
        Interfaz obj = new Interfaz();
        frame.add(obj);
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}