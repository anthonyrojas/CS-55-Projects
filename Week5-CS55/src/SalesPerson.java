import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class SalesPerson {
	private String firstName, lastName;
	private double bonus;
	private String address;
	private Date hiringDate;
	
	public SalesPerson(){
		
	}

	public SalesPerson(String fn, String ln, double b, String a, Date hd){
		firstName = fn;
		lastName = ln;
		bonus = b;
		address = a;
		hiringDate = hd;
	}

	public void setFirstName(String fn){
		this.firstName = fn;
	}

	public void setLastName(String ln){
		this.lastName = ln;
	}

	public void setBonus(double b){
		this.bonus = b;
	}

	public void setAddress(String a){
		this.address = a;
	}

	public void setHiringDate(Date hd){
		this.hiringDate = hd;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public double getBonus(){
		return bonus;
	}

	public String getAddress(){
		return address;
	}

	public Date getHiringDate(){
		return hiringDate;
	}

	public String getCalendarDate(Date d){
		return String.valueOf(d.getMonth()) + "/" + String.valueOf(d.getDay()) + "/" + String.valueOf(d.getYear());
	}

	@Override
	public String toString(){
		return firstName + " " + lastName + "\n" + address + "\n$" + bonus + "\n" + getCalendarDate(hiringDate);
	}
}
