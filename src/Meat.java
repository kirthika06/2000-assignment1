import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Meat extends Item implements PickItem {

    public Meat(Cell loc) {
        super(loc, "Meat");
    }

    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(getLoc().x +8, getLoc().y + 8, 18,12);
        g.setColor(Color.BLACK);
        g.drawString("Meat", getLoc().x, getLoc().y + 32);
        g.setFont(new Font("Arial", Font.PLAIN, 10));

    }

    public void pick(Actor actor){
        System.out.println("The dog is eating the meat!");
    }

 

}
