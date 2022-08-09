package controller;

import java.io.IOException;

/**
*
* Main mainクラス
* SystemAppクラスのstart()でシステム開始
* @author nakama
* @param args
* @throws IOException
*
*/
public class Main{

    public static void main (String[] args){

        SystemApp sysApp = new SystemApp();
            
        try{
            
            //開始
            sysApp.start();
        }catch(Exception e){
            System.out.println("予想外のエラーが起こりました。処理を終了します。");
            System.out.println(e);
        }
        
    }

}