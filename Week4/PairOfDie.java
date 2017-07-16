import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class PairOfDie{
	private Die d1, d2;
	public PairOfDie(){
		d1 = new Die();
		d2 = new Die();
	}

	public void setFaceValues(Die d){
		this.d1 = d.rollDie();
		this.d2 = d.rollDie();
	}

	public int[] getFaceValues(){
		int[] values = {this.d1.getFace(), this.d2.getFace()};
		return values;
	}

	@Override
	public String toString(){
		return d1.getFace().toString() + "\t" + d2.getFace().toString();
	}
}
