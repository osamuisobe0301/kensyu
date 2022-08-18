
package repository.factory;

import java.util.HashMap;
import java.util.Map;

import repository.dto.Service;
import service.dto.DeleteStudent;
import service.dto.InquiryStudent;
import service.dto.RegisterStudent;

/**
 * サービスのファクトリークラス
 */
public class ServiceFactory {
	
	/**
	 * サービスのクリエイトメソッド
	 * @param メニュー番号
	 * @return メニュー
	 */
	public static Service create(String menu) {
		Map<String, Service> ServiceObj = new HashMap<>();
		ServiceObj.put("1", new RegisterStudent());
		ServiceObj.put("2", new InquiryStudent());
		ServiceObj.put("3", new DeleteStudent());
		
		return ServiceObj.get(menu);
	}
}
