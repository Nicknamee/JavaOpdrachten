package Hoofdstuk6;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk6Praktijk extends Applet {
    double getal1;
    double getal2;
    double getal3;
    double gemiddeld;

    public void init() {
    getal1=5.9;
    getal2=6.3;
    getal3=6.9;

    gemiddeld=(getal1 + getal2 + getal3) /3;
    gemiddeld*=10;
    gemiddeld=(int)gemiddeld;
    gemiddeld/=10;
    }



    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: "+ gemiddeld,20,20);

    }
}
