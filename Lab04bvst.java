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
        g.drawOval(525,50,200,250);
        g.drawOval(550,50,150,250);
        g.drawOval(575,50,100,250);
        g.drawOval(600,50,50,250);

        g.drawOval(500,75,250,200);
        g.drawOval(500,100,250,150);
        g.drawOval(500,125,250,100);
        g.drawOval(500,150,250,50);




        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(600, 400, 200,200);
        g.drawLine(700,400,775,565);
        g.drawLine(700,400, 625,565);
        g.drawLine(775,565,625,565);
        g.drawOval(654, 465, 93,100);



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


