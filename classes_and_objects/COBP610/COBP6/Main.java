public class Main{
    public static void main(String[] args){
        Potion potion = new Potion();
        
        potion.name = "Elixir potion";
        potion.healingAmount = 25; 
        potion.quantity = 2;
        
        potion.drink();
        potion.canDrink();
    }
}
