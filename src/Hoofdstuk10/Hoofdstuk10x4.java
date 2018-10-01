package Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Hoofdstuk10x4 extends Applet {

    int maand, jaar;
    TextField tekstvak, tekstvak2;
    Label label,label2;
    String tekst, tekst2,tekst3;

    public void init() {
        //1e tekst vak//
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        label = new Label("Voer het jaar in");
        add(label);
        add(tekstvak);
        //2e tekst vak//
        tekstvak2 = new TextField("", 5);
        tekstvak2.addActionListener(new VakListener2());
        label2 = new Label("Voer het maand nummer");
        add(label2);
        add(tekstvak2);

    }

    public void paint(Graphics g) {

        g.drawString("Het jaar is:                               " + tekst, 50,50);
        g.drawString("De maand is:                           " + tekst2, 50, 70);
        g.drawString("Met de aantal dagen:              " + tekst3, 50, 90);
    }

    class VakListener2 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                String x;

                x = tekstvak2.getText();
                maand = Integer.parseInt(x);

                switch (maand) {
                    case 1:
                        tekst2 = "Januari";
                        tekst3 = "31";
                        break;
                    case 2:
                        if ((jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                                jaar % 400 == 0) {
                            tekst3 = "29";
                            tekst2 = "Februari";
                            break;
                        }
                        else {
                            tekst3 = "28";
                            tekst2 = "Februari";
                            break;
                        }
                    case 3:
                        tekst2 = "Maart";
                        tekst3 = "31";
                        break;
                    case 4:
                        tekst2 = "April";
                        tekst3 = "30";
                        break;
                    case 5:
                        tekst2 = "Mei";
                        tekst3 = "31";
                        break;
                    case 6:
                        tekst2 = "Juni";
                        tekst3 = "30";
                        break;
                    case 7:
                        tekst2 = "Juli";
                        tekst3 = "31";
                        break;
                    case 8:
                        tekst2 = "Augustus";
                        tekst3 = "31";
                        break;
                    case 9:
                        tekst2 = "September";
                        tekst3 = "30";
                        break;
                    case 10:
                        tekst2 = "Oktober";
                        tekst3 = "31";
                        break;
                    case 11:
                        tekst2 = "November";
                        tekst3 = "30";
                        break;
                    case 12:
                        tekst2 = "December";
                        tekst3 = "31";
                        break;
                    default:
                        tekst2 = "Verkeerde nummer ingetikt!";
                        break;

            }
            repaint();

        }
    }
    class VakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            jaar = Integer.parseInt(s);

            if ((jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0) {
                tekst = "" + jaar + " is een schrikkeljaar";
            } else {
                tekst = "" + jaar + " is geen schrikkeljaar";
            }
            repaint();

        }
            }
        }

