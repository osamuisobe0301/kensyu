package repository;

import data.factory.ShainFactory;
import data.dto.ShainDto;

import java.util.List;
import java.util.ArrayList;
/**
*
*ShainMapper データを操作するクラス
*@author nakama
*
*/
public class ShainMapper{

    //社員リスト
    List<ShainDto> shainList = ShainFactory.create();
    
    /**
    *
    *引数で受け取った社員データを社員リストに追加するメソッド
    *@param shainDto 社員データ
    *
    */
    public void addList(ShainDto shainDto){
        shainList.add(shainDto);
    }
    
    /**
    *
    *引数で受け取った社員IDと一致する社員データを検索するメソッド
    *@param shainId 社員ID
    *@return 社員データ
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
    *引数で受け取った役職IDと一致する社員データ一覧を検索するメソッド
    *@param yakushokuId 役職ID
    *@return 社員データリスト
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
    *引数で受け取った社員IDのパスワードと引数で受け取ったパスワードがと一致するか判定するメソッド
    *@param shainId 社員ID 引数1つ目
    *@param password パスワード 引数2つ目
    *@return boolean true＝一致　false＝不一致
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