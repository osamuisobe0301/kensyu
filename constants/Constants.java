package constants;

import java.text.MessageFormat;
/**
 * ���b�Z�[�W���Ǘ�����N���X
 */
public class Constants {
	public enum Message {
	//�Ј����o��
	MESSAGE_SHAIN01("�Ј���:"),
	MESSAGE_SHAIN02("��E:"),
	MESSAGE_SHAIN03("��{��:"),
	MESSAGE_SHAIN04("�{�[�i�X:"),
	
	//���C�A�E�g
	MESSAGE_LINE01("------------------------------------------------"),
	
	//�ŏI�����o��
	MESSAGE_END01("�I������ꍇend�Ɠ��͂��Ă�������"),
	MESSAGE_END02("�p������ꍇ�̓G���^�[�L�[����͂��Ă�������"),
	
	//�����敪�o��
	MESSAGE_SHORIKUBUN01("�����敪��I�����Ă�������"),
	MESSAGE_SHORIKUBUN02("0:ID�����o�́@1:��E�o�� 2:�S�o��"),
	MESSAGE_SHORIKUBUN03("�Ј�ID����͂��Ă�������"),
	MESSAGE_SHORIKUBUN04("��EID����͂��Ă�������"),
	MESSAGE_SHORIKUBUN05("01:��ʁ@02:��C 03:�W��"),
	//
	MESSAGE_ERROR01("���������͂����Ă�������");
	

	private Message(String message) {
		this.message = message;
	}
	private String message;

	public String getMessage() {
		return message;
	}
	/**
	 * ���s���ă��b�Z�[�W���o�͂��郁�\�b�h
	 */
	public void showMessageBreak(Object... argments) {
		System.out.println(MessageFormat.format(this.getMessage(), argments));
	}
	/**
	 * ���s�Ȃ��Ń��b�Z�[�W���o�͂��郁�\�b�h
	 */
	public void showMessage(Object... argments) {
		System.out.print(MessageFormat.format(this.getMessage(), argments));
	}
	}
}
