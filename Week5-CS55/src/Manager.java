import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class Manager {
	private String firstName, lastName;
	private String address;
	private Date hiringDate;
	
	public Manager(){
	}
	
	public Manager(String fn, String ln, String a, Date hd){
		firstName = fn;
		lastName = ln;
		address = a;
		hiringDate = hd;
	}
	
	public void setFirstName(String fn){
		this.firstName = fn;
	}
	
	public void setLastName(String ln){
		this.lastName = ln;
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
	
	public String getAddress(){
		return address;
	}
	
	public Date getHiringDate(){
		return hiringDate;
	}
	
	@Override
	public String toString(){
		String s = firstName + " " + lastName + "\n" + address + "\n" + hiringDate.getMonth() + "/" + hiringDate.getDay() + "/" + hiringDate.getYear();
		return s;
	}
}
