import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Worm extends Item implements PickItem {

    public Worm (Cell loc){
        super(loc, "Worm");
    }

    public boolean pickedBy(Actor actor){
        return actor instanceof Bird;
    }

    public void pick(Actor actor){
        System.out.println("The bird picks at the worm!");
    }

    public void paint(Graphics g){
        g.setFont(new Font("Arial", Font.PLAIN, 10));
        g.setColor(Color.GREEN.darker());
        g.fillOval(getLoc().x + 8, getLoc().y + 10, 18, 8);
        g.setColor(Color.BLACK);
        g.drawString("Worm", getLoc().x+ 5, getLoc().y + 34);
    }

}
