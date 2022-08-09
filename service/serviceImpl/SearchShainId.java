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
*SearchShainId �]�ƈ���񌟍��@�\(�Ј�ID)
*@author nakama
*
*/
public class SearchShainId implements FunctionAll{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ShainMapper shainMapper = new ShainMapper();
    
    //�Ј��f�[�^
    ShainDto shain;
    
    //�Ј�ID
    String shainId;

    
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
	            
	            //ID�̃o���f�[�V�����`�F�b�N
	            this.validationId();
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
	    this.shain = shainMapper.searchShainId(shainId);
	    
	    //�Ј��f�[�^�̗L���̃o���f�[�V�����`�F�b�N
	    this.validationList(this.shain);
	    this.output();
	}
	
    /*
    *
    *�Ј������o�͂��郁�\�b�h
    *
    */
	private void output(){
	    Message.ALLDATA.showMessage(shain.getShainId(),shain.getName(),shain.getYakushokuName(),shain.getTimeSalary());
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
}