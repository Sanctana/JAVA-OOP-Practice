class Weapon{
    String name;
    int damage;
    int durability;
    
    Weapon(String name, int damage, int durability){
        this.name = name;
        this.damage = damage;
        this.durability = durability;
    }
   
   void showWeapon(){
        System.out.println("Weapon: " + name + " | Damage: " + damage + " | Durability: " + durability);
   }
   
}
