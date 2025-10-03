public class Main{
    public static void main(String[] args){
        Quest quest = new Quest("The Lost Sword", "Hard", "100 gold");
        Player player1 = new Player("Alice");
        
        quest.assignQuest(player1);
        quest.updateProgress(40);
        quest.completeQuest(player1);
    }
}
