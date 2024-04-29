package DrawHouse;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class House extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        // g.fillOval(100, 100, 200, 200);
        // g.drawLine(500, 300, 530, 330);
        // ====== Dibujar Suelo y Cielo =======
        g.setColor(new Color(82, 101, 44));
        g.fillRect(0, 360, 1280, 360);
        g2d.setPaint(new GradientPaint(0, 0, new Color(93, 143, 196), 0, 400, new Color(164, 199, 232)));
        g.fillRect(0, 0, 1280, 360);
        // ====== Dibujar Garage ======
        g.setColor(new Color(243, 239, 240));
        g.fillRect(650, 300, 350, 145); // paredes
        g.setColor(new Color(162, 162, 173));
        g.drawLine(650, 300, 1000, 300);
        g.setColor(new Color(175, 188, 201));
        g.fillRect(650, 300, 25, 110); // sombras
        g.fillRect(650, 300, 350, 25); // sombras
        g.setColor(new Color(162, 162, 173));
        // patron de lineas
        int y = 308;
        for (int i = 0; i < 16; i++) {
            g.drawLine(650, y, 1000, y);
            y += 8;
        }

        g.setColor(new Color(178, 173, 170));
        g.fillRect(650, 435, 350, 10);

        g.setColor(new Color(83, 79, 80));
        g.fillRect(680, 330, 135, 120);// porton 1
        g.fillRect(835, 330, 135, 120);// porton 2
        g.setColor(new Color(18, 21, 16));
        g.fillRect(691, 338, 50, 15); // ventanas porton 1
        g.fillRect(753, 338, 50, 15); // ventanas porton 1
        g.fillRect(846, 338, 50, 15); // ventanas porton 2
        g.fillRect(908, 338, 50, 15); // ventanas porton 2
        g2d.setColor(new Color(30, 26, 26));
        g2d.setStroke(new BasicStroke(1));
        g2d.drawRect(688, 335, 55, 20); // parte izquierda puerta 1
        g2d.drawRect(688, 362, 55, 77); // parte izquierda puerta 1
        g2d.drawRect(690, 365, 51, 70); // parte izquierda puerta 1

        g2d.drawRect(750, 335, 55, 20); // parte derecha puerta 1
        g2d.drawRect(750, 362, 55, 77); // parte derecha puerta 1
        g2d.drawRect(752, 365, 51, 70); // parte derecha puerta 1

        g2d.drawRect(843, 335, 55, 20); // parte izquierda puerta 2
        g2d.drawRect(843, 362, 55, 77); // parte izquierda puerta 2
        g2d.drawRect(845, 365, 51, 70); // parte izquierda puerta 2

        g2d.drawRect(905, 335, 55, 20); // parte derecha puerta 2
        g2d.drawRect(905, 362, 55, 77); // parte derecha puerta 2
        g2d.drawRect(907, 365, 51, 70); // parte derecha puerta 2
        // g.setColor(new Color(213, 212, 219));
        // g.fillPolygon(new int[] { 500, 500, 100 }, new int[] { 150, 50, 150 }, 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HOUSE");
        House obj = new House();
        frame.add(obj);
        frame.setSize(1280, 720);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}