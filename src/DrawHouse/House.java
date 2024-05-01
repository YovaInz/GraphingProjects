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

        g.setColor(new Color(85, 64, 43));
        g.fillRect(253, 440, 600, 28);
        g.setColor(new Color(12, 9, 8));
        g.fillRect(253, 440, 600, 18);

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
        g.fillRect(403, 305, 100, 80);
        g.setColor(new Color(49, 49, 45));
        g.fillRect(565, 315, 25, 20);// marco ventana pequeña
        g.fillRect(408, 310, 42, 70); // marco ventana grande lado izquierdo
        g.fillRect(456, 310, 42, 70); // marco ventana grande lado derecho
        g.setColor(new Color(92, 101, 108));
        g.fillRect(569, 319, 17, 13); // ventana pequeña
        g.fillRect(413, 315, 32, 60); // ventana grande lado izquierdo
        g.fillRect(461, 315, 32, 60); // ventana grande lado derecho
        g.setColor(new Color(49, 49, 45));
        g2d.setStroke(new BasicStroke(3));
        g.drawLine(413, 345, 445, 345); // detalles medios marco izquierdo
        g.drawLine(461, 345, 491, 345); // detalles medios marco derecho
        g2d.setStroke(new BasicStroke(1));
        g.drawLine(413, 330, 445, 330); // detalles horizontales marco izquierdo
        g.drawLine(461, 330, 491, 330); // detalles horizontales marco derecho
        g.drawLine(565, 325, 588, 325); // detalles horizontales marco pequeño
        g.drawLine(577, 315, 577, 333); // detalles verticales marco pequeño
        int x = 423;
        for (int i = 0; i < 2; i++) { // detalles verticales marcos grandes
            g.drawLine(x, 315, x, 345);
            g.drawLine(x + 48, 315, x + 48, 345);
            x += 11;
        }

        // ===== FACHADA ENTRADA =====
        g.setColor(new Color(243, 239, 240));
        // rejillas
        g.fillRect(380, 420, 255, 5);// parte inferior rejillas
        g.fillRect(380, 388, 255, 7);// parte superior rejillas

        // barras rejillas 1
        x = 382;
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

        // barandal 2 puerta xd

        g2d.setPaint(new GradientPaint(40, 0, new Color(127, 132, 145), 400, 0, new Color(112, 115, 120)));
        g.fillPolygon(new int[] { 300, 300, 330, 330 }, new int[] { 412, 378, 370, 402 }, 4);
        g.setColor(new Color(100, 102, 96));
        g.drawLine(300, 381, 330, 373);

        // pilar puerta

        g.setColor(new Color(166, 176, 187));
        g.fillRect(290, 307, 11, 110); // pilar puerta
        g.setColor(new Color(130, 125, 120));
        g.fillPolygon(new int[] { 301, 305, 305, 301 }, new int[] { 307, 309, 415, 418 }, 4); // sombra pilar puerta

        // barandal 1 puerta

        g2d.setColor(new Color(153, 150, 150));
        g.fillPolygon(new int[] { 265, 265, 297, 297 }, new int[] { 422, 388, 380, 412 }, 4);
        g.setColor(Color.gray);
        g.drawLine(265, 391, 296, 383);
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
        g.setColor(new Color(183, 178, 175));
        g.fillPolygon(new int[] { 261, 266, 266, 261 }, new int[] { 297, 300, 427, 430 }, 4); // sombra pilar 1
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

        // ===== PATIO =====
        g.setColor(new Color(175, 188, 201));
        g.fillPolygon(new int[] { 247, 207, 307, 342 }, new int[] { 468, 498, 498, 468 }, 4); // camino patio gris
                                                                                              // frente a escaleras
        g.fillRect(307, 475, 500, 23);// camino frente a casa y plantas
        g.fillPolygon(new int[] { 650, 680, 1015, 985 }, new int[] { 445, 475, 475, 445 }, 4); // camino patio gris
                                                                                               // frente a la cochera
        g.fillPolygon(new int[] { 680, 1550, 1885, 1015 }, new int[] { 475, 875, 875, 475 }, 4); // camino patio gris
                                                                                                 // frente a la cochera
        g.fillRect(985, 450, 45, 15);
        g.fillPolygon(new int[] { 1000, 1000, 1027, 1050 }, new int[] { 420, 435, 465, 465 }, 4); // camino patio gris
                                                                                                  // frente a la cochera
                                                                                                  // lado derecho

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
