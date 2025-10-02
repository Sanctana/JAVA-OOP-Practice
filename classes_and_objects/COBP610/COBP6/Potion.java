public class Potion{
    String name;
    int healingAmount;
    int quantity;
    
    void drink(){
        System.out.println(name + " drank, restores " + healingAmount + " health.");
        quantity -= 1;
    }
    
    void canDrink(){
        if(quantity > 0){
            System.out.println("Potion available to drink");
            quantity -= 1;
            System.out.println(name + " drank, restores " + healingAmount + " health.");
        }
        
        if(quantity == 0){
            System.out.println("No potion left!");
        }
    }
}
