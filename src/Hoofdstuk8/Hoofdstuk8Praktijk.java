package Hoofdstuk8;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class Hoofdstuk8Praktijk extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    String schermtekst;
    double  getal;

    public void init() {
        setSize(450, 100);

        tekstvak = new TextField(12);
        add(tekstvak);
        tekstvak2 = new TextField(12);
        add(tekstvak2);

        Button X = new Button(" * ");
        XListener kl = new XListener();
        X.addActionListener(kl);
        add(X);

        Button deel = new Button(" / ");
        deelListener dl = new deelListener();
        deel.addActionListener(dl);
        add(deel);

        Button plus = new Button(" + ");
        plusListener pl = new plusListener();
        plus.addActionListener(pl);
        add(plus);

        Button min = new Button(" - ");
        minListener ml = new minListener();
        min.addActionListener(ml);
        add(min);
    }

    public void paint(Graphics g) {

        g.drawString(schermtekst, 20, 60);
    }

    class XListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            double num1 = Double.parseDouble(tekstvak.getText());
            double num2 = Double.parseDouble(tekstvak2.getText());

            getal = round(num1 * num2);
            tekstvak.setText("" + getal);
            tekstvak2.setText("");
            repaint();
        }
    }

    class deelListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            double num1 = Double.parseDouble(tekstvak.getText());
            double num2 = Double.parseDouble(tekstvak2.getText());

            getal = round(num1 / num2);
            tekstvak.setText("" + getal);
            tekstvak2.setText("");
            repaint();
        }

    }

    class plusListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            double num1 = Double.parseDouble(tekstvak.getText());
            double num2 = Double.parseDouble(tekstvak2.getText());

            getal = round(num1 + num2);
            tekstvak.setText("" + getal);
            tekstvak2.setText("");
            repaint();
        }

    }

    class minListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            double num1 = Double.parseDouble(tekstvak.getText());
            double num2 = Double.parseDouble(tekstvak2.getText());

            getal = round(num1 - num2);
            tekstvak.setText("" + getal);
            tekstvak2.setText("");
            repaint();
        }

    }


    static double round(double value) {

        long factor = (long) Math.pow(10, 2);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

}
