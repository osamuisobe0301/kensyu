package application;
import service.Controller;

/**
 * @author t.takagi
 */
 
/**
 * �A�v���P�[�V�����N���X
 */
public class Application{
    public static void main(String[] args){
        
    	try {
        //�R���g���[���[�𐶐�����
        Controller controller = new Controller();
        
        //�N������
        controller.start();
        
    	}catch(NumberFormatException e) {
    		System.out.println("��������������͂��Ă�������");
    	}
    }
}
