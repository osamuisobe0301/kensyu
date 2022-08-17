package testTools;

/**
 * @author t.takagi
 */


import java.util.Scanner;

import exception.SubjectNameException;


/**
 * ツール
 */
public class TestTools{
    
    /**
     * 科目名を入力
     * @return 科目名 subjectName
     */
    public String inputSubject(){
        
        //入力コメント
        System.out.println("科目を入力して下さい");
   
        //科目を入力
		Scanner scannerSubject = new Scanner(System.in);
			String subjectName = scannerSubject.next();
			
			try {
			if(!(subjectName.equals("国語")) && !(subjectName.equals("数学")) && !(subjectName.equals("英語"))) {
			
			throw new SubjectNameException();
			
			}
			}catch(SubjectNameException e){
				System.out.println("正しい科目を入力してください");
				System.exit(0);
			}
		    return subjectName;
    }
    
    /**
     * 点数を入力
     * @return 点数 subjectScore
     */
    public int inputScore(){
        
        //入力コメント
        System.out.println("点数を入力して下さい");
        
        //点数を入力
    	Scanner scannerScore = new Scanner(System.in);
        String score = scannerScore.next();
        int subjectScore = Integer.parseInt(score);
        try {
        if(subjectScore > 101 || subjectScore>0) {
        	throw new SubjectNameException();
        }
        	
        }catch(SubjectNameException e){
        	System.out.println("正しい点数を入力してください");
        	System.exit(0);
        }
        
        return subjectScore;
    }
}