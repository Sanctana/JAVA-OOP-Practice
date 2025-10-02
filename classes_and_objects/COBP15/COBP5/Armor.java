public class Armor{
    String type;
    int defense;
    int durability;
    
    void equip(){
        System.out.println(type + " armor equipped!");
    }
    
    void takeDamage(int damage){
        System.out.println(type + " takes " + damage + " damage, durability now: " + durability);
    }
    
    void repair(int amount){
        System.out.println(type + " repaired, durability now: " + (durability + amount) );
    }
}
