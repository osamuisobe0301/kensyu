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
		COMPANY_ID_INPUT("���ID����͂��Ă�������\n01.�\�j�[�@02.���� 03.�p�i�\�j�b�N"),
		POST_ID_INPUT("��EID����͂��Ă�������\n01.�В��@02.���� 03.�W�� ");

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

		public enum ValidationMessage{

			//�G���[���b�Z�[�W�̒萔��ݒ肷��
			VALIDATION_MENU_NUMBER("���������j���[�ԍ�����͂��Ă�������\n"),
			VALIDATION_COMPANY_ID("���������ID����͂��Ă�������\n"),
			VALIDATION_POST_ID("��������EID����͂��Ă�������\n");

			private String validationMessage;

			/**
			 * �G���[���b�Z�[�W������������
			 * @param validationMessage�@
			 */
			private ValidationMessage(String validationMessage) {
				this.validationMessage = validationMessage;
			}

			/**
			 * �G���[���b�Z�[�W���擾����
			 * @return validationMessage �G���[���b�Z�[�W���擾����
			 */			
			public String getValidationMessage() {
				return validationMessage;
			}
		}
	}
}





