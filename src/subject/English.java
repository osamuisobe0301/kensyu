package subject;
/**
 * @author t.takagi
 */
 
/**
  * �p��̌^
  */
public class English implements Subject{
    
    //�t�B�[���h
    private String name;
    private int score;
    
    //������
    public English(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    /**
     * �]�����o�͂���
     */
    public void rateTest(){
        if(this.score < 40){
            System.out.println("�u�]��:C�v");
        }else if(this.score > 40 && this.score < 59){
            System.out.println("�u�]��:B�v");
        }else if(this.score > 60){
            System.out.println("�]��:A");
        }
        
    }
}