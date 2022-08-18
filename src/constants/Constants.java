package constants;

import java.text.MessageFormat;

/**
 * �R���X�^���c�N���X
 */
public class Constants {
	
	/**
	 * ���b�Z�[�W�̒萔
	 */
	public enum Message{

		//�^�C�g��
		MESSAGE_TITLE("�y�󌱍��i����V�X�e���z\n"),
		
		//���j���[���b�Z�[�W
		MESSAGE_MENU01("���j���[��I�����Ă�������\n1:�o�^ 2:�Ɖ�@3:�폜\n"),
		MESSAGE_MENU02("�v���O�����I�����܂����H\n�y�I���z:end�Ɠ��͂���@�y���j���[�z:�G���^�[�L�[�������Ă�������\n"),
		MESSAGE_MENU03("���j���[��I�����Ă�������\n1:�o�^ 2:�Ɖ�@3:�폜\n"),
		MESSAGE_MENU04("�V�X�e�����I�����܂�\n"),
		
		//���Z���̃R�����g
		MESSAGE_SCHOOL_NAME01("�y�������Z�z\n"),
		MESSAGE_SCHOOL_NAME02("�y�����Z�z\n"),

		//�C���v�b�g���̃R�����g
		MESSAGE_INPUT00("��ID����͂��Ă�������\n"),
		MESSAGE_INPUT01("���O����͂��Ă�������\n"),
		MESSAGE_INPUT02("�󌱍��Z��I�����Ă�������\n"),
		MESSAGE_INPUT03("����̓_������͂��Ă�������\n"),
		MESSAGE_INPUT04("�p��̓_������͂��Ă�������\n"),
		MESSAGE_INPUT05("���w�̓_������͂��Ă�������\n"),
		
		//�Ɖ�b�Z�[�W
		MESSAGE_INQUIRY01("1:ID�����@2:�S�o��\n"),
		MESSAGE_INQUIRY02("�󌱂���w�ZID����͂��ĉ�����\n1:�������Z�@2:�����Z\n"),
		MESSAGE_INQUIRY03("���kID����͂��Ă�������\n"),
		MESSAGE_INQUIRY04("�Y�����鐶�kID������܂���\n"),
		
		//�폜���b�Z�[�W
		MESSAGE_DELETE01("�폜���������܂���\n"),

		

		//�C���v�b�g���̐i�s�R�����g
		MESSAGE_PROGRESS01("���k�̓��͂��p�����܂����H\n�y�I���z:end�Ɠ��́@�y���́z:�G���^�[�L�[�������Ă�������\n"),
		MESSAGE_PROGRESS03(""),
		MESSAGE_PROGRESS04("���̃��j���[���I�����܂�\n"),
		MESSAGE_PROGRESS05("���͂��I�����܂�\n"),
		MESSAGE_PROGRESS06("���͂��p�����܂�\n"),

		//�A�E�g�v�b�g���̐i�s�R�����g
		MESSAGE_OUTPUT01("���O�F"),
		MESSAGE_OUTPUT02("���v�_�F"),
		MESSAGE_OUTPUT03("���ہF"),

		//�C���v�b�g���̃G���[���b�Z�[�W
		MESSAGE_ERROR01("\"���������͂����Ă�������\"\n"),
		MESSAGE_ERROR02("���̎󌱎�ID�͑��݂��Ă��܂���\n"),
		MESSAGE_ERROR03("���������j���[�ԍ�����͂��Ă�������\n\n"),
		MESSAGE_ERROR04("�����I�[�o�[�ł�"),
		MESSAGE_ERROR05("a"),
		MESSAGE_ERROR06("a");

		private String message;
		
		private Message(String message) {
			this.message = message;
		}
		private String getMessage() {
			return message;
		}
		public void showMessaage() {
			System.out.println(this.getMessage());
		}
		public void showMessage(Object... argments) {
			System.out.print(MessageFormat.format(this.getMessage(), argments));
		}
	}
	
	/**
	 * ���i�_�̒萔
	 */
	public enum PassScore{

		//���i�_
		CENTRALSCHOOL01_TOTAL_PASSSCORE(230),
		WESTSCHOOL02_TOTAL_PASSSCORE(250),
		WESTSCHOOL02_ENGLISH_PASSSCORE(80);

		private int passScore;

		PassScore(int passScore) {
			this.passScore = passScore;
		}
		
		private int getPassScore() {
			return passScore;
		}
		
		public int showMessage() {
			return getPassScore();
		}
	}
}
