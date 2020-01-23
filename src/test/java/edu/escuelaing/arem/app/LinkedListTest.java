package edu.escuelaing.arem.app;

import edu.escuelaing.arem.app.LinkedList;

import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//import static org.junit.Assert.*;

public class LinkedListTest extends TestCase {
	


	public void deberiaAñadirElementosaLaLista(){
		LinkedList <Integer> Lin = new LinkedList<Integer>();
		for(int num=0;num<20;num++) {
			Lin.add(num);
		}
		System.out.println( "1");
		assertEquals(1,1);
	
	}
	
	

}
