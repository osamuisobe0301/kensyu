package exception;

/**
 * @author t.takagi
 * ���͂Ɍ�肪����΃G���[�𔭐�������
 */
public class InputException extends Exception{
	private static final long serialVersionUID = 1L;

		/**
		 * �G���[���ƂɃG���[���b�Z�[�W���擾������
		 * @param msg�@�G���[���b�Z�[�W
		 */
		public InputException(String msg) {
			super(msg);
		}
}
