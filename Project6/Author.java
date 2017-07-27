import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class Author{
	private String name;
	private int age;
	ArrayList<Book> books = new ArrayList<Book>();

	public Author(String n, int a){
		name = n;
		age = a;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setBook(ArrayList<Book> books){
		this.books = book;
	}

	public String getName(){
		return name;
	}

	public String getAge(){
		return String.valueOf(age);
	}

	public Book getBook(String title){
		return books.get(0);
	}
}