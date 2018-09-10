package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4Praktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g){

        // Lijn
        g.drawLine(10,20,231,20);
        g.drawString("Lijn",101,35);

        // Rechthoek
        g.drawRect(10,40,221,101);
        g.drawString("Rechthoek",91,155);

        // Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(240,40,221,101);
        g.setColor(Color.black);
        g.drawOval(240,40,221,101);
        g.drawString("Gevulde rechthoek met ovaal",271,155);

        // Taartpunt met ovaal er omheen
        g.setColor(Color.magenta);
        g.fillArc(470,30,221,101,0,45);
        g.setColor(Color.black);
        g.drawOval(470,30,221,101);
        g.drawString("Taartpunt met ovaal er omheen",500,155);

        // Afgeronde rechthoek
        g.drawRoundRect(10,180,221,101,30,30);
        g.drawString("Afgeronde rechthoek",60,295);

        // Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(270,180,221,101);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",335,295);

        // Cirkel
        g.drawOval(530,180,101,101);
        g.drawString("Cirkel",566,295);


    }
}