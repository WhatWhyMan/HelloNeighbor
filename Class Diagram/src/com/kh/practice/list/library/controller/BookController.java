package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {

	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public BookController() {
		
		bookList.add(new Book("�ڹ��� ����","���� ��", "��Ÿ", 20000));
		bookList.add(new Book("���� ���� �˰���","������", "��Ÿ", 15000));
		bookList.add(new Book("��ȭ�� ���","������", "�ι�", 17500));
		bookList.add(new Book("�� ������","�ڽſ�", "�Ƿ�", 21000));
	}
	
	public void insertBook(Book bk) {
		bookList.add(new Book());
	}
	
	public ArrayList selectList() {
		return bookList;
	}
	
	public ArrayList searchBook(String keyword) {
		
	}
	
	public Book deleteBook(String titme, String author) {
		
	}
	
	public int ascBook() {
		
	}
	
	
}
