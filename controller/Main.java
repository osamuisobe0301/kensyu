package controller;

import java.io.IOException;

/**
*
* Main main�N���X
* SystemApp�N���X��start()�ŃV�X�e���J�n
* @author nakama
* @param args
* @throws IOException
*
*/
public class Main{

    public static void main (String[] args){

        SystemApp sysApp = new SystemApp();
            
        try{
            
            //�J�n
            sysApp.start();
        }catch(Exception e){
            System.out.println("�\�z�O�̃G���[���N����܂����B�������I�����܂��B");
            System.out.println(e);
        }
        
    }

}