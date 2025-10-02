public class Main{
    public static void main(String[] args){
        Armor armor = new Armor();
        
        armor.type = "Shield";
        armor.durability = 5;
        
        armor.equip();
        armor.takeDamage(10);
        armor.repair(3);
    }
}
