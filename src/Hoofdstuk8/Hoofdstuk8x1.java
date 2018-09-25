package Hoofdstuk8;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class Hoofdstuk8x1 extends Applet {

    TextField tekstvak;
    String schermtekst;


    public void init() {


        setSize(400, 100);
        Button knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        knop = new Button("Reset");
        ResetListener k1 = new ResetListener();
        knop.addActionListener(k1);
        add(knop);
        tekstvak = new TextField(14);
        Label label = new Label("Typ iets in het tekstvak");
        add(tekstvak);
        add(label);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 20, 60);

    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            repaint();
        }
    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            schermtekst = tekstvak.getText();
            repaint();
        }
    }

}
