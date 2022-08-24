package datatable;
import java.util.List;

import entity.ShainEntity;

import java.util.Arrays;

/**
 * �Ј����̃e�[�u��
 * @author t.takagi
 */
public class ShainTable{
    
    // �Ј����̃��X�g���쐬
    List<ShainEntity> shainList;
    
    /**
     * �Ј���������������
     */
    public ShainTable(){
    	
        ShainEntity tanaka = new ShainEntity("�c��", 200000, "01", "01");
        ShainEntity suzuki = new ShainEntity("���", 300000, "02", "03");
        ShainEntity nakata = new ShainEntity("���c", 250000, "03", "02");
        ShainEntity ikeda = new ShainEntity("�r�c", 190000, "03", "03");
        
        // �����������Ј������Ј���񃊃X�g�ɐݒ肷��
        shainList = Arrays.asList(tanaka, suzuki, nakata, ikeda);
        
    }
    
    /**
     * �쐬�����Ј���񃊃X�g���R���g���[���Ɂ[�n��
     * @return ShainList �Ј���񃊃X�g
     */
    public List<ShainEntity> create(){
        return shainList;
    }
}