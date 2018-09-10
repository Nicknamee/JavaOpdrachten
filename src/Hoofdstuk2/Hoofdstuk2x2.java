package Hoofdstuk2;

import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Hoofdstuk2x2 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Nick", 80, 60 );
        g.setColor(Color.red);
        g.drawString("Tse", 80, 80);
    }

}