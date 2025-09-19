import java.awt.Graphics;

public class Item {
    private Cell loc;
    private String name;

    public Item(Cell loc, String name){
        this.loc = loc;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Cell getLoc(){
        return loc;
    }

    public void paint(Graphics g) {
        g.drawString(name, loc.x+ 10, loc.y + 20); 
    }

    public void interact(){

    }
}

