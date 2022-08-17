// 処理をするメインクラス
public class Main{
    
    // メインメソッド
    public static void main(String []args){
        
        IHuman emp;
        String shain = args[0];
        
        // 実行時引数で処理を変える
        switch(shain){
        case "1":
            emp = new Shatyo();
            break;
            
        case "2":
            emp = new Katyo();
            break;
            
        default :
            emp = new Partjob();
            break;
        }
        emp.totalBonus();
        emp.show();
    }
}
