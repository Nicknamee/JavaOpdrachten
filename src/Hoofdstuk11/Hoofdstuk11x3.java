package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11x3 extends Applet{

    public void init(){

        setSize(50, 300);
    }

    public void paint(Graphics g) {
        setSize(500,2000);
        int getal1 = -1;
        int getal2 = 1;
        int getal3;
        int y = 10;

        //tot 48 dan gaat ie in de min//
        for( int teller = 1; teller<48; teller++ )  {
            y += 20;
            getal3 = getal1 + getal2;
            getal1 = getal2;
            getal2 = getal3;

            g.drawString(""+ getal3 ,20, y );
        }
    }
}
