package ControlStructures;

import java.util.List;

public class ifConditionCheck {
	public void checkif() {
		
		ReadFile readfile = new ReadFile();
		String var = readfile.readfile();
		if(var.contains("if")) {
			System.out.println("this code block contains if");
		}
		else
			System.out.println("this code block doesnt contain if");
	}

}
