package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

import service.FunctionAll;
import constants.FunctionData;
import constants.Message;
import constants.ErrorMessage;
import data.factory.FunctionFactory;
import exception.ValidateException;

/**
*
* SystemApp システム起動クラス
* @author nakama
*
*/
public class SystemApp{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //機能番号
    String functionNum;

    /**
    *処理開始メソッド
    *@throws IOException,ValidateException
    */
    public void start()throws IOException,ValidateException{
        
        while(true){
            try{
                
                //初期処理
                this.shoki();
                
                //バリデーションチェック
                this.checkVali(this.functionNum);
                
                if((FunctionData.END.getFunctionNum()).equals(this.functionNum)){
                    Message.END.showMessage();
                    return;
                }
                FunctionAll function = FunctionFactory.create(this.functionNum);
                
                //入力処理
                function.input();
                
                //処理
                function.shori();
            }catch(ValidateException e){
                System.out.println(e.getMessage());
            }catch(NullPointerException e){
                System.out.println(ErrorMessage.BLANK.getMessage());
                System.out.println(e);
            }
        }
    }
    
    /**
    *初期処理のメソッド(機能選択)
    *@throws IOException
    */
    private void shoki()throws IOException{
        Message.FUNCTION_SELECT.showMessage(FunctionData.SHAIN_SEARCH.getFunctionName(),FunctionData.YAKUSHOKU_SEARCH.getFunctionName(),FunctionData.CALC_SALARY.getFunctionName(),FunctionData.END.getFunctionName());
        this.functionNum = br.readLine();
    }
    
    /**
    *バリデーションチェック
    *@param functionNum 初期処理のメソッドで入力された機能番号
    *@throws BlankNumberException,SelectException
    */
    private void checkVali(String functionNum)throws ValidateException{
    
        if(functionNum.equals("")){
            throw new ValidateException(ErrorMessage.BLANK.getMessage());
        }else if(!(FunctionData.SHAIN_SEARCH.getFunctionNum()).equals(this.functionNum) && !(FunctionData.YAKUSHOKU_SEARCH.getFunctionNum()).equals(this.functionNum) 
            && !(FunctionData.CALC_SALARY.getFunctionNum()).equals(this.functionNum) && !(FunctionData.END.getFunctionNum()).equals(this.functionNum)){
            throw new ValidateException(ErrorMessage.SELECT.getMessage());
        }
        
    }
    
}
