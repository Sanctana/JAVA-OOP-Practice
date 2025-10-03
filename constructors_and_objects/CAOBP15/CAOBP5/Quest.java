class Quest{
    String title;
    String difficuly;
    String reward;
    int progress = 0;
    
    Quest(String title, String difficuly, String reward){
        this.title = title;
        this.difficuly = difficuly;
        this.reward = reward;
    }
    
    void assignQuest(Player accept){
        System.out.println(accept.name + " accepted quest: Find " + title + "[Difficulty: " + difficuly + "]");
    }
    
    void updateProgress(int amount){
        for(progress = 40; progress <= 120; progress += amount){
                if(progress >= 120){
                    progress = 100;
                    System.out.println("Quest progress: " + progress + "%");
                }else{
                    System.out.println("Quest progress: " + progress + "%");
                }
                
            
                if(progress == 80){
                    System.out.println("Quest not finished yet!");
                }
        }
        
    }
    
    void completeQuest(Player complete){
        if(progress >= 100){
            System.out.println(complete.name + " completed quest: Find " + title + "! Reward: " + reward);
        }
    }
}
