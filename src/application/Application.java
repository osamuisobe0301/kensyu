package application;
import service.Controller;

/**
 * @author t.takagi
 */
 
/**
 * アプリケーションクラス
 */
public class Application{
    public static void main(String[] args){
        
    	try {
        //コントローラーを生成する
        Controller controller = new Controller();
        
        //起動する
        controller.start();
        
    	}catch(NumberFormatException e) {
    		System.out.println("正しい数字を入力してください");
    	}
    }
}
