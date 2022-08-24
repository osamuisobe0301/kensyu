package datatable;

import java.util.List;

import entity.PostEntity;

import java.util.Arrays;

/**
 * ��E���̃e�[�u��
 * @author t.takagi
 */
public class PostTable{
    
    //��E���̃��X�g���쐬����
    List<PostEntity> postList;
    
    /**
     * ��E���̏���������
     */
    public PostTable(){

        PostEntity shacho = new PostEntity("01", "�В�");
        PostEntity bucho = new PostEntity("02", "����");
        PostEntity kakaricho = new PostEntity("03", "�W��");
        
        //������������E�����E���X�g�ɐݒ肷��
        postList = Arrays.asList(shacho, bucho, kakaricho);    
        
    }
    
    /**
     * ��E���̃��X�g���R���g���[���[�ɓn��
     * @return postList ��E��񃊃X�g
     */
    public List <PostEntity> create(){
        return postList;
    }
}