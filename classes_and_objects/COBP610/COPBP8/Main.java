public class Main{
    public static void main(String[] args){
        Spell spell = new Spell();
        
        spell.name = "Fireball";
        spell.effect = "Burns enemy";
        
        spell.canCast(20);
        spell.canCast(50);
        spell.cast();
    }
}
