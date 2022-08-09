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
*CalcSalary ���^�v�Z�V�X�e���N���X
*@author nakama
*
*/
public class CalcSalary implements FunctionAll{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    ShainMapper shainMapper = new ShainMapper();
    
    //�Ј��f�[�^
    ShainDto shain;
    
    //��EID
    String shainId;
    
    //�p�X���[�h
    String password;
    
    //�Ζ�����
    int workTime;
    
    //����
    int timeSalary;
    
    //����
    int monthSalary;
    
    //�~�X�J�E���g
    int count = 0;
    
    /*
    *
    *���̓��\�b�h
    *@throws IOException,ValidateException;
    *
    */
	public void input()throws IOException,ValidateException{
	    
	    while(true){
	    
	        try{
	            Message.SHAIN_INPUT.showMessage();
	            this.shainId = br.readLine();
	            
	            //�Ј�ID�̃o���f�[�V�����`�F�b�N
	            this.validationId();
	            Message.PASSWORD_INPUT.showMessage();
	            this.password = br.readLine();
	            
	            //�p�X���[�h�̃o���f�[�V�����`�F�b�N
	            this.validationPassword();
	            Message.WORKTIME_INPUT.showMessage();
	            this.workTime = Integer.parseInt(br.readLine());
	            
	            //�Ζ����Ԃ̃o���f�[�V�����`�F�b�N
	            this.validationWorkTime();
	            
	            break;
	        }catch(ValidateException e){
	            System.out.println(e.getMessage());
	        }   
	    }
	}
	
    /*
    *
    *�������\�b�h
    *@throws IOException,ValidateException;
    *
    */
	public void shori()throws IOException,ValidateException{
	
	    
	    while(true){
	        boolean check;
	        this.shain = shainMapper.searchShainId(shainId);
	        //�Ј��f�[�^�̃o���f�[�V�����`�F�b�N
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
    *�Ј������o�͂��郁�\�b�h
    *
    */
	public void output(){
	
	    Message.ALLDATA.showMessage(shain.getShainId(),shain.getName(),shain.getYakushokuName(),shain.getTimeSalary());
	    Message.SALARYDATA.showMessage(this.monthSalary);
	
	}        
    
    /*
    *
    *�Ј�ID�̃o���f�[�V�����`�F�b�N���\�b�h
    *@throws ValidateException
    *
    */
    private void validationId()throws ValidateException{
    
        if(this.shainId.chars().allMatch(Character::isDigit)==false){
            
            //���l�����͂���Ă��Ȃ��ꍇ
            throw new ValidateException(ErrorMessage.NUMBER.getMessage());
        }else if(this.shainId.equals("")){
            
            //�󔒕����̏ꍇ
            throw new ValidateException(ErrorMessage.BLANK.getMessage());
        }else if(this.shainId.length() != 3){
            
            //3�P�^�̐��l�łȂ��ꍇ
            throw new ValidateException(ErrorMessage.LENGTHNUM.getMessage());
        }
    }
    
    /*
    *
    *�p�X���[�h�̃o���f�[�V�����`�F�b�N���\�b�h
    *@throws ValidateException
    *
    */
    private void validationPassword()throws ValidateException{
        
        if(this.password.equals("")){
            
            //�󔒕����̏ꍇ
            throw new ValidateException(ErrorMessage.BLANK.getMessage());
        }else if(this.password.length() > 16 || this.password.length() < 8){
            
            //8���ȏ�16���ȉ��łȂ��ꍇ
            throw new ValidateException(ErrorMessage.LENGTHNUM.getMessage());
        }
    
    }
    

    /*
    *
    *�J�����Ԃ̃o���f�[�V�����`�F�b�N���\�b�h
    *@throws ValidateException
    *
    */
    private void validationWorkTime()throws ValidateException{
    
        if(this.workTime < 0 || this.workTime > 744){
            
            //�J�����Ԃ��z��O�̏ꍇ
            throw new ValidateException(ErrorMessage.WORKTIME.getMessage());
        }
    }
    
    /*
    *
    *�Ј��f�[�^�̃o���f�[�V�����`�F�b�N���\�b�h
    *@throws ValidateException
    *
    */
    private void validationList(ShainDto shain)throws ValidateException{
        if(this.shain == null){
            
            //�Ј��f�[�^���Ȃ��ꍇ
            throw new ValidateException(ErrorMessage.NULLSHAIN.getMessage());
        }
    }
    
    /*
    *
    *�����v�Z�̃��\�b�h
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