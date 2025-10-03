public class Main{
    public static void main(String[] args){
        Enemy enemy1 = new Enemy("Orc", 20, 100);
        Player player1 = new Player("Alice", 30, 100);
        
        enemy1.attack(player1);
        enemy1.takeDamage(player1, 30);
        enemy1.isAlive();
        enemy1.takeDamage(player1, 100);
        enemy1.isAlive();
    }
}
