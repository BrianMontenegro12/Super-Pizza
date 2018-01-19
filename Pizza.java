
import java.awt.*;
public class Pizza
{
    private int xPos;
    private int yPos;
    private Color pizzaColor;
    private Topping top;

    /**
     * Constructor for objects of class Pizza
     */
    public Pizza(Color pC, int xP, int yP)
    {
        pizzaColor = pC;
        xPos = xP;
        yPos = yP;
        top = new Topping(xPos, yPos + 85);
    }

    public void drawPizza(Graphics g)
    {
        top.drawTopping(g);
        drawPizza(g);
    }
}
