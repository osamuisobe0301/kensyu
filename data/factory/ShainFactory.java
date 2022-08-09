package data.factory;

import data.dto.YakushokuData;
import data.dto.ShainDto;

import java.util.List;
import java.util.ArrayList;

/**
*
*ShainFactory �Ј��f�[�^�̃t�@�N�g���[
*@author nakama
*
*/
public class ShainFactory{

    public static final List<ShainDto> create(){
        List<ShainDto> shainList = new ArrayList<>();
        
        shainList.add(new ShainDto("001","�c��",YakushokuData.TENCHO,2000,"12345678"));
        shainList.add(new ShainDto("002","����",YakushokuData.TENCHO,2000,"23456789"));
        shainList.add(new ShainDto("003","�R�c",YakushokuData.MG,1500,"34567890"));
        shainList.add(new ShainDto("004","����",YakushokuData.MG,1600,"45678901"));
        shainList.add(new ShainDto("005","�k��",YakushokuData.BAITO,1100,"56789012"));
        shainList.add(new ShainDto("006","�R�{",YakushokuData.BAITO,1200,"67890123"));
            
        return shainList;
    }
}