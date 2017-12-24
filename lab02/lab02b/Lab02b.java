import java.awt.Graphics;
import java.applet.Applet;

/**
 * An Applet!
 * @author Omer Musa Battal
 * @version 20.10.2016
 */
public class Lab02b extends Applet 
{
   
   public void paint( Graphics g)
   {
      g.drawString( "Hello...", 50, 50);
      g.drawRect( 25, 25, 100, 50);
   }
   
}