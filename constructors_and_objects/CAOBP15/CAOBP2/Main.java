public class Main{
    public static void main(String[] args){
        Weapon weapon = new Weapon("Excalibur", 50, 100);
        Player player = new Player("Alice");
        
        player.equipWeapon(weapon);
        weapon.showWeapon();
        player.useWeapon(weapon);
    }
}
