package exception;

/**
*
*MyException 自作例外処理
*@author nakama
*
*/
public class ValidateException extends Exception{
	public ValidateException(String str){
		super(str);
	}
}
//
///**
//*
//*BlankNumberException 空白文字が入力された時の例外処理
//*
//*/
//class BlankNumberException extends MyException{
//		public BlankNumberException(){
//			super("値が入っていません");
//	}
//}
//	
///**
//*
//*SelectException 誤った選択肢が入力された時の例外処理
//*
//*/
//class SelectException extends MyException{
//    public SelectException(){
//        super("選択肢が間違っています。");
//    }
//}
//
///**
//*
//*NullShainException 該当する社員のデータがなかった時の例外処理
//*
//*/
//class NullShainException extends MyException{
//    public NullShainException(){
//        super("該当する社員はいません。");
//    }
//}
//
///**
//*
//*LengthException 想定外の桁数が入力された時の例外処理
//*
//*/
//class LengthException extends MyException{
//    public LengthException(){
//        super("桁数が間違っています");
//    }
//}
//
///**
//*
//*NumberException数値以外が入力された時の例外処理
//*
//*/
//class NumberException extends MyException{
//    public NumberException(){
//        super("数値を入力してください。");
//    }
//}
//
///**
//*
//*YakushokuException 該当する役職が入力されなかった時の例外処理
//*
//*/
//class YakushokuException extends MyException{
//    public YakushokuException(){
//        super("該当する役職はありません");
//    }
//}
//
///**
//*
//*WorkTimeException 労働時間が想定外の時間数だった時の例外処理
//*
//*/
//class WorkTimeException extends MyException{
//    public WorkTimeException(){
//        super("想定外の数値です。");
//    }
//}