package Hoofdstuk10;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class Hoofdstuk10Praktijk extends Applet {
    TextField tekstvak;
    String resultaat;
    Button knop;


    public void init() {

        setSize(500, 500);

        tekstvak = new TextField(10);
        add(tekstvak);
        knop = new Button("Bereken Cijfer");
        knop.addActionListener(new knopListener());
        add(knop);
        resultaat = "";
    }

    public void paint(Graphics g) {
        g.drawString("Je cijfer is een:  " + resultaat, 100, 60);
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String r = tekstvak.getText();
            int cijfer = Integer.parseInt(r);

            if (cijfer == 1 || cijfer == 2 || cijfer == 3) {
                resultaat = "slecht";

            } else if (cijfer == 4) {

                resultaat = "onvoldoende";
            }

            else if (cijfer == 5) {
                resultaat = "matig";
            }

            else if (cijfer == 6 || cijfer == 7) {
                resultaat = "voldoende";
            }

            else if (cijfer == 8 || cijfer == 9 || cijfer == 10) {
                resultaat = "goed";
            }
            else
                resultaat = "Dit getal klopt niet probeer een andere";
            repaint();
        }
    }
}