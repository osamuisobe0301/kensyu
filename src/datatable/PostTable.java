package datatable;

import java.util.List;

import entity.PostEntity;

import java.util.Arrays;

/**
 * 役職情報のテーブル
 * @author t.takagi
 */
public class PostTable{
    
    //役職情報のリストを作成する
    List<PostEntity> postList;
    
    /**
     * 役職情報の初期化する
     */
    public PostTable(){

        PostEntity shacho = new PostEntity("01", "社長");
        PostEntity bucho = new PostEntity("02", "部長");
        PostEntity kakaricho = new PostEntity("03", "係長");
        
        //初期化した役職情報を役職リストに設定する
        postList = Arrays.asList(shacho, bucho, kakaricho);    
        
    }
    
    /**
     * 役職情報のリストをコントローラーに渡す
     * @return postList 役職情報リスト
     */
    public List <PostEntity> create(){
        return postList;
    }
}