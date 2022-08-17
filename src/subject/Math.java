package subject;
/**
 * @author t.takagi
 */


/**
 * 数学の型
 */
public class Math implements Subject{
    
    //フィールド
    private String name;
    private int score;
    
    
    //初期化
    public Math(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    
    /**
     * 評価を出力する
     */
    public void rateTest(){
        if(this.score < 55){
            System.out.println("「評価:C」");
        }else if(this.score > 55 && this.score < 69){
            System.out.println("「評価:B」");
        }else if(this.score > 70){
            System.out.println("評価:A");
        }
        
    }
}