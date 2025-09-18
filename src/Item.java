public class Item {
    private String name;

    public Item(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void interact(){
        System.out.println("You are playing with the item:" + name);
    }
}
