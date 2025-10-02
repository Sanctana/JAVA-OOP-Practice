public class Quest{
    String title;
    int difficulty;
    int reward;
    int progress = 0;
    
    void startQuest(){
        System.out.println("Quest Find " + title + " started!");
        progress += 50;
    }
    
    void updateProgress(int amount){
        System.out.println("Quest progress: " + amount + "%");
        if(amount != 100) System.out.println("Quest not finished yet!"); 
        System.out.println("Quest progress: " + (progress = amount + 50) + "%");
    }
    
    void completeQuest(){
        if(progress >= 100){
             System.out.println("Quest Find " + title + " completed! Reward: " + progress);
        }
    }
}
