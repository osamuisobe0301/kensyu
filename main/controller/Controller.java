package main.controller;
import java.io.IOException;

import process.all.Search;
import repository.factory.Factory;

public class Controller {

	public static void main(String args[])throws IOException{
		//�R���X�g���N�^�ŎЈ����X�g�𐶐�
		Factory.createList();
		Search search = new Search();
		search.start();
	}
}