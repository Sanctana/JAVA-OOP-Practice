class Player{
    String name;
    int level;
    int health;
    
    Player(String name, int level, int health){
        this.name = name;
        this.level = level;
        this.health = health;
    }
    
    void showStats(){
        System.out.println("Player: " + name + " | Level: " + level + " | Health: " + health);
    }
}
