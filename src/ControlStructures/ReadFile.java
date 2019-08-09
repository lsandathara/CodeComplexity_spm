package ControlStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
	public String readfile() {
		
			
		StringBuilder sb = new StringBuilder();
        String line = "";
        String allLines = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("C:/SLIIT/year 3 sem 2/spm/test/testDoc.txt"));
             while (line != null)
             {
                if (line == null)
                  break;
                allLines += line;
                line = br.readLine();
                
            }
              //System.out.println(str_data);
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
		return allLines;
	}
	

	  
}
