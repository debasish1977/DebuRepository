package com.debu.SampleJavaProject;

import java.util.ArrayList;
import java.util.Iterator;

public class FirstArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> firstArr = new ArrayList<String>();
		firstArr.add("Debu");
		firstArr.add("Nilu");
		firstArr.add("Rivi");
		firstArr.add("Rey");
		
		
		firstArr.add("Maa");
		firstArr.add("baba");
		Iterator<String> firstIte=firstArr.iterator();
		while(firstIte.hasNext())
		{
			System.out.println("Elements-->"+firstIte.next());
		}
		
		

	}

}
