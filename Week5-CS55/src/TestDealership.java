import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class TestDealership{

	public static void main(String [] args){
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Manager m = new Manager("Rob", "Stark", "123 Winterfell Rd.", new GregorianCalendar(1999, 00, 14)); //year, month, day ...month starts at 0 and ends at 11
		Car c1 = new Car("Acura", 16549.45, 2008, 98469855L);
		Car c2 = new Car("Honda", 24000.00, 2014, 684984546L);
		Car c3 = new Car("Honda", 15895.78, 2010, 123548998L);
		Car c4 = new Car("Toyota", 14008.25, 2009, 787849951L);
		Car c5 = new Car("Toyota", 12881.80, 2008, 9879856461L);
		Car c6 = new Car("Nissan", 14868.58, 2009, 2354689587L);
		Car c7 = new Car("Hyundai", 15891.00, 2008, 6845446214L);
		Car c8 = new Car("Nissan", 20147.00, 2013, 56864845366L);
		Car c9 = new Car("Chevrolet", 18235.00, 2012, 4568989713L);
		Car c10 = new Car("Chevrolet", 15656.45, 2010, 4885649875L);
		Car c11 = new Car("Acura", 35647.00, 2016, 89846541232L);
		Car c12 = new Car("Volkswagen", 6145.25, 2000, 4587854554L);
	}
}
