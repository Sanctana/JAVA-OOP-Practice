public class Main{
    public static void main(String[] args){
        Potion potion = new Potion("Health Potion", 20, 2);
        Player player1 = new Player("Alice");
        
        potion.drink(player1);
        potion.checkQuantity();
    }
}
