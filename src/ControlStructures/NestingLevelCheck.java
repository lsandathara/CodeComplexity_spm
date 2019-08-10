package ControlStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class NestingLevelCheck {
	public void nestingCheck() {
		int countNest =0;
		
		ReadFile readfile = new ReadFile();
		String block = readfile.readfile();
		
		String[] nest = block.split("[}]");
		String nestString = nest.toString();
		
		
	}
	
	

}
