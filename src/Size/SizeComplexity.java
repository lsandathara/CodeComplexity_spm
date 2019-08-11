package Size;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SizeComplexity {
	public static void main(String arg[]) throws FileNotFoundException {
		
		File file = new File("C:\\Users\\3c TECH\\eclipse-workspace\\ComplexityMeasuring\\testfile");
		Scanner input = new Scanner(file);
		
		int count = 0;
		String classValue = null;
		
		while(input.hasNext()){
		String word = input.next().toString();
		//System.out.println(word);
		
		
		
		if (word.contains("new")) {
			count = count + 2;
		}
		if(word.contains("delete")) {
			count = count + 2;
		}
		if(word.contains("throw")) {
			count = count + 2;
		}
		if(word.contains("throws")) {
			count = count + 2;
		}


		
		
		
		
		//Arithmetic operators
		if (word.contains("+")) {
			count++;
		}
		if(word.contains("-")) {
			count++;
		}
		if(word.contains("*")) {
			count++;
		}
		if(word.contains("/")) {
			count++;
		}
		if(word.contains("%")) {
			count++;
		}
		if(word.contains("++")) {
			count++;
		}
		if(word.contains("--")) {
			count++;
		}
		
		
		//Bitwise Operators
		if(word.contains("|")) {
			count++;
		}
		if(word.contains("^")) {
			count++;
		}
		if(word.contains("~")) {
			count++;
		}
		//if(word.contains(">>>")) {
			//count++;
		//}
	//	if(word.contains("<<<")) {
	//		count++;
	//	}
	//	if(word.contains("<<")) {
	//		count++;
	//	}
	//	if(word.contains(">>")) {
	//		count++;
	//	}
	//	if(word.contains("<<<")) {
	//		count++;
	//	}
		
		//Relation operators
		if(word.contains("==")) {
			count++;
		}
		if(word.contains("!=")) {
			count++;
		}
		if(word.contains("<")) {
			count++;
			if(word.contains("<<")) {
				count++;
				if(word.contains("<<<")) {
					count++;
					count = count-2;
				}
				else {
					count = count-1;
				}
			}
		}
		if(word.contains(">")) {
			count++;
			if(word.contains(">>")) {
				count++;
				if(word.contains(">>>")) {
					count++;
					count = count-2;
				}
				else {
					count = count -1;
				}
			}
		}
		if(word.contains("<=")) {
			count++;
		}
		if(word.contains(">=")) {
			count++;
		}
		
		
		//Logical operators
		if(word.contains("&&")) {
			count++;
		}
		if(word.contains("||")) {
			count++;
		}
		if(word.contains("!")) {
			count++;
		}
		
		

		
		//Miscellaneous operators
		if(word.contains("~")) {
			count++;
		}
		if(word.contains("->")) {
			count++;
		}
		if(word.contains(".")) {
			count++;
		}

		
		//Assignment operators
		if(word.contains("+=")) {
			count++;
		}
		if(word.contains("-=")) {
			count++;
		}
		if(word.contains("*=")) {
			count++;
		}
		if(word.contains("/=")) {
			count++;
		}		
		if(word.contains("=")) {
			count++;
		}
		if(word.contains(">>>=")) {
			count++;
		}
		if(word.contains("|=")) {
			count++;
		}
		if(word.contains("&=")) {
			count++;
		}
		if(word.contains("%=")) {
			count++;
		}
		if(word.contains("<<=")) {
			count++;
		}
		if(word.contains(">>=")) {
			count++;
		}
		if(word.contains("^=")) {
			count++;
		}
		
		//Key words
		if(word.contains("void")) {
			count++;
		}
		if(word.contains("double")) {
			count++;
		}
		if(word.contains("int")) {
			count++;
		}
		if(word.contains("float")) {
			count++;
		}		
		if(word.contains("String")) {
			count++;
		}
		if(word.contains("printf")) {
			count++;
		}
		if(word.contains("println")) {
			count++;
		}
		if(word.contains("cout")) {
			count++;
		}
		if(word.contains("cin")) {
			count++;
		}
		if(word.contains("if")) {
			count++;
		}
		if(word.contains("for")) {
			count++;
		}
		if(word.contains("while")) {
			count++;
		}
		if(word.contains("dowhile")) {
			count++;
		}
		if(word.contains("switch")) {
			count++;
		}
		if(word.contains("case")) {
			count++;
		}

		//Manipulators
		if(word.contains("endl")) {
			count++;
		}
		if(word.contains("\n")) {
			count++;
		}
		
		
		if(word.contains("switch")) {
			count++;
		}
		if(word.contains("case")) {
			count++;
		}
		if(word.contains("long")) {
			count++;
		}
		
		//Class
		if(word.contains("class")) {
			classValue = input.next().toString();
		}

		
		}
		
		System.out.println("Cs Value : "+count);
	}


}
