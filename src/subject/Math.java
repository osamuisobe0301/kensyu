package subject;
/**
 * @author t.takagi
 */


/**
 * ���w�̌^
 */
public class Math implements Subject{
    
    //�t�B�[���h
    private String name;
    private int score;
    
    
    //������
    public Math(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    
    /**
     * �]�����o�͂���
     */
    public void rateTest(){
        if(this.score < 55){
            System.out.println("�u�]��:C�v");
        }else if(this.score > 55 && this.score < 69){
            System.out.println("�u�]��:B�v");
        }else if(this.score > 70){
            System.out.println("�]��:A");
        }
        
    }
}