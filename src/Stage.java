import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Stage {
  Grid grid;
  ArrayList<Actor> actors = new ArrayList<>();
  ArrayList<Item> items = new ArrayList<>();

  public Stage() {
    grid = new Grid();

    // create actors and add them to the list
    actors.add(new Cat(grid.cellAtColRow(0, 0).get()));
    actors.add(new Dog(grid.cellAtColRow(0, 15).get()));
    actors.add(new Bird(grid.cellAtColRow(12, 9).get()));  

    //creating items and adding them to the list 
    items.add(new Wool(grid.cellAtColRow(5,5).get()));
    items.add(new Worm(grid.cellAtColRow(10,3).get()));
    items.add(new Meat(grid.cellAtColRow(2, 3).get()));


  }

  

  public void paint(Graphics g, Point mouseLoc) {
    // paint the grid first
    grid.paint(g, mouseLoc);

    // now loop through all actors and paint them
    for (Actor actor : actors) {
      actor.paint(g); 
    }

    for(Item item: items){
      item.paint(g);
    }
  }

}
