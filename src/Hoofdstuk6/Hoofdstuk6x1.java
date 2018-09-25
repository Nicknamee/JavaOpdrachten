package Hoofdstuk6;

import java.awt.*;
import java.applet.*;


public class Hoofdstuk6x1 extends Applet {
    double a,b,Uitkomst;


    public void init() {
        a = 113;
        b = 4;
        Uitkomst = a / b;


    }

    public void paint(Graphics g) {

        g.drawString ("Nick zijn geld: € " + Uitkomst, 90,90);
        g.drawString ("Ali zijn geld : € " + Uitkomst, 90,110);
        g.drawString ("Jeannette zijn geld: €" + Uitkomst, 90,130);
        g.drawString ("Jan zijn geld: €" + Uitkomst, 90,150);
        g.drawRect   (55,60,200,110);
    }
}