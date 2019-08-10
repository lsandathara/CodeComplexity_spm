package inheritance;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CheckComplexityOfInheritance {

	static String p = null;
	
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Location Of Your Class : ");
		Scanner s = new Scanner(System.in);
		p = s.next();
//		 p = "C:\\Users\\HP\\eclipse-workspace\\inheritancePro\\src\\inheritancePro\\CustomerDTO.java";

	        int superClass = 0;

	        while (p != null) {
	            File f = new File(p);
	            Scanner input = new Scanner(f);

	            int count = 0;
	            while (input.hasNext()) {
	                String word = input.next();
	                System.out.println(word);

	                if (word.equals("extends")) {
	                    superClass += 1;

	                    while (input.hasNext()) {
	                        String lWord = input.next();

	                        System.out.println(lWord);
	                        String[] className = lWord.split("[{]");

	                        System.out.println(className[0]);
	                        Path path = Paths.get(f.getAbsolutePath(), args);
	                        String directory = path.getParent().toString();

	                        System.out.println(directory);
	                        p = directory + "\\" + className[0] + ".java";
	                        System.out.println(p);

	                        break;

	                    }

	                    break;
	                }else {
	                    p = null;
	                }

	            }

	        }
	        System.out.println(superClass);
	        int com = superClass+1;
	        System.out.println("Complexity: "+com);
	    }
	

}
