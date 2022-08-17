package testTools;

/**
 * @author t.takagi
 */


import java.util.Scanner;

import exception.SubjectNameException;


/**
 * �c�[��
 */
public class TestTools{
    
    /**
     * �Ȗږ������
     * @return �Ȗږ� subjectName
     */
    public String inputSubject(){
        
        //���̓R�����g
        System.out.println("�Ȗڂ���͂��ĉ�����");
   
        //�Ȗڂ����
		Scanner scannerSubject = new Scanner(System.in);
			String subjectName = scannerSubject.next();
			
			try {
			if(!(subjectName.equals("����")) && !(subjectName.equals("���w")) && !(subjectName.equals("�p��"))) {
			
			throw new SubjectNameException();
			
			}
			}catch(SubjectNameException e){
				System.out.println("�������Ȗڂ���͂��Ă�������");
				System.exit(0);
			}
		    return subjectName;
    }
    
    /**
     * �_�������
     * @return �_�� subjectScore
     */
    public int inputScore(){
        
        //���̓R�����g
        System.out.println("�_������͂��ĉ�����");
        
        //�_�������
    	Scanner scannerScore = new Scanner(System.in);
        String score = scannerScore.next();
        int subjectScore = Integer.parseInt(score);
        try {
        if(subjectScore > 101 || subjectScore>0) {
        	throw new SubjectNameException();
        }
        	
        }catch(SubjectNameException e){
        	System.out.println("�������_������͂��Ă�������");
        	System.exit(0);
        }
        
        return subjectScore;
    }
}