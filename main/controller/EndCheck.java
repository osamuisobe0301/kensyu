package main.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import constants.Constants;

public class EndCheck{
	public static boolean check() throws IOException {
		Constants.Message.MESSAGE_LINE01.showMessageBreak();
		Constants.Message.MESSAGE_END01.showMessageBreak();
		Constants.Message.MESSAGE_END02.showMessageBreak();
		
		//end‚Æ“ü—Í‚·‚ê‚Îfalse‚ğ•Ô‚µI—¹‚·‚é
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String check = br.readLine();
		if(check.equals("end")) {
			return false;
		}else {
			return true;
		}
	}
}
