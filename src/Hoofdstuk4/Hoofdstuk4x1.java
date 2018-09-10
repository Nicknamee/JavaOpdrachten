package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4x1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(80, 30,140,140);
        g.drawLine(30, 140, 80, 30);
        g.drawLine(30, 140, 140, 140);
    }
}