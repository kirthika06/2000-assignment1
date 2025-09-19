import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Wool extends Item {

        public Wool(Cell loc) {
             super(loc, "Wool");
        }
       
  public void pick(Actor actor){
        System.out.println("The cat plays with the wool!");
    }


    public void paint(Graphics g){
        g.setFont(new Font("Arial", Font.PLAIN, 10));
        g.setColor(Color.MAGENTA);
        g.fillOval(getLoc().x + 5, getLoc().y + 5, 20, 20);
        g.setColor(Color.BLACK);
        g.drawString("Wool", getLoc().x, getLoc().y + 35);

    }

}
    

