package JavaChallenge;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;


public class JavaChallengex2 extends Applet {
    double totaal,omzet,fris2,bier2,wijn2,koffie2,bindes2 ,buides2;
    Button fris,bier,wijn,koffie,bindes,buides,nieuw;
    
    
//Fris € 2,25
//Bier: € 2,50
//Wijn: € 2,75
//Koffie: € 2,-
//Binnenlands gedistilleerd: € 3,-
//Buitenlands gedistilleerd: € 3,75


    public void init() {
        totaal = 0;
        fris2 = 2.20;
        bier2 = 2.50;
        wijn2 = 2.75;
        koffie2 = 2.00;
        bindes2 = 3.00;
        buides2 = 3.75;

        Button fris = new Button("Fris");
        frisListener lis1 = new frisListener();
        fris.addActionListener( lis1 );
        add (fris);

        bier = new Button("Bier");
        bierListener lis2 = new bierListener();
        bier.addActionListener( lis2 );
        add (bier);

        wijn = new Button("Wijn");
        wijnListener lis3 = new wijnListener();
        wijn.addActionListener( lis3);
        add (wijn);

        koffie = new Button("Koffie");
        koffieListener lis4 = new koffieListener();
        koffie.addActionListener( lis4 );
        add (koffie);

        bindes = new Button("Binn gedist.");
        bindesListener lis5 = new bindesListener();
        bindes.addActionListener( lis5 );
        add (bindes);

        buides = new Button("Buit gedist");
        buidesListener lis6 = new buidesListener();
        buides.addActionListener( lis6 );
        add (buides);

        nieuw = new Button("Nieuwe bestelling");
        nieuwListener lis7 = new nieuwListener();
        nieuw.addActionListener( lis7);
        add (nieuw);




    }

    public void paint(Graphics g) {
        resize(500,500);
        g.drawString("Bestelling totaal:  " + totaal,40,80);
        g.drawString("Totaal omzet: "        + omzet,40,100);


        }

    class frisListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

            totaal = totaal + fris2;
            omzet = omzet + fris2;
            repaint();
        }

    }

    class bierListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            totaal = totaal + bier2;
            omzet = omzet + bier2;
            repaint();
        }

    }
    class wijnListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            totaal = totaal + wijn2;
            omzet = omzet + wijn2;
            repaint();
        }

    }
    class koffieListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal = totaal + koffie2;
            omzet = omzet + koffie2;
            repaint();
        }
    }
    class bindesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal = totaal + bindes2;
            omzet = omzet + bindes2;
            repaint();
        }
    }
    class buidesListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            totaal = totaal + buides2;
            omzet = omzet + buides2;
            repaint();
        }
    }
    class nieuwListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if (totaal > 0);
            totaal = 0;
            repaint();
        }
    }
}
