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

        // ===== ENTRADA =====

        g.setColor(new Color(144, 153, 163));
        g.fillRect(322, 304, 50, 120); // pared puerta principal
        g.setColor(new Color(124, 132, 143));
        g.drawLine(326, 315, 373, 315); // patron de pared
        y = 322;
        for (int i = 0; i < 13; i++) {
            g.drawLine(326, y, 332, y);
            y += 7;
        }
        g.setColor(new Color(85, 95, 104));
        g.drawLine(325, 315, 325, 405);
        g.setColor(new Color(115, 130, 141));
        g.drawLine(333, 315, 333, 405);

        g.setColor(new Color(239, 203, 193));
        g.fillPolygon(new int[] { 328, 325, 240 }, new int[] { 405, 432, 432 }, 3); // piso entrada
        g.fillRect(325, 405, 317, 28); // piso entrada
        g.setColor(new Color(130, 114, 108));
        g.fillPolygon(new int[] { 325, 325, 287 }, new int[] { 405, 418, 418 }, 3); // sombra piso entrada
        g.fillRect(325, 405, 317, 13); // sombra piso entrada

        g.setColor(new Color(26, 33, 46));
        g.fillRect(337, 315, 25, 90); // Puerta principal
        g.setColor(new Color(92, 101, 108));
        y = 323;
        for (int i = 0; i < 4; i++) {
            g.fillRect(342, y, 10, 12); // ventanas de la puerta
            y += 13;
        }
        g.setColor(new Color(105, 109, 108));
        g.fillRect(338, 365, 2, 10); // manija pieza 1
        g.fillOval(337, 360, 4, 4); // manija pieza 2
        g.fillOval(337, 375, 3, 3); // manija pieza 3

        g.setColor(new Color(170, 161, 157));
        g.fillRect(355, 300, 205, 118);// Pared 1 entrada
        g.fillRect(560, 300, 75, 108);// pared 2 entrada
        g.setColor(new Color(155, 143, 138));
        y = 308;
        for (int i = 0; i < 14; i++) {
            g.drawLine(645, y, 560, y);
            y += 7;
        }
        g.drawLine(560, 300, 560, 410);
        g.drawLine(555, 300, 555, 410);
        y = 308;
        for (int i = 0; i < 13; i++) {
            g.drawLine(555, y, 360, y);
            y += 8;
        }
        g.setColor(new Color(177, 172, 169));
        g.fillRect(390, 305, 100, 80);
        g.setColor(new Color(24, 28, 38));
        g.fillRect(565, 315, 25, 20);// ventana pequeña
        g.fillRect(395, 310, 42, 70); // ventana grande lado izquierdo
        g.fillRect(443, 310, 42, 70); // ventana grande lado derecho

        // ===== FACHADA ENTRADA =====
        g.setColor(new Color(243, 239, 240));
        // rejillas
        g.fillRect(380, 420, 255, 5);// parte inferior rejillas
        g.fillRect(380, 388, 255, 7);// parte superior rejillas

        // barras rejillas 1
        int x = 382;
        for (int i = 0; i < 15; i++) {
            g.fillRect(x, 395, 3, 25);
            x += 8;
        }
        // barras rejillas 2
        x = 517;
        for (int i = 0; i < 15; i++) {
            g.fillRect(x, 395, 3, 25);
            x += 8;
        }
        g.setColor(new Color(162, 162, 173));
        g.drawLine(640, 390, 380, 390);
        // pilares
        g.setColor(new Color(243, 239, 240));
        g.fillRect(246, 300, 15, 130);// pilar 1
        g.fillRect(248, 443, 11, 10);// pilar 1 parte inferior
        x = 365;
        for (int i = 0; i < 3; i++) { // pilares 2, 3 y 4
            g.fillRect(x, 300, 15, 130);
            g.fillRect((x + 2), 443, 11, 10);
            x += 135;
        }
        g.fillRect(243, 432, 407, 10);// base

        g.setColor(new Color(175, 188, 201));
        g.fillRect(246, 300, 15, 23); // sombra pilar 1
        g.fillRect(248, 442, 11, 4);// sombra pilar 1 parte inferior
        x = 365;
        for (int i = 0; i < 3; i++) { // sombras pilares 2, 3 y 4
            g.fillRect(x, 300, 15, 23);
            g.fillRect((x + 2), 442, 11, 4);
            x += 135;
        }
        // ===== ESCALERAS =====
        g.setColor(new Color(243, 239, 240));
        g.fillPolygon(new int[] { 259, 247, 253, 265 }, new int[] { 431, 458, 458, 431 }, 4); // escalera izquierda
        g.setColor(new Color(208, 191, 184));
        g.fillRect(247, 458, 6, 10); // escalera izquierda parte frontal
        g.setColor(new Color(161, 154, 154));
        g.fillPolygon(new int[] { 265, 253, 253, 265 }, new int[] { 431, 458, 468, 441 }, 4); // sombra escalera
                                                                                              // izquierda

        g2d.setStroke(new BasicStroke(5));
        g.setColor(new Color(239, 203, 193));
        g.drawLine(259, 456, 340, 456);// primer escalon
        g.drawLine(264, 446, 340, 446);// segundo escalon

        g.setColor(new Color(243, 239, 240));
        g.fillPolygon(new int[] { 349, 337, 343, 355 }, new int[] { 431, 458, 458, 431 }, 4); // escalera derecha
        g.setColor(new Color(208, 191, 184));
        g.fillRect(337, 458, 6, 10); // escalera derecha parte frontal
        g.setColor(new Color(161, 154, 154));
        g.fillPolygon(new int[] { 355, 343, 343, 355 }, new int[] { 431, 458, 468, 441 }, 4); // sombra escalera derecha
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
