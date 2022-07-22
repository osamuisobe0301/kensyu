package process.all;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Factory.EmpFactory;
import constants.Constants.Message;
import process.Process;
import process.ProcessFactory;

/**
 * @author 
 *
 */
public class SearchEmpInfoApp {
	
	public void start() throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Process process = ProcessFactory.createProcess(br.readLine());
	process.execute(EmpFactory.createList());
	Message.MESSAGE_END01.getMessage();
	
	}
}
