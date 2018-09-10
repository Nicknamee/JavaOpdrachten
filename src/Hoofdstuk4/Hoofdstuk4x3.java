package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk4x3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        // Lijnen met vlaggenstok eromheen
        g.drawRect(204,49,151,106);
        g.drawRect(202,44,6,301);

        // Vlag
        g.setColor(Color.RED);
        g.fillRect(205,50,150,35);

        g.setColor(Color.WHITE);
        g.fillRect(205,85,150,35);

        g.setColor(Color.BLUE);
        g.fillRect(205,120,150,35);

        // Stok
        g.setColor(Color.WHITE);
        g.fillRect(203,45,5,300);


    }
}

