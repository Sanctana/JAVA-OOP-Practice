public class Main{
    public static void main(String[] args){
        Item item = new Item();
        
        item.name = "Health Potion";
        item.effect = 20;
        item.quantity = 2;
        
        item.useItem();
        item.showQuantity();
    }
}
