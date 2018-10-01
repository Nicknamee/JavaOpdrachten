// if ( code )/
// aantaldagen = 29;
// else
// aantaldagen = 28;
package Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Hoofdstuk10x3 extends Applet {

    int maand;
    TextField tekstvak;
    Label label;
    String tekst,dagen;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        label = new Label("Voer u maand nummer in");
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {

        g.drawString("De maand is:     " + tekst, 50, 50);
        g.drawString("Met de aantal dagen:     " + dagen, 50, 70);
    }


    class VakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            maand = Integer.parseInt(s);

            switch(maand){
                case 1:
                    tekst = "Januari";
                    dagen = "31";
                    break;
                case 2:
                    tekst = "Februari";
                    dagen = "28 (in een schrikkeljaar 29)";
                    break;
                case 3:
                    tekst = "Maart";
                    dagen = "31";
                    break;
                case 4:
                    tekst = "April";
                    dagen = "30";
                    break;
                case 5:
                    tekst = "Mei";
                    dagen = "31";
                    break;
                case 6:
                    tekst = "Juni";
                    dagen = "30";
                    break;
                case 7:
                    tekst = "Juli";
                    dagen = "31";
                    break;
                case 8:
                    tekst = "Augustus";
                    dagen = "31";
                    break;
                case 9:
                    tekst = "September";
                    dagen = "30";
                    break;
                case 10:
                    tekst = "Oktober";
                    dagen = "31";
                    break;
                case 11:
                    tekst = "November";
                    dagen = "30";
                    break;
                case 12:
                    tekst = "December";
                    dagen = "31";
                    break;
                default:
                    tekst = "Verkeerd nummer ingetikt!";
                    break;


            }
            repaint();
            }

            }
        }

