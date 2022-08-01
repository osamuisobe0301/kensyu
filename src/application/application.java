package application;

import java.util.List;

import dao.Post;
import dto.character.Shain;
import factory.PostFactory;
import factory.ShainFactory;



/**
 * アプリケーションクラス
 */
public class application {

	/**
	 * メインメソッド
	 */
	public static void main(String[] args) {

		// ファクトリーのインスタンスを生成
		ShainFactory studentFactory = new ShainFactory();

		//生徒リストをクリエイトメソッドで返却
		List<Shain> shainList = ShainFactory.create();

		//社員情報全出力
		for(Shain s : shainList) {

			//社員の役職IDをキーにして紐づいた役職の情報を取得
			Post post = PostFactory.create(s.getPostId());

			//社員dtoの情報出力
			s.toString();

			//役職daoの情報出力
			System.out.println(s);
			post.toString();
		}
	}

}