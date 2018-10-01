package Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Hoofdstuk10x1en10x2 extends Applet {

    int leeftijd, hoogstegetal, laagstegetal;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        laagstegetal = 99999;
        hoogstegetal = 0;
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        label = new Label("Voer u leeftijd in");
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {

            g.drawString("Kleinste getal is     " + laagstegetal, 50, 50);
            g.drawString("Grootste getal is     " + hoogstegetal, 50, 70);
        }


        class VakListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                String s;

                s = tekstvak.getText();
                leeftijd = Integer.parseInt(s);
                if (leeftijd > hoogstegetal) {
                    hoogstegetal = leeftijd;
                    repaint();

                }
                if (leeftijd < laagstegetal) {
                    laagstegetal = leeftijd;
                    repaint();
                }
            }

        }

    }
