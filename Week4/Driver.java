import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class Dirver{
	public static void main(String [] args){
		Die[] ard1 = new Die[100];
		Die[] ard2 = new Die[100];
		for(int i=0; i < ard1.length; i++){//initialize the face values of the dice
			ard1[i] = new Die();
			ard2[i] = new Die();
		}
	}
	
	public static void printArray(Die[] ard){
		for(Die d : ard){
			MyIO.display(d.toString());
		}
	}

	public static void throwArrayOfDie(Die[] ard){
		for(int i=0; i < ard.length; i++){
			ard[i] = ard[i].rollDie();
		}
	}

	public static boolean compareArrays(Die[] ard1, Die[] ard2, int i){
		return ard1[i].getFace() == ard2[i].getFace();
	}

	public static int sumArray(Die[] ard){
		int sum=0;
		for(Die d : ard){
			sum+= d.getFace();
		}
		return sum;
	}
}
