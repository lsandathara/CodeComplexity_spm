package ControlStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class NestingLevelCheck {
	public int nestingCheck() {
		int countNest =0;
		
		ReadFile readfile = new ReadFile();
		String block = readfile.readfile();
		
//		String[] nest = block.split("[}]");
//		String nestString = nest.toString();
	//outer level of nesting	
		for(int i=0;i<=block.length();i++) {
			if(block.contains("if")) {
				if(block.contains("else if")) {
					countNest++;
				}
				
			}
		}
		System.out.println(countNest);
		
		return countNest;
		
		
		
		
	}
	
	

}
