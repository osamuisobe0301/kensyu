package data.factory;

import data.dto.YakushokuData;
import data.dto.ShainDto;

import java.util.List;
import java.util.ArrayList;

/**
*
*ShainFactory 社員データのファクトリー
*@author nakama
*
*/
public class ShainFactory{

    public static final List<ShainDto> create(){
        List<ShainDto> shainList = new ArrayList<>();
        
        shainList.add(new ShainDto("001","田中",YakushokuData.TENCHO,2000,"12345678"));
        shainList.add(new ShainDto("002","佐藤",YakushokuData.TENCHO,2000,"23456789"));
        shainList.add(new ShainDto("003","山田",YakushokuData.MG,1500,"34567890"));
        shainList.add(new ShainDto("004","加藤",YakushokuData.MG,1600,"45678901"));
        shainList.add(new ShainDto("005","北島",YakushokuData.BAITO,1100,"56789012"));
        shainList.add(new ShainDto("006","山本",YakushokuData.BAITO,1200,"67890123"));
            
        return shainList;
    }
}