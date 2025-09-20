import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Stage <A extends Actor, I extends Item> {
  Grid grid;
  private List<A> actors = new ArrayList<>();
  private List<I> items = new ArrayList<>();

  public Stage() {
    grid = new Grid();

    // create actors and add them to the list
    actors.add((A) new Cat(grid.cellAtColRow(0, 0).get()));
    actors.add((A)new Dog(grid.cellAtColRow(0, 15).get()));
    actors.add((A)new Bird(grid.cellAtColRow(12, 9).get()));  

    //creating items and adding them to the list 
    items.add((I)new Wool(grid.cellAtColRow(5,5).get()));
    items.add((I)new Worm(grid.cellAtColRow(10,3).get()));
    items.add((I)new Meat(grid.cellAtColRow(2, 3).get()));


  }


  public void paint(Graphics g, Point mouseLoc) {
    // paint the grid first
    grid.paint(g, mouseLoc);

    // now loop through all actors and paint them
    for (A actor : actors) {
      actor.paint(g); 
    }

    for(I item: items){
      item.paint(g);
    }
  }



}
