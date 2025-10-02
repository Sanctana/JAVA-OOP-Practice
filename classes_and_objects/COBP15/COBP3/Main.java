public class Main{
    public static void main(String[] args){
        Enemy enemy = new Enemy();
        
        enemy.type = "Goblin";
        enemy.health = 50;
        
        enemy.attack();
        enemy.takeDamage(15);
        enemy.isAlive();
    }
}
