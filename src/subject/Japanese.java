package subject;
/**
 * @author t.takagi
 */

/**
  * 国語の型
  */
public class Japanese implements Subject{
    
    //フィールド
    private String name;
    private int score;
    
    //初期化
    public Japanese(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    /**
     * 評価を出力する
     */
    public void rateTest(){
        if(this.score < 50){
            System.out.println("「評価:C」");
        }else if(this.score > 50 && this.score < 80){
            System.out.println("「評価:B」");
        }else if(this.score > 80){
            System.out.println("評価:A");
        }
        
    }
}



//国語:50点未満「評価:C」、50点~79点「評価:B」、80点以上「評価:A」
//数学:55点未満「評価:C」、55点~69点「評価:B」、70点以上「評価:A」
//英語:40点未満「評価:C」、40点~59点「評価:B」、60点以上「評価:A」