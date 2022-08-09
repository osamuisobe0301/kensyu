package constants;
/**
*
*Message メッセージデータクラス
*@author nakama
*
*/
import java.text.MessageFormat;

public enum Message{

    FUNCTION_SELECT("機能を選択してください。\n1:{0}\n2:{1}\n3:{2}\n99:{3}"),
    END("システムを終了します。"),
    SHAIN_INPUT("社員IDを入力してください。"),
    YAKUSHOKU_INPUT("役職IDを入力してください。"),
    PASSWORD_INPUT("パスワードを入力してください。"),
    WORKTIME_INPUT("勤務時間を入力してください。"),
    MISMATCH_END("3回間違えました。システムを強制終了します。"),
    MISMATCH("IDとパスワードが一致しません。入力しなおしてください。(3回間違えると強制終了します)"),
    ALLDATA("社員ID：{0}　名前：{1}　役職名：{2}　時給：{3}"),
    SALARYDATA("月収：{0}");
    
    private String message;
    
    private Message(String message){
        this.message = message;
    }
    
    public String getMessage(){
        return this.message;
    }
    
    public void showMessage(Object... argments){
        System.out.println(MessageFormat.format(this.getMessage(), argments));
    }
}