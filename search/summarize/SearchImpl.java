package search.summarize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import constants.Constants;
import exception.InputError;
import repository.dto.Search;
import repository.dto.Shain;
import repository.factory.EmpFactory;
import repository.factory.ServiceFactory;

/**
 * @author t.takagi
 *
 */
public class SearchImpl {
	/**
	 *　検索システムをスタートするメソッド
	 */
	public void start() throws IOException, InputError {
	Constants.Message.MESSAGE_SHORIKUBUN01.showMessageBreak();
	Constants.Message.MESSAGE_SHORIKUBUN02.showMessageBreak();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String shoriKubun = br.readLine();
	ServiceFactory serviceFactory = new ServiceFactory();
	serviceFactory.ShoriKubunMapCreate();
	Search service = ServiceFactory.createServiceReturn(shoriKubun);
	List<Shain> shainList = EmpFactory.createListReturn();
	service.search(shainList);
	}
	
	
	
	
	/*boolean check = true;
		public void start() throws IOException {
		
		while(check) {
			List<Shain> shainList = EmpFactory.createListReturn();
			
			Constants.Message.MESSAGE_SHORIKUBUN01.showMessageBreak();
			Constants.Message.MESSAGE_SHORIKUBUN02.showMessageBreak();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String shoriKubun = br.readLine();
			switch(shoriKubun) {
			case "0":
				IdSearch.searchId(shainList);
				break;
			case "1":
				PostSearch.searchPost(shainList);
				break;
			case "2":
				AllOutput.allOutput(shainList);
				break;
			}
			check = EndCheck.check();
		}
	}*/
}
