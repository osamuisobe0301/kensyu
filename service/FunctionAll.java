package service;

import java.io.IOException;

import constants.ErrorMessage;
import exception.ValidateException;

/**
*
*Function �@�\�N���X(�C���^�[�t�F�[�X)
*@author nakama
*
*/
public interface FunctionAll{

    /*
    *
    *���̓��\�b�h
    *@throws IOException,ValidateException;
    *
    */
	void input()throws IOException,ValidateException;
	
    /*
    *
    *�������\�b�h
    *@throws IOExceptionValidateExeption;
    *
    */
	void shori()throws IOException,ValidateException;

}