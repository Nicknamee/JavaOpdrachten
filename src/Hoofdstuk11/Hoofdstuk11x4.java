package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11x4 extends Applet{

    public void init(){

        setSize(50, 300);
    }

    public void paint(Graphics g) {
        setSize(500,2000);
        int getal1 = 3;
        int getal2 = 0;
        int getal3;
        int y = 10;

        for( int teller = 1; teller<51; teller++ )  {
            y += 15;
            getal3 = getal1 + getal2;
            getal2 = getal3;

            g.drawString(""+ getal3 ,20, y );
            g.drawString("De tafel van 3", 60,25);
        }
    }
}
