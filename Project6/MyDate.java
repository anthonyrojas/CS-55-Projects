import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class MyDate{
	private Date date;
	public Date(Date d){
		date = d;
	}

	public void setDate(Date d){
		this.date = d;
	}

	public Date getDate(){
		return date;
	}

	@Override
	public String toString(){
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		return df.format(date);
	}
}