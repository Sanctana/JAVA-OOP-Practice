public class Enemy{
    String type;
    int health;
    int attackPower; // how much damage the enemy does
     
    void attack(){
        System.out.println(type + " attacks the player!");
    }
    
    void takeDamage(int damage){
        health -= damage;
        System.out.println(type + " takes " + damage + " damage, health now: " + health);
    } // nag update si health
  
    void isAlive(){
        if(health > 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
