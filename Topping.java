
import java.awt.*;
import java.applet.*;
public class Topping
{
    private int xPos;
    private int yPos;

    public Topping(int xP, int yP)
    {
        xPos = xP;
        yPos = yP;
    }

    public void drawTopping(Graphics g)
    {
        drawChicken(g);
    }
    
    public void drawChicken(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillRect(xPos, yPos, 150, 15);
}
}
