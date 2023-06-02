package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	
//	public String saveData(String kind,String name,String flavor,int numOf,int price )  {
//		String result = null;
//		//TODO
//		return result;
//	}
//	
//	public String confirmData() {
//		String result = null;
//		//TODO
//		return result;
//	}
	
	public SnackController() {}
	Snack s = new Snack();
	
	public String saveData(String kind,String name,String flavor,int numOf,int price )  {
	
	String result = null; 
		
	s.setKind(kind);
	s.setName(name);
	s.setFlavor(flavor);
	s.setNumOf(numOf);
	s.setPrice(price);
	
	return result;
	
	}
	
	public String confirmData() {
		return s.infomation();
	}
	
}
