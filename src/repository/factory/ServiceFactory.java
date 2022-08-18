
package repository.factory;

import java.util.HashMap;
import java.util.Map;

import repository.dto.Service;
import service.dto.DeleteStudent;
import service.dto.InquiryStudent;
import service.dto.RegisterStudent;

/**
 * �T�[�r�X�̃t�@�N�g���[�N���X
 */
public class ServiceFactory {
	
	/**
	 * �T�[�r�X�̃N���G�C�g���\�b�h
	 * @param ���j���[�ԍ�
	 * @return ���j���[
	 */
	public static Service create(String menu) {
		Map<String, Service> ServiceObj = new HashMap<>();
		ServiceObj.put("1", new RegisterStudent());
		ServiceObj.put("2", new InquiryStudent());
		ServiceObj.put("3", new DeleteStudent());
		
		return ServiceObj.get(menu);
	}
}
