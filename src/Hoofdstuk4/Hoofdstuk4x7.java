package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk4x7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        // Dobbelsteen vorm
        g.drawRoundRect(20,20,200,200,30,30);

        // Rondjes
        g.setColor(Color.BLACK);
        g.fillOval(40,40,60,60);
        g.fillOval(140,40,60,60);
        g.fillOval(40,130,60,60);
        g.fillOval(140,130,60,60);
    }

}