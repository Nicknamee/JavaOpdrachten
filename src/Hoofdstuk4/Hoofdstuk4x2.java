package Hoofdstuk4;

import java.applet.*;
import java.awt.*;

public class Hoofdstuk4x2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int x[] = {150,300,225};
        int y[] = {150,150,25};
        g.drawPolygon( x,y, 3);
        g.drawRect(150,150,150,200 );
        g.drawRect(150,250,30,100);
        g.drawRect(175,180,30, 35 );
        g.drawRect(235,180,30,35);
        g.drawRect(205,250, 70,35);
    }
}