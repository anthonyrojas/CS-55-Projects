import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class Book implements Comparable<Book>{
	private String title;
	private ArrayList<Author> authors;
	private MyDate publishing;
	private double price;

	public Book(){

	}

	public Book(String t, ArrayList<Author> a, MyDate pub, double p){
		title = t;
		authors = a;
		publishing = pub;
		price = p;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setDate(MyDate date){
		this.publishing = date;
	}

	public void setPrice(double p){
		this.price = p;
	}

	public String getTitle(){
		return title;
	}

	public MyDate getDate(){
		return publishing;
	}

	public double getPrice(){
		return price;
	}

	@Override
	public int compareTo(Book b){
		String t1 = this.title.toLowerCase();
		String t2 = b.getTitle().toLowerCase();
	}
}