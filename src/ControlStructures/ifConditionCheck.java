package ControlStructures;

import java.util.List;

public class ifConditionCheck {
	public int checkif() {
		int count =0;
		
		ReadFile readfile = new ReadFile();
		String block = readfile.readfile();
		
		//conditional ontrol structures : weight is 1
		if(block.contains("if")) {
			count++;
			if(block.contains("&&")) {
				count++;
			}
			if(block.contains("||")) {
				count++;
			}
			if(block.contains("&")) {
				count++;
			}
			if(block.contains("|")) {
				count++;
			}
		}
		
		
		//Iterative control structures : weight is 2
		if(block.contains("for")) {
			count = count +2;
			if(block.contains("&&")) {
				count = count +2;
			}
			if(block.contains("||")) {
				count = count +2;
			}
			if(block.contains("&")) {
				count = count +2;
			}
			if(block.contains("|")) {
				count = count +2;
			}
		}
		if(block.contains("while")) {
			count = count +2;
			if(block.contains("&&")) {
				count = count +2;
			}
			if(block.contains("||")) {
				count = count +2;
			}
			if(block.contains("&")) {
				count = count +2;
			}
			if(block.contains("|")) {
				count = count +2;
			}
		}
		if(block.contains("do while")) {
			count = count +2;
			if(block.contains("&&")) {
				count = count +2;
			}
			if(block.contains("||")) {
				count = count +2;
			}
			if(block.contains("&")) {
				count = count +2;
			}
			if(block.contains("|")) {
				count = count +2;
			}
		}
		
		//catch statements : weight is 1
		if(block.contains("catch")) {
			count++;
		}
		
		//switch  statments		
		if(block.contains("switch")) {			
			count++;

			
			String[] b = block.split("default");
			String bString = b.toString();
			for(int i = 0;i<=b.length;i++) {
				if(bString.contains("case")) {
					count++;
				}
			}
		}
		
		
		
		System.out.println("Cts is "+count);
		return count;
		
	}

}
