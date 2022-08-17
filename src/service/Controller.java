package service;
/**
 * @author t.takagi
 */
 
import java.util.HashMap;
import java.util.Map;

import subject.English;
import subject.Japanese;
import subject.Math;
import subject.Subject;
import testTools.TestTools;


 /**
  * コントローラークラス
  */
public class Controller{
    
    
    /**
     * 起動
     */
    public void start(){
        
        //ツールを生成
        TestTools tool = new TestTools();
        
        //科目入力ツールを呼び出し
        String subjectName = tool.inputSubject();
        
        //点数入力ツールを呼び出し
        int subjectScore = tool.inputScore();
        
        
        //科目マップ
        Map<String, Subject> subjectMap = new HashMap<>();
        
        //キーと値を設定
        subjectMap.put("国語",new Japanese(subjectName, subjectScore));
        subjectMap.put("数学",new Math(subjectName, subjectScore));
        subjectMap.put("英語",new English(subjectName, subjectScore));
        
        //入力した科目を生成
        Subject subject = subjectMap.get(subjectName);
        
        //点数によって評価を出力.
        subject.rateTest();
    }
}