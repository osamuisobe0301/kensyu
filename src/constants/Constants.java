package constants;

/**
 * @author t.takagi
 * �萔��ݒ肷��
 */
public class Constants {
	
	/**
	 * �V�X�e���̐i�s���b�Z�[�W���`����
	 */
	public enum MESSAGE{
		
		//�i�s���b�Z�[�W�̒萔��ݒ肷��
		MENU_NUMBER_INPUT("���j���[�ԍ�����͂��Ă�������\n 1.���ID�Ō�������@2.��EID�Ō�������@3.�Ј�����S�o�͂���"),
		COMPANY_ID_INPUT("���ID����͂��Ă�������"),
		POST_ID_INPUT("��EID����͂��Ă�������");
		
		private String message;
		
		/**
		 * �i�s���b�Z�[�W������������
		 * @param message
		 */
		private MESSAGE(String message){
			this.message = message;
		}
		
		/**
		 * �i�s���b�Z�[�W���擾����
		 * @return message �i�s���b�Z�[�W
		 */
		public String getMessage() {
			return this.message;
		}
	}
}
