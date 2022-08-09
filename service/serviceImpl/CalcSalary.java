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
*CalcSalary 給与計算システムクラス
*@author nakama
*
*/
public class CalcSalary implements FunctionAll{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    ShainMapper shainMapper = new ShainMapper();
    
    //社員データ
    ShainDto shain;
    
    //役職ID
    String shainId;
    
    //パスワード
    String password;
    
    //勤務時間
    int workTime;
    
    //時給
    int timeSalary;
    
    //月収
    int monthSalary;
    
    //ミスカウント
    int count = 0;
    
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
	            
	            //社員IDのバリデーションチェック
	            this.validationId();
	            Message.PASSWORD_INPUT.showMessage();
	            this.password = br.readLine();
	            
	            //パスワードのバリデーションチェック
	            this.validationPassword();
	            Message.WORKTIME_INPUT.showMessage();
	            this.workTime = Integer.parseInt(br.readLine());
	            
	            //勤務時間のバリデーションチェック
	            this.validationWorkTime();
	            
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
	
	    
	    while(true){
	        boolean check;
	        this.shain = shainMapper.searchShainId(shainId);
	        //社員データのバリデーションチェック
	        this.validationList(this.shain);
	        check = shainMapper.checkPassword(shainId,password);
	        
	        if(check){
	            this.calcSalary();
	            this.output();
	            break;
	        }else{
	            count++;
	            if(count == 3){
	                Message.MISMATCH_END.showMessage();
	                System.exit(0);
	            }
	            Message.MISMATCH.showMessage();
	            this.input();
	        }
	    }
	}
    
    /*
    *
    *社員情報を出力するメソッド
    *
    */
	public void output(){
	
	    Message.ALLDATA.showMessage(shain.getShainId(),shain.getName(),shain.getYakushokuName(),shain.getTimeSalary());
	    Message.SALARYDATA.showMessage(this.monthSalary);
	
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
    *パスワードのバリデーションチェックメソッド
    *@throws ValidateException
    *
    */
    private void validationPassword()throws ValidateException{
        
        if(this.password.equals("")){
            
            //空白文字の場合
            throw new ValidateException(ErrorMessage.BLANK.getMessage());
        }else if(this.password.length() > 16 || this.password.length() < 8){
            
            //8桁以上16桁以下でない場合
            throw new ValidateException(ErrorMessage.LENGTHNUM.getMessage());
        }
    
    }
    

    /*
    *
    *労働時間のバリデーションチェックメソッド
    *@throws ValidateException
    *
    */
    private void validationWorkTime()throws ValidateException{
    
        if(this.workTime < 0 || this.workTime > 744){
            
            //労働時間が想定外の場合
            throw new ValidateException(ErrorMessage.WORKTIME.getMessage());
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
    
    /*
    *
    *月収計算のメソッド
    *
    */
    private void calcSalary(){
        this.timeSalary = shain.getTimeSalary();
        this.monthSalary += this.timeSalary * this.workTime;
        if(("999").equals(shain.getYakushokuId()) && this.workTime >= 200){
            this.monthSalary += 20000;
        }
    }
}