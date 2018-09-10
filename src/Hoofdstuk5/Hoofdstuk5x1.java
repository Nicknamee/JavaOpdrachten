package Hoofdstuk5;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk5x1 extends Applet {
    Color magenta;
    Color zwart;
    int hoogte;
    int breedte;
    int y1;
    int y2;
    int y3;


    public void init() {
        magenta = Color.MAGENTA;
        zwart   = Color.BLACK;
        hoogte  = 101;
        breedte = 221;
        y1 = 180;
        y2 = 40;
        y3 = 30;



    }

    public void paint(Graphics g){

        // Lijn
        g.drawLine(10,20,231,20);
        g.drawString("Lijn",101,35);

        // Rechthoek
        g.drawRect(10,y2,breedte,hoogte);
        g.drawString("Rechthoek",91,155);

        // Gevulde rechthoek met ovaal
        g.setColor(magenta);
        g.fillRect(240,y2,breedte,hoogte);
        g.setColor(zwart);
        g.drawOval(240,y2,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",271,155);

        // Taartpunt met ovaal er omheen
        g.setColor(magenta);
        g.fillArc(470,y3,breedte,hoogte,0,45);
        g.setColor(zwart);
        g.drawOval(470,y3,breedte,hoogte);
        g.drawString("Taartpunt met ovaal er omheen",500,155);

        // Afgeronde rechthoek
        g.drawRoundRect(10,y1,breedte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek",60,295);

        // Gevulde ovaal
        g.setColor(magenta);
        g.fillOval(270,y1,breedte,hoogte);
        g.setColor(zwart);
        g.drawString("Gevulde ovaal",335,295);

        // Cirkel
        g.drawOval(530,y1,101,hoogte);
        g.drawString("Cirkel",566,295);


    }
}
