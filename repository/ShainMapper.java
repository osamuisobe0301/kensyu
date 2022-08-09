package repository;

import data.factory.ShainFactory;
import data.dto.ShainDto;

import java.util.List;
import java.util.ArrayList;
/**
*
*ShainMapper �f�[�^�𑀍삷��N���X
*@author nakama
*
*/
public class ShainMapper{

    //�Ј����X�g
    List<ShainDto> shainList = ShainFactory.create();
    
    /**
    *
    *�����Ŏ󂯎�����Ј��f�[�^���Ј����X�g�ɒǉ����郁�\�b�h
    *@param shainDto �Ј��f�[�^
    *
    */
    public void addList(ShainDto shainDto){
        shainList.add(shainDto);
    }
    
    /**
    *
    *�����Ŏ󂯎�����Ј�ID�ƈ�v����Ј��f�[�^���������郁�\�b�h
    *@param shainId �Ј�ID
    *@return �Ј��f�[�^
    *
    */
	public ShainDto searchShainId(String shainId){
	    ShainDto shainDto = null;
	    for(ShainDto shain : shainList){
	        if(shainId.equals(shain.getShainId())){
	            shainDto = shain;
	        }
	    }
	    return shainDto;
	}
	
    /**
    *
    *�����Ŏ󂯎������EID�ƈ�v����Ј��f�[�^�ꗗ���������郁�\�b�h
    *@param yakushokuId ��EID
    *@return �Ј��f�[�^���X�g
    *
    */
    public List<ShainDto> searchYakushokuId(String yakushokuId){
        List<ShainDto> yakushokuList = new ArrayList<>();
        for(ShainDto shain : shainList){
            if(yakushokuId.equals(shain.getYakushokuId())){
                yakushokuList.add(shain);
            }
        }
        return yakushokuList;
    }
	
    /**
    *
    *�����Ŏ󂯎�����Ј�ID�̃p�X���[�h�ƈ����Ŏ󂯎�����p�X���[�h���ƈ�v���邩���肷�郁�\�b�h
    *@param shainId �Ј�ID ����1��
    *@param password �p�X���[�h ����2��
    *@return boolean true����v�@false���s��v
    *
    */
    public boolean checkPassword(String shainId,String password){
        boolean check;
        ShainDto shainDto = this.searchShainId(shainId);
        if(password.equals(shainDto.getPassword())){
            check = true;
        }else{
            check = false;
        }
        return check;
    }
}