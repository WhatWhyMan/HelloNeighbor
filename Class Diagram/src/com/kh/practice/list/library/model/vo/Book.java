package com.kh.practice.list.library.model.vo;

public class Book {

	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {
	}
	
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "("+title+"/"+author+"/"+category+"/"+price+")";
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	private void compareTo() {
	}
				
}
