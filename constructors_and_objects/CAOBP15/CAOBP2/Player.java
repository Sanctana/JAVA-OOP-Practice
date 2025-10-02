class Player{
    String name;
    
    Player(String name){
        this.name = name;
    }
    
    void equipWeapon(Weapon details){
        System.out.println("Player: " + name + " equipped " + details.name + " (Damage: " + details.damage + ")");
    }
    
    void useWeapon(Weapon use){
        System.out.println(use.name + " used, durability left: " + ((use.durability) -= 10));
    }
    
}
