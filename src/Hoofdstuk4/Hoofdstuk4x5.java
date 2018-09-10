package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk4x5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);

        g.setColor(Color.BLUE);
        g.fillRect(20,20,100,200);

        g.setColor(Color.WHITE);
        g.fillOval(20,20,100,200);

        g.setColor(Color.YELLOW);
        g.fillArc(20,20,100,200,0,360);


    }

}
