package CheckTextInsideDoubleQuotes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDoubleQuotes {

	public static void main(String[] args) throws Exception  {
		System.out.println("Enter the Location Of Your Class : ");
		Scanner s = new Scanner(System.in);
		String p = s.next();
		
		checkText(p);
		
	}

	public static int checkText(String path) throws Exception {
		
		File f = new File(path);
        Scanner input = new Scanner(f);

        int count = 0;
        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);
            
            Pattern p = Pattern.compile("\"([^\"]*)\"");
            Matcher m = p.matcher(word);
            while (m.find()) {
              System.out.println(m.group(1));
              count += 1;
            }
           
        }
        System.out.println(count);
		return count;
		
	}
}
