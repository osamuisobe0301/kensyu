package subject;
/**
 * @author t.takagi
 */
 
/**
  * ‰pŒê‚ÌŒ^
  */
public class English implements Subject{
    
    //ƒtƒB[ƒ‹ƒh
    private String name;
    private int score;
    
    //‰Šú‰»
    public English(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    /**
     * •]‰¿‚ğo—Í‚·‚é
     */
    public void rateTest(){
        if(this.score < 40){
            System.out.println("u•]‰¿:Cv");
        }else if(this.score > 40 && this.score < 59){
            System.out.println("u•]‰¿:Bv");
        }else if(this.score > 60){
            System.out.println("•]‰¿:A");
        }
        
    }
}