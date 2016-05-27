/* Allison Chen   // are similar to # in Python /* is similar to """
 *Graphics Ex 1
 * 11/3/14
 */

// Need two imports to run graphics with Applets
// Need ; to end line in java

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class graphicsEx1 extends Applet // an applet is a java program that can be downloaded to a web browser
{  
    
    private int x=0;
    private int inc=2;
    public void paint (Graphics g) //in Java, functions are called 'methods'...this is the paint methodpaint
    {
        setBackground(Color.YELLOW); //all caps or all lowercase
        g.drawString("Hello World", 220,50);
        for (int x=0;x<501;x+=50)
        {
            g.drawLine(x,0,x,500);
        }
        for (int y=0;y<501;y+=50)
        {
            g.drawLine(0,y,500,y);
        }
        g.setColor(Color.blue);
        g.drawRect(20,320,460,60); //1st 2 numbers=upperleft of rect
        //3rd number=width 4th number=height
        g.setColor(Color.green);
        g.fillRect(30,330,440,40);
        g.setColor(Color.red);
        g.fillOval(25,100,50,100); //1st 2 numbers=upper left hand corner of rect containing oval
        g.setColor(Color.white);
        g.fillOval(100,125,100,50);
        g.setColor(Color.black);
        g.drawOval(100,125,100,50);
        //Problem #8
        g.setColor(Color.CYAN);
        g.drawLine(250,200,200,275);
        g.drawLine(200,275,300,275);
        g.drawLine(300,275,250,200);
        //Problem #9
        g.setColor(Color.orange);
        g.fillRoundRect(425,125,50,100,10,10);
        //Problem #10 POLYGON VERY USEFUL
        Polygon al1=new Polygon(); //Creates a new polygon object
        al1.addPoint(310,100);
        al1.addPoint(350,10);
        al1.addPoint(390,100);
        al1.addPoint(350,50); //order has to be clockwise or ccw
        g.setColor(Color.magenta);
        g.fillPolygon(al1);
        g.setColor(Color.black);
        g.drawPolygon(al1);
        //Problem 11 Creating your own color
        Color mintCream=new Color(245,255,250);
        g.setColor(mintCream);
        g.fillRect(300,400,100,100);
        //Pac man
        g.setColor(Color.green);
        g.fillArc(200,100,100,100,45-x,270+2*x);
        g.setColor(Color.black);
        g.fillOval(240,110,20,10);
        if (x<0 || x>46) inc=-inc;
        x+=inc;
        g.setColor(Color.red);
        g.fillArc(200,100,200,200,270,180);
    }
}