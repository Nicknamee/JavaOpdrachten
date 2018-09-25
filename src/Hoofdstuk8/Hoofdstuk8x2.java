package Hoofdstuk8;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;


public class Hoofdstuk8x2 extends Applet {
    int Mannen = 0;
    int Vrouwen = 0;
    int PotVrouwelijke = 0;
    int PotMannelijke = 0;


    public void init() {
        setSize(265, 200);

        Button man = new Button("Man");
        manListener lis1 = new manListener();
        man.addActionListener( lis1 );
        add (man);

        Button vrouw = new Button("Vrouw");
        vrouwListener lis2 = new vrouwListener();
        vrouw.addActionListener( lis2 );
        add (vrouw);

        Button man2 = new Button("Pot..Man");
        man2Listener lis3 = new man2Listener();
        man2.addActionListener( lis3);
        add (man2);

        Button vrouw2 = new Button("Pot..Vrouw");
        vrouw2Listener lis4 = new vrouw2Listener();
        vrouw2.addActionListener( lis4 );
        add (vrouw2);

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Aantal Mannen                           : "+ Mannen, 20,50);
        g.setColor(Color.blue);
        g.drawString("Aantal Vrouwen                          : "+ Vrouwen, 20,80);
        g.setColor(Color.magenta);
        g.drawString("Aantal Potentiële Mannen        : "+ PotMannelijke, 20,110);
        g.setColor(Color.red);
        g.drawString("Aantal Potentiële Vrouwen       : "+ PotVrouwelijke , 20,140);

        int totaal = Mannen + Vrouwen + PotVrouwelijke + PotMannelijke;

        g.setColor(Color.pink);
        g.drawString("Totaal Mannen en Vrouwen     : " + totaal, 20,170);

    }

    class manListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Mannen++ ;
            repaint();
        }

    }

    class vrouwListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Vrouwen++ ;
            repaint();
        }

    }
    class man2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            PotMannelijke++;
            repaint();
        }

    }
    class vrouw2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PotVrouwelijke++;
            repaint();
        }
    }
}