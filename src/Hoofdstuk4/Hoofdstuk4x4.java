package Hoofdstuk4;

import java.applet.*;
import java.awt.*;

public class Hoofdstuk4x4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        setBackground(Color.WHITE);
        // KG
        g.drawRect(80,10,400,500);
        g.drawString("0KG",55,520);
        g.drawString("20KG", 50, 400);
        g.drawString("40KG", 50, 300);
        g.drawString("60KG", 50, 200);
        g.drawString("80KG", 50, 100);
        g.drawString("100KG", 40, 15);

        // Lijnen
        g.drawLine(80,400, 480, 400);
        g.drawLine(80,300,480,300);
        g.drawLine(80,200,480,200);
        g.drawLine(80,100,480,100);

        // De namen
        g.drawString("Valery",85,525);
        g.drawString("Jeroen",150,525);
        g.drawString("Hans", 225,525);

        // Valery
        g.setColor(Color.CYAN);
        g.fillRect(90, 300, 30, 209);

        // Jeroen
        g.setColor(Color.MAGENTA);
        g.fillRect(155,10,30,500);

        // Hans
        g.setColor(Color.PINK);
        g.fillRect(220, 100, 30,410);
    }






    }
