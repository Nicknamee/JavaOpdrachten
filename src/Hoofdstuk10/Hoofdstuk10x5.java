package Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Hoofdstuk10x5 extends Applet {
    Button knop;
    double cijfer,cijfer2,cijfer3,cijfer4,cijfer5,eindcijfer;
    TextField tekstvak,tekstvak2,tekstvak3,tekstvak4,tekstvak5;
    Label label;
    String tekst;


    public void init() {
        label = new Label("Voer je cijfers in");
        add(label);
        tekstvak = new TextField(1);
        add(tekstvak);
        tekstvak2 = new TextField(1);
        add(tekstvak2);
        tekstvak3 = new TextField(1);
        add(tekstvak3);
        tekstvak4 = new TextField(1);
        add(tekstvak4);
        tekstvak5 = new TextField(1);
        add(tekstvak5);
        knop = new Button("Ok");
        knopListener kn = new knopListener();
        knop.addActionListener(kn);
        add(knop);
    }

    public void paint(Graphics g) {
        setSize(500,500);
        if (tekst == null){
            tekst = "";
        }
        g.drawString("Voldoende / onvoldoende:      " + tekst, 110,50);
        g.drawString("Je cijfer is een:      " + eindcijfer,110,70);

    }

    class knopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String a,b,c,d,f;

            a = tekstvak.getText();
            b = tekstvak2.getText();
            c = tekstvak3.getText();
            d = tekstvak4.getText();
            f = tekstvak5.getText();

            cijfer = Integer.parseInt(a);
            cijfer2 = Integer.parseInt(b);
            cijfer3 = Integer.parseInt(c);
            cijfer4 = Integer.parseInt(d);
            cijfer5 = Integer.parseInt(f);

            eindcijfer = (cijfer + cijfer2 + cijfer3 + cijfer4 + cijfer5) / 5;


            if (eindcijfer < 5.5){
                tekst = "Onvoldoende";
                repaint();
            }
            repaint();
            if (eindcijfer > 5.4){
                tekst = "Voldoende";
                repaint();
            }


        }
    }
}