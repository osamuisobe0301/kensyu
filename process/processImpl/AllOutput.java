package process.processImpl;

import java.io.IOException;
import java.util.List;

import constants.Constants;
import repository.dto.Shain;
import process.Process;

public class AllOutput implements Process {
	
	@Override
	public void execute(List<Shain> shainList) throws IOException {
		Constants.Message.MESSAGE_SHORIKUBUN03.showMessageBreak();
		for(Shain shain: shainList){
			Constants.Message.MESSAGE_LINE01.showMessageBreak();
			//社員情報を出力するメソッド
			shain.outputInformation();
		}
		
	}
}
