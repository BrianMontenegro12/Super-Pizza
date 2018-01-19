
import java.awt.*;
import java.applet.*;
public class DeepDish extends Pizza
{
    private Color crustColor;
    //private int xPos;
    //private int yPos;

    public DeepDish(Color cC, int xPos, int yPos)
    {
        super(cC, xPos, yPos);
        crustColor = cC;
        //this.xPos = xPos;
        //this.yPos = yPos;
    }

    public void drawPizza(Graphics g)
    {
        super.drawPizza(g);
    }
}
