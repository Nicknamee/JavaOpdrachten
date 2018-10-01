package Hoofdstuk5;

import java.applet.*;
import java.awt.*;

public class Hoofdstuk5x2 extends Applet {
    int Valery;
    int Jeroen;
    int Hans;
    int Formule;

    public void init() {

        // De 5 niet veranderen!//
        Valery = 40 * 5;
        Jeroen = 100 * 5;
        Hans = 90 * 5;

        //Formule//
        Formule = 510;
    }

    public void paint(Graphics g) {

        setBackground(Color.WHITE);
        // KG
        g.drawRect(80, 10, 400, 500);
        g.drawString("0KG", 55, 520);
        g.drawString("20KG", 45, 415);
        g.drawString("40KG", 45, 315);
        g.drawString("60KG", 45, 215);
        g.drawString("80KG", 45, 115);
        g.drawString("100KG", 35, 15);

        // Lijnen
        g.drawLine(80, 410, 480, 410);
        g.drawLine(80, 310, 480, 310);
        g.drawLine(80, 210, 480, 210);
        g.drawLine(80, 110, 480, 110);

        // De namen
        g.drawString("Valery", 85, 525);
        g.drawString("Jeroen", 150, 525);
        g.drawString("Hans", 225, 525);

        // Valery
        g.setColor(Color.CYAN);
        g.fillRect(90, Formule - Valery, 30, Valery);

        // Jeroen
        g.setColor(Color.MAGENTA);
        g.fillRect(155, Formule - Jeroen, 30, Jeroen);

        // Hans
        g.setColor(Color.PINK);
        g.fillRect(220, Formule - Hans, 30, Hans);
    }

}