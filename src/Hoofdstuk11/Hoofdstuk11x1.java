package Hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class Hoofdstuk11x1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller < 11; teller++) {
            x += 20;
            g.drawLine(x ,20,x,80 );
            g.drawString("" + teller, x,110 );
        }
    }
}