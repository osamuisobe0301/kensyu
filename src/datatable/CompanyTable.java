package datatable;
import java.util.List;

import entity.CompanyEntity;

import java.util.Arrays;


/**
 * ��Џ��̃e�[�u��
 * @author t.takagi
 */
public class CompanyTable{
    
    //��Џ��̃��X�g���쐬����
    List<CompanyEntity> companyList;
    
    /**
     * ��Џ�������������
     */
    public CompanyTable(){
        
        CompanyEntity sony = new CompanyEntity("01", "�\�j�[");
        CompanyEntity toshiba = new CompanyEntity("02", "����");
        CompanyEntity panasonic = new CompanyEntity("03", "�p�i�\�j�b�N");
        
        // �����������������X�g�ɒǉ�����
        companyList = Arrays.asList(sony, toshiba, panasonic);
    }
    
    
    /**
     * ��Џ��̃��X�g���R���g���[���[�ɓn��
     * @return  companyList ��Ѓ��X�g
     */
    public List<CompanyEntity> create(){
        return companyList;
    }
    
}