public class Main{
    public static void main(String[] args){
        Quest quest = new Quest();
        
        quest.title = "The Lost Sword";
        
        quest.startQuest();
        quest.updateProgress(50);
        quest.completeQuest();
    }
}
