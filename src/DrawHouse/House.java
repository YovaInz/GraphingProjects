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
        g.fillRect(322, 300, 50, 124); // pared puerta principal
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
        g.drawLine(300, 381, 329, 373); // lineas superiores
        g.setColor(new Color(100, 103, 97));
        g.drawLine(300, 385, 329, 376); // lineas superiores

        g.setColor(new Color(120, 133, 158)); // lineas verticales
        x = 327;
        y = 377;
        for (int i = 0; i < 30; i++) {
            g.drawLine(x, y, x, y + 23);
            x -= 2;
            if (i % 3 == 0)
                y += 2;
        }

        // pilar puerta

        g.setColor(new Color(166, 176, 187));
        g.fillRect(290, 307, 11, 110); // pilar puerta
        g.setColor(new Color(130, 125, 120));
        g.fillPolygon(new int[] { 301, 305, 305, 301 }, new int[] { 307, 309, 415, 418 }, 4); // sombra pilar puerta

        // barandal 1 puerta

        g.setColor(new Color(167, 168, 181));
        g.fillPolygon(new int[] { 265, 265, 297, 297 }, new int[] { 422, 388, 380, 412 }, 4);
        g.setColor(Color.gray);
        g.drawLine(265, 391, 296, 383); // lineas superiores
        g.setColor(new Color(142, 136, 136));
        g.drawLine(265, 395, 296, 387); // lineas superiores

        g.setColor(new Color(157, 151, 163)); // lineas verticales
        x = 294;
        y = 387;
        for (int i = 0; i < 20; i++) {
            g.drawLine(x, y, x, y + 23);
            x -= 2;
            if (i % 3 == 0)
                y += 2;
        }

        // techo entrada

        g.setColor(new Color(146, 145, 131));
        g.fillPolygon(new int[] { 260, 325, 325 }, new int[] { 300, 300, 315 }, 3);
        g.setColor(new Color(123, 124, 121));
        g2d.setStroke(new BasicStroke(3));
        g.drawLine(250, 300, 672, 300); // techo parte 1
        g.setColor(new Color(194, 193, 200));
        g.drawLine(221, 297, 672, 297); // techo parte 2

        // pilares
        g.setColor(new Color(243, 239, 240));
        g.fillRect(246, 301, 15, 129);// pilar 1
        g.fillRect(248, 443, 11, 10);// pilar 1 parte inferior
        x = 365;
        for (int i = 0; i < 3; i++) { // pilares 2, 3 y 4
            g.fillRect(x, 301, 15, 129);
            g.fillRect((x + 2), 443, 11, 10);
            x += 135;
        }
        g.fillRect(243, 432, 407, 10);// base
        g.setColor(new Color(183, 178, 175));
        g.fillPolygon(new int[] { 261, 266, 266, 261 }, new int[] { 301, 303, 427, 430 }, 4); // sombra pilar 1
        g.setColor(new Color(191, 197, 211));
        g.fillRect(246, 301, 15, 22); // sombra pilar 1
        g.fillRect(248, 442, 11, 4);// sombra pilar 1 parte inferior
        x = 365;
        for (int i = 0; i < 3; i++) { // sombras pilares 2, 3 y 4
            g.fillRect(x, 301, 15, 23);
            g.fillRect((x + 2), 442, 11, 4);
            x += 135;
        }
        g2d.setStroke(new BasicStroke(1));
        g.setColor(new Color(89, 85, 76));
        g.drawLine(246, 301, 261, 301); // sombra superior pilar 1
        x = 365;
        for (int i = 0; i < 3; i++) {
            g.drawLine(x, 301, x + 15, 301); // sombra superior pilar 2, 3 y 4
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

        // ====== TECHO ========

        ////////// PARTE DE VICTORIA/////////////

        g.setColor(new Color(123, 124, 121));
        g2d.setStroke(new BasicStroke(3));
        g.drawLine(651, 302, 1020, 302); // techo parte 1
        g.setColor(new Color(194, 193, 200));
        g.drawLine(675, 299, 1020, 299); // techo parte 2
        g.setColor(new Color(243, 239, 240));
        g2d.setStroke(new BasicStroke(3));
        g.drawLine(675, 297, 1020, 297); // techo parte 3
        g.setColor(new Color(198, 195, 197));
        g2d.setStroke(new BasicStroke(5));
        g.drawLine(675, 293, 1020, 293);
        g.fillPolygon(new int[] { 1020, 1020, 1025}, new int[] { 290, 297, 290},3);
        g.setColor(new Color(154, 151, 153));
        g.fillPolygon(new int[] { 400, 400, 1025, 930}, new int[] { 180, 291, 291, 180 },4); //trapecio del techo
        g.setColor(new Color(83, 79, 80));
        g.fillPolygon(new int[] { 740, 759, 775, 759}, new int[] { 207, 260, 254, 204 },4); //sombra en el techo 1
        g.fillPolygon(new int[] { 870, 869, 888, 868}, new int[] { 207, 255, 258, 204 },4); //sombra en el techo 2

        g.setColor(new Color(243, 239, 240));
        g.fillRect(779, 190, 93, 72);// pared frontal cuarto arriba de cochera
        g.fillPolygon(new int[] { 830, 779, 872}, new int[] { 150, 190, 190 },3); //pared arriba cuarto sobre cochera

        g.setColor(new Color(121, 121, 122));
        g.fillPolygon(new int[] { 872, 872, 900}, new int[] { 190, 208, 205},3); //parte sombreada bajo el techo del cuarto
        g.setColor(new Color(162, 162, 173));
        g2d.setStroke(new BasicStroke(1));
        x = 786;
        for (int i = 0; i < 16; i++) { // Patron de lineas de los cuartos de arriba
            g.drawLine(x, 200, x, 262);
            if (i%2==0) {
                x+=7;
            }else x+=3;
        }
        y = 190;
        x=786;
        int x2=865;
        for (int i = 0; i < 4; i++) {
            g.drawLine(x, y, (x2-4), y);
            y -= 8;
            x+=5;
            x2-=15;
        }
        g.drawLine(862, 190, 789, 150); //detalle de linea 
        g.drawLine(786, 200, 789, 200); //detalle de linea 
        g.drawLine(849, 200, 862, 200); //detalle de linea 


        g.setColor(new Color(253, 249, 250));
        g.fillRect(790, 192, 70, 63);// antemarco ventanas

        g.setColor(new Color(49, 49, 45));
        g.fillRect(795, 200, 26, 50);//marco ventana 1
        g.fillRect(829, 200, 26, 50);//marco ventana 2
        g.setColor(new Color(92, 101, 108));
        g.fillRect(799, 204, 18, 42); //ventana 1
        g.fillRect(833, 204, 18, 42); //ventana 2
        g.setColor(new Color(49, 49, 45));
        g2d.setStroke(new BasicStroke(3));
        g.drawLine(833, 225, 851, 225); //DETALLES VENTANAS
        g.drawLine(799, 225, 818, 225);
        g2d.setStroke(new BasicStroke(1));
        g.drawLine(799, 214, 818, 214);
        g.drawLine(833, 214, 851, 214);
        g.drawLine(808, 204, 808, 225);
        g.drawLine(842, 204, 842, 225);

        //sombras
        g.setColor(new Color(32, 30, 30, 50));
        g.fillPolygon(new int[] { 830,873, 873, 830, 779, 779}, new int[] { 165, 191, 216, 190, 220, 195},6); //techo del cuarto sobre cochera

        g.setColor(new Color(213, 215, 218));
        g.fillPolygon(new int[] { 826, 822, 830, 834}, new int[] { 171, 190, 190, 171 },4); //sostenedor de techo pt 1
        g.setColor(new Color(253, 249, 250));
        g.fillRect(826, 163, 8,8); //sostenedor de techo pt 2 (cuadrito)
        g.fillPolygon(new int[] { 830,900, 900, 830, 760, 760}, new int[] { 150, 190, 205, 165, 205, 190 },6); //techo del cuarto sobre cochera
        g.setColor(new Color(147, 155, 168));
        g.fillPolygon(new int[] { 779,760, 779}, new int[] { 195, 204, 262},3); //costado con sombra del cuarto
        g.setColor(new Color(125, 122, 124));
        g.fillPolygon(new int[] { 738, 741, 760,760}, new int[] { 204, 214, 205, 190},4); //costado con sombra del techo del cuarto

        g.drawLine(830, 157, 760, 197); //linea 1 (detalle) techo del cuarto
        g.drawLine(830, 157, 900, 197); //linea 2 (detalle) techo del cuarto
        g.fillPolygon(new int[] { 822,823, 826}, new int[] { 172, 190, 167},3); //sombra del sostenedor de techo
        g.setColor(new Color(59, 59, 55));
        g.drawLine(760, 197, 740, 209); //linea 3 (detalle) techo del cuarto
        g.setColor(new Color(147, 155, 168));
        g2d.setStroke(new BasicStroke(2));
        g.drawLine(830, 166, 760, 205); //detalle de sombra bajo sostenedor de techo
        g.setColor(new Color(121, 121, 122));
        g.drawLine(830, 166, 900, 205); //detalle de sombra bajo sostenedor de techo


        ////////// PARTE DE YOVANNI/////////////

        g.setColor(new Color(228, 225, 221));
        g.fillRect(322, 202, 50, 90); // paredsita
        g.setColor(new Color(75, 72, 77));
        g.fillRect(339, 206, 50, 70); // marco ventanita
        g.setColor(new Color(156, 178, 203));
        g.fillRect(343, 209, 12, 70); // ventanita
        g2d.setStroke(new BasicStroke(3));
        g.setColor(new Color(75, 72, 77));
        g.drawLine(343, 235, 355, 235); // separacion ventanita
        g2d.setStroke(new BasicStroke(1));
        g.drawLine(343, 222, 355, 222); // detalles horizontal ventanita
        g.drawLine(352, 206, 352, 235); // detalles vertical ventanita

        // tejadito
        g.setColor(new Color(162, 168, 172));
        g2d.setStroke(new BasicStroke(5));
        g.drawLine(302, 200, 355, 200); // bordillo 2
        g.setColor(new Color(208, 218, 220));
        g2d.setStroke(new BasicStroke(1));
        g.drawLine(302, 200, 355, 200); // detalle bordillo
        g.setColor(new Color(109, 107, 112));
        g.fillRect(300, 195, 100, 5); // borde
        // tejadito 1
        g.setColor(new Color(169, 165, 166));
        g.fillPolygon(new int[] { 300, 414, 414, 345 }, new int[] { 195, 195, 123, 123 }, 4); // tejadito izquierdo
        g.fillPolygon(new int[] { 665, 414, 414, 658 }, new int[] { 175, 195, 123, 123 }, 4); // tejadito derecho
        g.setColor(new Color(110, 111, 106));
        g.fillPolygon(new int[] { 660, 660, 668, 680 }, new int[] { 175, 195, 200, 175 }, 4); // sombra tejado

        g2d.setStroke(new BasicStroke(5));
        g.setColor(new Color(121, 115, 116));
        g.drawLine(220, 293, 672, 293); // bordillo
        g2d.setStroke(new BasicStroke(1));
        g.setColor(new Color(140, 138, 141));
        g.drawLine(217, 293, 672, 293); // linea bordillo
        g.setColor(new Color(169, 165, 166));
        g.fillPolygon(new int[] { 220, 672, 560, 355 }, new int[] { 291, 291, 257, 257 }, 4); // trapecio techo entrada
        g.setColor(new Color(246, 246, 246));
        g.fillRect(355, 157, 205, 100); // Pared 1 2do piso
        g.fillRect(560, 161, 100, 88); // pared 2 2do piso
        g.fillPolygon(new int[] { 355, 660, 507 }, new int[] { 161, 161, 70 }, 3); // Triangulo mayor 2do piso
        g.setColor(new Color(255, 250, 250));
        g.fillPolygon(new int[] { 331, 456, 456, 331 }, new int[] { 183, 100, 85, 168 }, 4); // orilla izquierda frente
        g.fillPolygon(new int[] { 581, 456, 456, 581 }, new int[] { 183, 100, 85, 168 }, 4); // orilla derecha frente
        g.fillPolygon(new int[] { 475, 507, 507, 463 }, new int[] { 98, 76, 61, 92 }, 4); // orilla izquierda atras
        g.fillPolygon(new int[] { 680, 507, 507, 680 }, new int[] { 189, 76, 61, 174 }, 4); // orilla derecha atras

        g.setColor(new Color(170, 170, 170));
        g.drawLine(331, 175, 456, 92);
        g.drawLine(580, 175, 456, 92);
        g.drawLine(470, 93, 507, 68);
        g.drawLine(507, 68, 679, 181);

        // ventanas
        g.setColor(new Color(61, 60, 68));
        g.fillRect(414, 161, 42, 17); // marco ventana izquierda arriba
        g.fillRect(414, 182, 42, 71); // marco ventana izquierda abajo
        g.fillRect(460, 161, 42, 17); // marco ventana derecha arriba
        g.fillRect(460, 182, 42, 71); // marco ventana derecha abajo
        g.fillRect(567, 182, 35, 53); // marco ventana 2 izquierda
        g.fillRect(605, 182, 35, 53); // marco ventana 2 derecha

        g.setColor(new Color(148, 178, 209));
        g.fillRect(417, 164, 36, 11); // ventana izquierda arriba
        g.fillRect(417, 185, 36, 65); // ventana izquierda abajo
        g.fillRect(463, 164, 36, 11); // ventana derecha arriba
        g.fillRect(463, 185, 36, 65); // ventana derecha abajo
        g.fillRect(570, 185, 29, 47); // ventana 2 izquierda
        g.fillRect(608, 185, 29, 47); // ventana 2 derecha

        g.setColor(new Color(61, 60, 68));
        g.drawLine(428, 161, 428, 176); // detalles ventana izquierda arriba
        g.drawLine(442, 161, 442, 176); // detalles ventana izquierda arriba
        g.drawLine(428, 182, 428, 217); // detalles ventana izquierda abajo
        g.drawLine(442, 182, 442, 217); // detalles ventana izquierda abajo
        g.drawLine(474, 161, 474, 176); // detalles ventana derecha arriba
        g.drawLine(488, 161, 488, 176); // detalles ventana derecha arriba
        g.drawLine(474, 182, 474, 217); // detalles ventana derecha abajo
        g.drawLine(488, 182, 488, 217); // detalles ventana derecha abajo
        g.drawLine(585, 185, 585, 234); // detalles ventana izquierda 2
        g.drawLine(623, 185, 623, 234); // detalles ventana izquierda 2
        g.drawLine(415, 200, 453, 200); // detalles horizontales ventana izquierda abajo
        g.drawLine(461, 200, 500, 200); // detalles horizontales ventana derecha abajo
        g.drawLine(570, 200, 600, 200); // detalles horizontales ventana izquierda 2
        g.drawLine(570, 215, 600, 215); // detalles horizontales ventana izquierda 2
        g.drawLine(608, 200, 638, 200); // detalles horizontales ventana derecha 2
        g.drawLine(608, 215, 638, 215); // detalles horizontales ventana derecha 2

        g2d.setStroke(new BasicStroke(3));
        g.drawLine(415, 217, 453, 217);
        g.drawLine(461, 217, 500, 217);
        // sombras
        g.setColor(new Color(0, 0, 0, 58)); // sombras (opacidad)
        g.fillPolygon(new int[] { 355, 456, 456, 331 }, new int[] { 198, 130, 100, 183 }, 4); // orilla izquierda frente
        g.fillPolygon(new int[] { 560, 456, 456, 560 }, new int[] { 198, 130, 100, 168 }, 4); // orilla derecha frente
        g.fillPolygon(new int[] { 496, 507, 507, 476 }, new int[] { 112, 106, 76, 98 }, 4); // orilla izquierda atras
        g.fillPolygon(new int[] { 659, 507, 507, 659 }, new int[] { 204, 106, 76, 174 }, 4); // orilla derecha atras
        g.fillPolygon(new int[] { 660, 660, 671, 678 }, new int[] { 230, 188, 195, 235 }, 4); // sombrita tejadito
    }

    // sisisiisisi
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
