// パートクラス
public class Partjob implements IHuman{
    
    public int bonus; // ボーナス額
    HumanDto data = new HumanDto("佐藤", "パート", 10);
    
    // ボーナスを処理するメソッド
    public int totalBonus(){
        bonus = 30;
        return bonus;
    }
    // 情報を出力するメソッド
    public void show(){
        Constants.MESSAGE01.show(data.getName(), data.getJobName(), data.getSalary(), this.totalBonus());
    }
}
