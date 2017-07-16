import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class Die{
	
	public int MAX_FACES = 6;
	private int face;
	Random r = new Random(System.currentTimeMillis()); //random seed helps randomize the face value

	public Die(){
		face = r.nextInt(MAX_FACES) + 1;
	}

	public void rollDie(){
		face = r.nextInt(MAX_FACES) + 1;
	}

	public int getFace(){
		return face;
	}

	@Override
	public String toString(){
		return face.toString();
	}
}
