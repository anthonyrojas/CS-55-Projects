import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class Dealership {
	private ArrayList<SalesPerson> sp = new ArrayList<SalesPerson>();
	private ArrayList<Car> cars = new ArrayList<Car>();
	private Manager mg;
	private Map <SalesPerson, ArrayList<Car>> salesTransactions = new TreeMap <SalesPerson, ArrayList<Car>>();
	public Dealership(Manager m){
		mg = m;
	}
	
	public Dealership(ArrayList<SalesPerson> salesp, ArrayList<Car> c, Manager m){
		sp = salesp;
		cars = c;
		mg = m;
	}
	
	public void addCar(Car another){
		cars.add(another);
	}
	
	public void addSalesPerson(SalesPerson s){
		sp.add(s);
	}
	
	public void removeSalesPerson(SalesPerson s){
		sp.remove(s);
	}
	
	public void carSold(SalesPerson s){
		
	}
	
	public void removeCar(Car c){
		cars.remove(c);
	}
	
	public void addCaer(Car c){
		cars.remove(c);
	}
	
	
}
