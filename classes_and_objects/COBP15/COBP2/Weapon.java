public class Weapon{
    String name;
    int damage;
    int durability;
    
    void use(){
        System.out.println("Sword weapon used, durability left: " + durability);
    }
    
    void showStats(){
        System.out.println("Weapon: Sword, Damage: " + damage + ", Durability: " + durability);
    }
}
