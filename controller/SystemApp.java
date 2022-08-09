package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

import service.FunctionAll;
import constants.FunctionData;
import constants.Message;
import constants.ErrorMessage;
import data.factory.FunctionFactory;
import exception.ValidateException;

/**
*
* SystemApp �V�X�e���N���N���X
* @author nakama
*
*/
public class SystemApp{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //�@�\�ԍ�
    String functionNum;

    /**
    *�����J�n���\�b�h
    *@throws IOException,ValidateException
    */
    public void start()throws IOException,ValidateException{
        
        while(true){
            try{
                
                //��������
                this.shoki();
                
                //�o���f�[�V�����`�F�b�N
                this.checkVali(this.functionNum);
                
                if((FunctionData.END.getFunctionNum()).equals(this.functionNum)){
                    Message.END.showMessage();
                    return;
                }
                FunctionAll function = FunctionFactory.create(this.functionNum);
                
                //���͏���
                function.input();
                
                //����
                function.shori();
            }catch(ValidateException e){
                System.out.println(e.getMessage());
            }catch(NullPointerException e){
                System.out.println(ErrorMessage.BLANK.getMessage());
                System.out.println(e);
            }
        }
    }
    
    /**
    *���������̃��\�b�h(�@�\�I��)
    *@throws IOException
    */
    private void shoki()throws IOException{
        Message.FUNCTION_SELECT.showMessage(FunctionData.SHAIN_SEARCH.getFunctionName(),FunctionData.YAKUSHOKU_SEARCH.getFunctionName(),FunctionData.CALC_SALARY.getFunctionName(),FunctionData.END.getFunctionName());
        this.functionNum = br.readLine();
    }
    
    /**
    *�o���f�[�V�����`�F�b�N
    *@param functionNum ���������̃��\�b�h�œ��͂��ꂽ�@�\�ԍ�
    *@throws BlankNumberException,SelectException
    */
    private void checkVali(String functionNum)throws ValidateException{
    
        if(functionNum.equals("")){
            throw new ValidateException(ErrorMessage.BLANK.getMessage());
        }else if(!(FunctionData.SHAIN_SEARCH.getFunctionNum()).equals(this.functionNum) && !(FunctionData.YAKUSHOKU_SEARCH.getFunctionNum()).equals(this.functionNum) 
            && !(FunctionData.CALC_SALARY.getFunctionNum()).equals(this.functionNum) && !(FunctionData.END.getFunctionNum()).equals(this.functionNum)){
            throw new ValidateException(ErrorMessage.SELECT.getMessage());
        }
        
    }
    
}
