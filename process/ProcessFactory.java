package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import process.processImpl.AllOutput;
import process.processImpl.IdSearch;
import process.processImpl.PostSearch;

public class ProcessFactory {

	public static Process createProcess(String processId) {
		
		Map<String, Process> processMap = new HashMap<>();
		processMap.put("1", new AllOutput());
		processMap.put("2", new IdSearch());
		processMap.put("3", new PostSearch());
		
		return processMap.get(processId);
	}
}
