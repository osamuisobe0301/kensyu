package subject;
/**
 * @author t.takagi
 */

/**
  * ����̌^
  */
public class Japanese implements Subject{
    
    //�t�B�[���h
    private String name;
    private int score;
    
    //������
    public Japanese(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    /**
     * �]�����o�͂���
     */
    public void rateTest(){
        if(this.score < 50){
            System.out.println("�u�]��:C�v");
        }else if(this.score > 50 && this.score < 80){
            System.out.println("�u�]��:B�v");
        }else if(this.score > 80){
            System.out.println("�]��:A");
        }
        
    }
}



//����:50�_�����u�]��:C�v�A50�_~79�_�u�]��:B�v�A80�_�ȏ�u�]��:A�v
//���w:55�_�����u�]��:C�v�A55�_~69�_�u�]��:B�v�A70�_�ȏ�u�]��:A�v
//�p��:40�_�����u�]��:C�v�A40�_~59�_�u�]��:B�v�A60�_�ȏ�u�]��:A�v