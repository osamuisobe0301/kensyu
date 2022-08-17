package service;
/**
 * @author t.takagi
 */
 
import java.util.HashMap;
import java.util.Map;

import subject.English;
import subject.Japanese;
import subject.Math;
import subject.Subject;
import testTools.TestTools;


 /**
  * �R���g���[���[�N���X
  */
public class Controller{
    
    
    /**
     * �N��
     */
    public void start(){
        
        //�c�[���𐶐�
        TestTools tool = new TestTools();
        
        //�Ȗړ��̓c�[�����Ăяo��
        String subjectName = tool.inputSubject();
        
        //�_�����̓c�[�����Ăяo��
        int subjectScore = tool.inputScore();
        
        
        //�Ȗڃ}�b�v
        Map<String, Subject> subjectMap = new HashMap<>();
        
        //�L�[�ƒl��ݒ�
        subjectMap.put("����",new Japanese(subjectName, subjectScore));
        subjectMap.put("���w",new Math(subjectName, subjectScore));
        subjectMap.put("�p��",new English(subjectName, subjectScore));
        
        //���͂����Ȗڂ𐶐�
        Subject subject = subjectMap.get(subjectName);
        
        //�_���ɂ���ĕ]�����o��.
        subject.rateTest();
    }
}