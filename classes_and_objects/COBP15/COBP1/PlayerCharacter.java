public class PlayerCharacter{
    String name;
    int level;
    int health;
    
    void attack(){
        System.out.println(name + " attacks and deals damage!");
    }
    
    void heal(){
        System.out.println(name + " restores health!");       
    }   
}
