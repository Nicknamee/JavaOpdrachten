package JavaChallenge;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;


public class JavaChallengex4 extends Applet {

    int tijd;
    Button button;
    Label label;
    TextField textfield;
    String tekst, tekst2, tekst3, tekst4;

    public void init() {
        label = new Label("Voer een tijd in");
        add(label);
        textfield = new TextField(6);
        add(textfield);
        button = new Button("Bereken");
        buttonlistener val = new buttonlistener();
        button.addActionListener(val);
        add(button);
    }

    public void paint(Graphics g) {
        setSize(1000, 500);
        if (tekst == null) {
            tekst = "";
            repaint();
        }
        if (tekst2 == null){
            tekst2 = "";
            repaint();

        }
        if (tekst3 == null){
            tekst3 = "";
            repaint();
        }
        if (tekst4 == null){
            tekst4 = "";
            repaint();
        }
        g.drawString("  " + tekst, 380, 60);
        g.drawString("  " + tekst2, 380, 80);
        g.drawString("  " + tekst3, 380, 100);
        g.drawString("  " + tekst4, 380, 120);
    }

    class buttonlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = textfield.getText();
            tijd = Integer.parseInt(s);
                //London 0:00//
                //Tokyo 8:00//
                //Sydney 10:00//
                //New York 19:00//

