package Hoofdstuk6;

import java.awt.*;
import java.applet.*;


public class Hoofdstuk6x2 extends Applet {
    int a, Uur, Dagen,Jaren, uitkomst, uitkomst2, uitkomst3;


    public void init() {
        a = 3600;
        Uur = (1 * 60) * 60;
        Dagen = (1 * Uur) * 24;
        Jaren = (1 * Dagen) * 365;
        uitkomst =  Uur;
        uitkomst2 = Dagen;
        uitkomst3 = Jaren;
    }

    public void paint(Graphics g) {

        g.drawString("Seconden in Uur, Dagen en Jaren:", 20,20);
        g.drawString("In uur =          " + uitkomst, 20,40);
        g.drawString("In dag =          " + uitkomst2, 20,60);
        g.drawString("In jaar =         " + uitkomst3, 20,80);
    }
}
