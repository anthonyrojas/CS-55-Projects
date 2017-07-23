import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class Car {
	private String make;
	private double price;
	private int year;
	private int vinNumber;
	
	public Car(){
		
	}

	public Car(String m, double p, int y, int vN){
		make = m;
		price = p;
		year = y;
		vinNumber = vN;
	}

	public void setMake(String m){
		this.make = m;
	}

	public void setPrice(double price){
		this.price = p;
	}

	public void setYear(int y){
		this.year = y;
	}

	public void setVinNumber(int vN){
		this.vinNumber = vN;
	}

	public String getMake(){
		return make;
	}

	public double getPrice(){
		return price;
	}

	public int getYear(){
		return year;
	}

	public int getVinNumber(){
		return vinNumber;
	}

	@Override
	public String toString(){
		return make + "\t" + String.valueOf(price) + "\t" + String.valueOf(year) + "\t" + String.valueOf(vinNumber); 
	}
}
