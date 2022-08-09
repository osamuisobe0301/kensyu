package service;

import java.io.IOException;

import constants.ErrorMessage;
import exception.ValidateException;

/**
*
*Function 機能クラス(インターフェース)
*@author nakama
*
*/
public interface FunctionAll{

    /*
    *
    *入力メソッド
    *@throws IOException,ValidateException;
    *
    */
	void input()throws IOException,ValidateException;
	
    /*
    *
    *処理メソッド
    *@throws IOExceptionValidateExeption;
    *
    */
	void shori()throws IOException,ValidateException;

}