class Enemy{
    String type;
    int attackPower;
    int health;
    
    Enemy(String type, int attackPower, int health){
        this.type = type;
        this.attackPower = attackPower;
        this.health = health;
    }
    
    void attack(Player attacking){
        System.out.println(type + " attacks " + attacking.name + " for " + attackPower + " damage!");
        attacking.health -= 20;
        System.out.println(attacking.name + "'s health is now: " + attacking.health);
    }
    
  
    void takeDamage(Player damages, int damage){
                System.out.println(damages.name + " attacks " + type + " for " + damage + " damage!");
                health -= damage;
                System.out.println(type + " health is now: " + health);
        
    }
    
    void isAlive(){
        if(health <= 0){
            System.out.println(type + " is defeated!");
        }else{
            System.out.println(type + " is still alive!");
        }
    }
}
