class Potion{
    String name;
    int healingAmount;
    int quantity;
    int currentHealth = 100;
    
    Potion(String name, int healingAmount, int quantity){
        this.name = name;
        this.healingAmount = healingAmount;
        this.quantity = quantity;
    }
    
    void drink(Player drinks){
        for(int i = 0; i < 2; i++){
            quantity -= 1;
            System.out.println(drinks.name + " drinks " + name + ", restores " + healingAmount + " HP");
            System.out.println("Health now: " + (currentHealth + healingAmount));
            
            if(quantity == 1){
                System.out.println("Potions left: " + quantity--);
            }
        }
    }
    
    void checkQuantity(){
        if(quantity < 1){
                System.out.println("No more " + name + " left!");
            }
    }
}
