import java.awt.Color;
import java.awt.Graphics;

public class Worm extends Item implements PickItem {

    public Worm (Cell loc){
        super(loc, "Worm");
    }

    public void interact(){
        System.out.println("The worm moves!");
    }

    public void pick(Actor actor){
        System.out.println("The bird picks at the worm!");
    }

    public void paint(Graphics g){
        g.setColor(Color.GREEN.darker());
        g.fillOval(getLoc().x + 8, getLoc().y + 10, 18, 8);
        g.setColor(Color.BLACK);
        g.drawString("Worm", getLoc().x+ 5, getLoc().y + 34);
    }

}
