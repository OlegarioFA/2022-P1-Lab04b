// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawRect(50,50,200,200 );
        g.drawRect(150,150,200,200 );
        g.drawLine(50,50, 150,150);
        g.drawLine(250,250, 350,350);
        g.drawLine(250,50, 350,150);
        g.drawLine(50,250, 150,350);


        // DRAW SPHERE
        g.drawOval(500,50,250,250);




        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS
        g.fillRect(50,400,25,125);
        g.fillRect(100,400,25,125);
        g.fillRect(50,400,50,25);
        g.fillRect(50,450,50,25);

        g.fillRect(150,400,25,125);
        g.fillRect(170,400,50,25);
        g.fillRect(200,400,25,75);
        g.fillRect(170,450,50,25);

        g.fillRect(250,400,25,125);
        g.fillRect(250,400,75,25);
        g.fillRect(250,500,75,25);

        g.fillRect(350,450,75,25);
        g.fillRect(350,400,75,25);
        g.fillRect(350,400,25,75);
        g.fillRect(350,500,75,25);
        g.fillRect(400,450,25,75);





        // DRAW PACMEN FLOWER



    }

}


