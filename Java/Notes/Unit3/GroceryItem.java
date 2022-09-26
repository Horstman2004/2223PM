package Notes.Unit3;

public class GroceryItem {
    String name;
    double cost;

    //need the no arg constructor technically

    public GroceryItem(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    //getters and setters
    private void setName(String newName){
        this.name=newName;
    }
    private String getName(){
        return this.name;
    }
    private void setCost(double newCost){
        this.cost=newCost;
    }
    private String getCost(){
        return this.name +" - "+String.valueOf(this.cost);
    }

    //toString
    @Override
    public String toString(){
        return this.name +" - "+String.valueOf(this.cost);
    }
}
