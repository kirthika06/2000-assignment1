import java.awt.Color;
import java.awt.Graphics;

public class Wool extends Item {

        public Wool(Cell loc) {
             super(loc, "Wool");
        }
       
    public void interact(){
        System.out.println("The cat is playing with the wool!");
    }

    public void paint(Graphics g){
        g.setColor(Color.MAGENTA);
        g.fillOval(getLoc().x + 5, getLoc().y + 5, 20, 20);
        g.setColor(Color.BLACK);
        g.drawString("Wool", getLoc().x, getLoc().y + 35);

    }

}
    

