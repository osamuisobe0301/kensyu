package service.serviceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

import service.FunctionAll;
import constants.Message;
import constants.ErrorMessage;
import data.dto.ShainDto;
import exception.ValidateException;
import repository.ShainMapper;

/**
*
*SearchShainId 従業員情報検索機能(社員ID)
*@author nakama
*
*/
public class SearchShainId implements FunctionAll{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ShainMapper shainMapper = new ShainMapper();
    
    //社員データ
    ShainDto shain;
    
    //社員ID
    String shainId;

    
    /*
    *
    *入力メソッド
    *@throws IOException,ValidateException;
    *
    */
    public void input()throws IOException,ValidateException{
	    while(true){
	        try{
	            Message.SHAIN_INPUT.showMessage();
	            this.shainId = br.readLine();
	            
	            //IDのバリデーションチェック
	            this.validationId();
	            break;
	        }catch(ValidateException e){
	            System.out.println(e.getMessage());
	        }
	    }
	}
	
    /*
    *
    *処理メソッド
    *@throws IOException,ValidateException;
    *
    */
	public void shori()throws IOException,ValidateException{
	    this.shain = shainMapper.searchShainId(shainId);
	    
	    //社員データの有無のバリデーションチェック
	    this.validationList(this.shain);
	    this.output();
	}
	
    /*
    *
    *社員情報を出力するメソッド
    *
    */
	private void output(){
	    Message.ALLDATA.showMessage(shain.getShainId(),shain.getName(),shain.getYakushokuName(),shain.getTimeSalary());
	}
    
    /*
    *
    *社員IDのバリデーションチェックメソッド
    *@throws ValidateException
    *
    */
    private void validationId()throws ValidateException{
        if(this.shainId.chars().allMatch(Character::isDigit)==false){
            
            //数値が入力されていない場合
            throw new ValidateException(ErrorMessage.NUMBER.getMessage());
        }else if(this.shainId.equals("")){
            
            //空白文字の場合
            throw new ValidateException(ErrorMessage.BLANK.getMessage());
        }else if(this.shainId.length() != 3){
            
            //3ケタの数値でない場合
            throw new ValidateException(ErrorMessage.LENGTHNUM.getMessage());
        }
    }
    
    /*
    *
    *社員データのバリデーションチェックメソッド
    *@throws ValidateException
    *
    */
    private void validationList(ShainDto shain)throws ValidateException{
        if(this.shain == null){
            
            //社員データがない場合
            throw new ValidateException(ErrorMessage.NULLSHAIN.getMessage());
        }
    }
}