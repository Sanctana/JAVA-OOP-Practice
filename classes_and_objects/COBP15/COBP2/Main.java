public class Main{
    public static void main(String[] args){
        Weapon weapon = new Weapon();
        
        weapon.durability = 9;
        weapon.damage = 20;
        
        weapon.use();
        weapon.showStats();
    }
}
