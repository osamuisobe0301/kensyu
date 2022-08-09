package constants;
/**
*
*Message ���b�Z�[�W�f�[�^�N���X
*@author nakama
*
*/
import java.text.MessageFormat;

public enum Message{

    FUNCTION_SELECT("�@�\��I�����Ă��������B\n1:{0}\n2:{1}\n3:{2}\n99:{3}"),
    END("�V�X�e�����I�����܂��B"),
    SHAIN_INPUT("�Ј�ID����͂��Ă��������B"),
    YAKUSHOKU_INPUT("��EID����͂��Ă��������B"),
    PASSWORD_INPUT("�p�X���[�h����͂��Ă��������B"),
    WORKTIME_INPUT("�Ζ����Ԃ���͂��Ă��������B"),
    MISMATCH_END("3��ԈႦ�܂����B�V�X�e���������I�����܂��B"),
    MISMATCH("ID�ƃp�X���[�h����v���܂���B���͂��Ȃ����Ă��������B(3��ԈႦ��Ƌ����I�����܂�)"),
    ALLDATA("�Ј�ID�F{0}�@���O�F{1}�@��E���F{2}�@�����F{3}"),
    SALARYDATA("�����F{0}");
    
    private String message;
    
    private Message(String message){
        this.message = message;
    }
    
    public String getMessage(){
        return this.message;
    }
    
    public void showMessage(Object... argments){
        System.out.println(MessageFormat.format(this.getMessage(), argments));
    }
}