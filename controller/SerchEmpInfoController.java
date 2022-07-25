package controller;
import java.io.IOException;

import Factory.EmpFactory;
import process.all.SearchEmpInfoApp;

public class SerchEmpInfoController {

	public static void main(String args[])throws IOException{
		
		SearchEmpInfoApp search = new SearchEmpInfoApp();
		search.start();
	}
}