package constants;
/**
*
*ErrorMessage �G���[���b�Z�[�W�̃f�[�^�N���X
*@author nakama
*
*/
public enum ErrorMessage{

	BLANK("�l�������Ă��܂���"),
	SELECT("�I����������Ă��܂�"),
	NULLSHAIN("�Y������Ј��͂��܂���"),
	LENGTHNUM("����������Ă��܂�"),
	NUMBER("���l����͂��Ă��������B"),
	YAKUSHOKU("�Y�������E�͂���܂���"),
	WORKTIME("�z��O�̐��l�ł�");
	
	private String message;
	
	private ErrorMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
	
		return this.message;
	
	}
}