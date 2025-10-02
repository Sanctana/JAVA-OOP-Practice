public class Item{
    String name;
    int effect;
    int quantity;
    
    void useItem(){
        System.out.println(name + " used. Effect: Restores " + effect + " HP.");
    }
    
    void showQuantity(){
        System.out.println("Quantity left: " + quantity);
    }
}
