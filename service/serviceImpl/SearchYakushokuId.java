package service.serviceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.function.Function;

import service.FunctionAll;
import constants.Message;
import constants.ErrorMessage;
import data.dto.ShainDto;
import exception.ValidateException;
import repository.ShainMapper;

/**
*
*SearchShainId 従業員情報検索機能(役職ID)
*@author nakama
*
*/
public class SearchYakushokuId implements FunctionAll{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    ShainMapper shainMapper = new ShainMapper();
    
    //社員データ
    ShainDto shain;
    
    //役職ID
    String yakushokuId;

    /*
    *
    *入力メソッド
    *@throws IOException,ValidateException;
    *
    */
	public void input()throws IOException,ValidateException{
	
	    while(true){
	        try{
	            Message.YAKUSHOKU_INPUT.showMessage();
	            this.yakushokuId = br.readLine();
	            
	            //役職IDのバリデーションチェック
	            this.validationYakushokuId();
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
	    List<ShainDto> shainList = shainMapper.searchYakushokuId(this.yakushokuId);
	    for(ShainDto shain : shainList){
	        this.shain = shain;
	        this.output();
	    }
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
    private void validationYakushokuId()throws ValidateException{
        if(this.yakushokuId.chars().allMatch(Character::isDigit)==false){
            
            //数値が入力されなかった場合
            throw new ValidateException(ErrorMessage.NUMBER.getMessage());
        }else if(this.yakushokuId.equals("")){
            
            //空白文字が入力されたとき
            throw new ValidateException(ErrorMessage.BLANK.getMessage());
        }else if(!("1").equals(this.yakushokuId)&&!("2").equals(this.yakushokuId)&&!("99").equals(this.yakushokuId)){
            
            //該当する役職データがなかった時
            throw new ValidateException(ErrorMessage.YAKUSHOKU.getMessage());
        }
    }
}