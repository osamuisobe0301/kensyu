package entity;
/**
 * @author t.takagi
 * �Ј����̃e�[�u���̌^
 */
public class ShainEntity{
    
    //�Ј����̗v�f
    private String shainName;
    private int salary;
    private String companyId;
    private String postId;
    
    /**
     * �Ј����̃e�[�u���̏������̐ݒ�
     */
    public ShainEntity(String shainName, int salary, String companyId, String postId){
        this.shainName = shainName;
        this.salary = salary;
        this.companyId = companyId;
        this.postId = postId;
    }
    
    /**
     * �Ј������擾����
     * @return shainName �Ј���
     */
    public String getShainName(){
        return this.shainName;
    }
    
    /**
     * �Ј��̋������擾����
     * @return salary �Ј��̋���
     */
    public int getSalary(){
        return this.salary;
    }
    
    /**
     * �Ј��̉��ID���擾����
     * @return companyId �Ј��̉��ID
     */
	public String getCompanyId() {
		return companyId;
	}
	
    /**
     * �Ј��̖�EID���擾����
     * @return postId ��EID
     */
	public String getPostId() {
		return postId;
	}
}