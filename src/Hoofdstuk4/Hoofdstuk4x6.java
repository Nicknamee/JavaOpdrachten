package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk4x6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        // Stoplicht achterkant kleur
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect(20,20,100,200,10,20);

        // Stoplicht kleuren
        g.setColor(Color.RED);
        g.fillOval(45,30,50,50);

        g.setColor(Color.ORANGE);
        g.fillOval(45,90,50,50);

        g.setColor(Color.GREEN);
        g.fillOval(45,150,50,50);

        // Stoplicht paal
        g.setColor(Color.lightGray);
        g.fillRect(55,220,30,400);
    }
}