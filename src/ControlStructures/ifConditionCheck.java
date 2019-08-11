package ControlStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class ifConditionCheck {
	public int checkif() throws FileNotFoundException {
		String p="C:/SLIIT/year 3 sem 2/spm/test/testDoc.txt";
		File f = new File(p);
        Scanner input = new Scanner(f);

        int count = 0;
        while (input.hasNext()) {
            String block = input.next();
		
		//conditional control structures : weight is 1
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
		
        }
		
		System.out.println("Ctc is "+count);
		return count;
		
	}
	


}
