package Hoofdstuk6;

import java.applet.*;
import java.awt.*;

public class Hoofdstuk6x3 extends Applet{

    int Getal1;
    int Getal2;
    int Resultaat;



    public void init() {
        Getal1 = 2147483647;
        Getal2 = 1;
        Resultaat = Getal1 + Getal2;


    }

    public void paint(Graphics g) {
        g.drawString("Resultaat =   " + Resultaat, 10,10);





    }
}