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
*SearchShainId �]�ƈ���񌟍��@�\(��EID)
*@author nakama
*
*/
public class SearchYakushokuId implements FunctionAll{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    ShainMapper shainMapper = new ShainMapper();
    
    //�Ј��f�[�^
    ShainDto shain;
    
    //��EID
    String yakushokuId;

    /*
    *
    *���̓��\�b�h
    *@throws IOException,ValidateException;
    *
    */
	public void input()throws IOException,ValidateException{
	
	    while(true){
	        try{
	            Message.YAKUSHOKU_INPUT.showMessage();
	            this.yakushokuId = br.readLine();
	            
	            //��EID�̃o���f�[�V�����`�F�b�N
	            this.validationYakushokuId();
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
	    List<ShainDto> shainList = shainMapper.searchYakushokuId(this.yakushokuId);
	    for(ShainDto shain : shainList){
	        this.shain = shain;
	        this.output();
	    }
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
    private void validationYakushokuId()throws ValidateException{
        if(this.yakushokuId.chars().allMatch(Character::isDigit)==false){
            
            //���l�����͂���Ȃ������ꍇ
            throw new ValidateException(ErrorMessage.NUMBER.getMessage());
        }else if(this.yakushokuId.equals("")){
            
            //�󔒕��������͂��ꂽ�Ƃ�
            throw new ValidateException(ErrorMessage.BLANK.getMessage());
        }else if(!("1").equals(this.yakushokuId)&&!("2").equals(this.yakushokuId)&&!("99").equals(this.yakushokuId)){
            
            //�Y�������E�f�[�^���Ȃ�������
            throw new ValidateException(ErrorMessage.YAKUSHOKU.getMessage());
        }
    }
}