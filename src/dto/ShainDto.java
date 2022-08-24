package dto;
/**
 * �Ј��̌^
 * @author t,takagi
 */
public class ShainDto{
    
    //�Ј����̗v�f���`����
    private String shainName;
    private int salary;
    private String companyName;
    private String companyId;
    private String postName;
    private String postId;
    
    /**
     * �Ј���������������
     */
    public ShainDto(String shainName, int salary, String companyName, String companyId, String postName, String postId){
        
        this.shainName = shainName;
        this.salary = salary;
        this.companyName = companyName;
        this.companyId = companyId;
        this.postName = postName;
        this.postId = postId;
    }
    
    /**
     * ��Ђ�ID���擾����
     */
    public String getCompanyId(){
        return this.companyId;
    }
    
    /**
     * ��EID���擾����
     */
    public String getPostId(){
        return this.postId;
    }
    
    /**
     * �Ј������o�͂���
     * @Override
     * @return �o�͂���Ј����
     */
	public String toString() {
		return "��Ж�" + companyName +"\n�Ј���:" + shainName + "\n��E��:" + postName + "\n�����F" + salary + "\n";
	}

    
    
    
}