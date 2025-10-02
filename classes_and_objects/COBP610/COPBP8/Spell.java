public class Spell{
    String name;
    String effect;
    int manaCost = 50;
    
    void canCast(int currentMana){
        if(currentMana >= manaCost){
            System.out.println("You can cast " + name + "!");
        }else{
            System.out.println("Not enough Mana!");
        }
    }
    
    void cast(){
        System.out.println(name + " spell cast! Effect: " + effect);
    }
}
