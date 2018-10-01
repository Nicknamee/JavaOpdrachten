package JavaChallenge;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class JavaChallengex1 extends Applet {
    int Valery,Jeroen,Hans,Formule,gewicht1,gewicht2,gewicht3;
    Button button;
    TextField textfield1,textfield2,textfield3;
    Label label1,label2,label3;


    //Valerie=1 Jeroen=2 Hans=3//

    public void init() {
        label1 = new Label("Valery");
        add(label1);
        textfield1 = new TextField(6);
        add(textfield1);
        label2 = new Label("Jeroen");
        add(label2);
        textfield2 = new TextField(6);
        add(textfield2);
        label3 = new Label("Hans");
        add(label3);
        textfield3 = new TextField(6);
        add(textfield3);
        button = new Button("Bereken het gewicht");
        button1listener val = new button1listener();
        button.addActionListener(val);
        add(button);

        //Formule//
        Formule = 510;
    }

    public void paint(Graphics g) {
        resize(1500,600);

        g.setColor(Color.BLACK);
        g.drawString("Valerie's gewicht is:     " + gewicht1, 500,115);
        g.drawString("Jeroen gewicht is:        " + gewicht2, 500,135);
        g.drawString("Hans gewicht is:          " + gewicht3, 500,155);


        setBackground(Color.WHITE);
        // KG
        g.setColor(Color.BLACK);
        g.drawRect(80, 10, 400, 500);
        g.drawString("0KG", 55, 520);
        g.drawString("20KG", 45, 415);
        g.drawString("40KG", 45, 315);
        g.drawString("60KG", 45, 215);
        g.drawString("80KG", 45, 115);
        g.drawString("100KG", 35, 15);

        // Lijnen
        g.drawLine(80, 410, 480, 410);
        g.drawLine(80, 310, 480, 310);
        g.drawLine(80, 210, 480, 210);
        g.drawLine(80, 110, 480, 110);

        // De namen
        g.drawString("Valery", 85, 525);
        g.drawString("Jeroen", 150, 525);
        g.drawString("Hans", 225, 525);

        // Valery
        g.setColor(Color.CYAN);
        g.fillRect(90, Formule - Valery, 30, Valery);

        // Jeroen
        g.setColor(Color.MAGENTA);
        g.fillRect(155, Formule - Jeroen, 30, Jeroen);

        // Hans
        g.setColor(Color.PINK);
        g.fillRect(220, Formule - Hans, 30, Hans);
    }

    class button1listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String v;

            v = textfield1.getText();
            gewicht1 = Integer.parseInt(v);
            Valery = (gewicht1 * 5);

            String j;

            j = textfield2.getText();
            gewicht2 = Integer.parseInt(j);
            Jeroen = (gewicht2 * 5 );

            String h;
            h = textfield3.getText();
            gewicht3 = Integer.parseInt(h);
            Hans = (gewicht3 * 5);
            repaint();

        }
    }
}