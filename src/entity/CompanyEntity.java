package entity;


/**
 * @author t.takagi
 * ��Џ��̃e�[�u���̌^
 */
public class CompanyEntity{
    
    //��Џ��̗v�f
    private String companyName;
    private String companyId;
    
    /**
     *��Џ�������������
     */
    public CompanyEntity(String companyId, String companyName){
        this.companyName = companyName;
        this.companyId = companyId;
    }
    
    /**
     * ��Ђ�ID���擾����
     * @return companyId ���ID
     */ 
    public String getCompanyId(){
        return this.companyId;
    }
    
    /**
     * ��Ђ̖��O���擾����
     * @return companyName ��Ђ̖��O
     */
    public String getCompanyName(){
        return this.companyName;
    }
}