                switch (tijd) {
                    case 0:
                        tekst = "De tijd in London:  23:00";
                        tekst2 = "De tijd in Tokyo:  7:00";
                        tekst3 = "De tijd in Sydney:   9:00";
                        tekst4 = "De tijd in New York:   18:00";
                        break;
                    case 1:
                        tekst = "De tijd in London:  00:00";
                        tekst2 = "De tijd in Tokyo:   8:00";
                        tekst3 = "De tijd in Sydney:   10:00";
                        tekst4 = "De tijd in New York:   19:00";
                        break;
                    case 2:
                        tekst = "De tijd in London:  1:00";
                        tekst2 = "De tijd in Tokyo:   9:00";
                        tekst3 = "De tijd in Sydney:   11:00";
                        tekst4 = "De tijd in New York:   20:00";
                        break;
                    case 3:
                        tekst = "De tijd in London:  2:00";
                        tekst2 = "De tijd in Tokyo:   10:00";
                        tekst3 = "De tijd in Sydney:   12:00";
                        tekst4 = "De tijd in New York:   21:00";
                        break;
                    case 4:
                        tekst = "De tijd in London:  3:00";
                        tekst2 = "De tijd in Tokyo:   11:00";
                        tekst3 = "De tijd in Sydney:   13:00";
                        tekst4 = "De tijd in New York:   22:00";
                        break;
                    case 5:
                        tekst = "De tijd in London:  4:00";
                        tekst2 = "De tijd in Tokyo:   12:00";
                        tekst3 = "De tijd in Sydney:   14:00";
                        tekst4 = "De tijd in New York:   23:00";
                        break;
                    case 6:
                        tekst = "De tijd in London:  5:00";
                        tekst2 = "De tijd in Tokyo:   13:00";
                        tekst3 = "De tijd in Sydney:   15:00";
                        tekst4 = "De tijd in New York:   00:00";
                        break;
                    case 7:
                        tekst = "De tijd in London:  6:00";
                        tekst2 = "De tijd in Tokyo:   14:00";
                        tekst3 = "De tijd in Sydney:   16:00";
                        tekst4 = "De tijd in New York:   1:00";
                        break;
                    case 8:
                        tekst = "De tijd in London:  7:00";
                        tekst2 = "De tijd in Tokyo:   15:00";
                        tekst3 = "De tijd in Sydney:   17:00";
                        tekst4 = "De tijd in New York:   2:00";
                        break;
                    case 9:
                        tekst = "De tijd in London:  8:00";
                        tekst2 = "De tijd in Tokyo:   16:00";
                        tekst3 = "De tijd in Sydney:   18:00";
                        tekst4 = "De tijd in New York:   3:00";
                        break;
                    case 10:
                        tekst = "De tijd in London:  9:00";
                        tekst2 = "De tijd in Tokyo:   17:00";
                        tekst3 = "De tijd in Sydney:   19:00";
                        tekst4 = "De tijd in New York:   4:00";
                        break;
                    case 11:
                        tekst = "De tijd in London:  10:00";
                        tekst2 = "De tijd in Tokyo:   18:00";
                        tekst3 = "De tijd in Sydney:   20:00";
                        tekst4 = "De tijd in New York:   5:00";
                        break;
                    case 12:
                        tekst = "De tijd in London:  11:00";
                        tekst2 = "De tijd in Tokyo:   19:00";
                        tekst3 = "De tijd in Sydney:   21:00";
                        tekst4 = "De tijd in New York:   6:00";
                        break;
                    case 13:
                        tekst = "De tijd in London:  12:00";
                        tekst2 = "De tijd in Tokyo:   20:00";
                        tekst3 = "De tijd in Sydney:   22:00";
                        tekst4 = "De tijd in New York:   7:00";
                        break;
                    case 14:
                        tekst = "De tijd in London:  13:00";
                        tekst2 = "De tijd in Tokyo:   21:00";
                        tekst3 = "De tijd in Sydney:   23:00";
                        tekst4 = "De tijd in New York:   8:00";
                        break;
                    case 15:
                        tekst = "De tijd in London:  14:00";
                        tekst2 = "De tijd in Tokyo:   22:00";
                        tekst3 = "De tijd in Sydney:   0:00";
                        tekst4 = "De tijd in New York:   9:00";
                        break;
                    case 16:
                        tekst = "De tijd in London:  15:00";
                        tekst2 = "De tijd in Tokyo:   23:00";
                        tekst3 = "De tijd in Sydney:   1:00";
                        tekst4 = "De tijd in New York:   10:00";
                        break;
                    case 17:
                        tekst = "De tijd in London:  16:00";
                        tekst2 = "De tijd in Tokyo:   0:00";
                        tekst3 = "De tijd in Sydney:   2:00";
                        tekst4 = "De tijd in New York:   11:00";
                        break;
                    case 18:
                        tekst = "De tijd in London:  17:00";
                        tekst2 = "De tijd in Tokyo:   1:00";
                        tekst3 = "De tijd in Sydney:   3:00";
                        tekst4 = "De tijd in New York:   12:00";
                        break;
                    case 19:
                        tekst = "De tijd in London:  18:00";
                        tekst2 = "De tijd in Tokyo:   2:00";
                        tekst3 = "De tijd in Sydney:   4:00";
                        tekst4 = "De tijd in New York:   13:00";
                        break;
                    case 20:
                        tekst = "De tijd in London:  19:00";
                        tekst2 = "De tijd in Tokyo:   3:00";
                        tekst3 = "De tijd in Sydney:   5:00";
                        tekst4 = "De tijd in New York:   14:00";
                        break;
                    case 21:
                        tekst = "De tijd in London:  20:00";
                        tekst2 = "De tijd in Tokyo:   4:00";
                        tekst3 = "De tijd in Sydney:   6:00";
                        tekst4 = "De tijd in New York:   15:00";
                        break;
                    case 22:
                        tekst = "De tijd in London:  21:00";
                        tekst2 = "De tijd in Tokyo:   5:00";
                        tekst3 = "De tijd in Sydney:   7:00";
                        tekst4 = "De tijd in New York:   16:00";
                        break;
                    case 23:
                        tekst = "De tijd in London:  22:00";
                        tekst2 = "De tijd in Tokyo:   6:00";
                        tekst3 = "De tijd in Sydney:   8:00";
                        tekst4 = "De tijd in New York:   17:00";
                        break;
                    case 24:
                        tekst = "De tijd in London:  23:00";
                        tekst2 = "De tijd in Tokyo:   7:00";
                        tekst3 = "De tijd in Sydney:   9:00";
                        tekst4 = "De tijd in New York:   18:00";
                        break;
                    default:
                        tekst = "";
                        tekst2 = "";
                        tekst3 = "";
                        tekst4 = "Ongeldige invoer";
                        break;


                }
                repaint();
            }
        }
    }