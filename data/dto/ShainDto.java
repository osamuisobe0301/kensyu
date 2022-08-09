package data.dto;

/**
*
*ShainDto �Ј��f�[�^��ێ������N���X
*@author nakama
*
*/
public class ShainDto{

	//�Ј�ID
	String shainId;
	
	//���O
	String name;
	
	//��EID
	String yakushokuId;
	
	//��E��
	String yakushokuName;
	
	//����
	int timeSalary;
	
	//�p�X���[�h
	String password;
	
	
	public ShainDto(String shainId,String name,YakushokuData yakushoku,int timeSalary,String password){
	
	    //�Ј�ID
		this.shainId = shainId;
	    
	    //���O
		this.name = name;
	    
	    //��EID
		this.yakushokuId = yakushoku.getYakushokuId();
	    
	    //��E��
		this.yakushokuName = yakushoku.getYakushokuName();
	    
	    //����
		this.timeSalary = timeSalary;
	    
	    //�p�X���[�h
		this.password = password;
		
	}
    
    //�Ј�ID�擾
    public String getShainId(){
        return this.shainId;
    }
    
    //���O�擾
    public String getName(){
        return this.name;
    }
    
    //��EID�擾
    public String getYakushokuId(){
        return this.yakushokuId;
    }
    
    //��E���擾
    public String getYakushokuName(){
        return this.yakushokuName;
    }
    
    //�����擾
    public int getTimeSalary(){
        return this.timeSalary;
    }
    
    //�p�X���[�h�擾
    public String getPassword(){
        return this.password;
    }

}