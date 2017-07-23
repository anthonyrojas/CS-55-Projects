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

	private ArrayList<Transaction> carSales = new ArrayList<Transaction>();

	public Dealership(Manager m){
		mg = m;
	}
	
	public Dealership(Manager m, ArrayList<SalesPerson> salesp, ArrayList<Car> c, ArrayList<Transaction> cL){
		sp = salesp;
		cars = c;
		mg = m;
		carSales=cL;
	}

	public void setManager(Manager m){
		this.mg = m;
	}

	public voidGetManager(){
		return mg;
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
	
	public SalesPerson getPersonOfTheMonth(){
		double highestBonus = sp.get(0).getBonus();
		SalesPerson topSalesPerson = sp.get(0);
		for(SalesPerson s : sp){
			if(s.getBonus() > highestBonus){
				highestBonus = s.getBonus();
				topSalesPerson = s;
			}
		}
		return topSalesPerson;
	}

	@Override
	public String toString(){
		
	}
}
