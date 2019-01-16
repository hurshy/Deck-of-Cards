package filereadandwrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileReadAndWrite 
{

    // This version is the lazy way to deal with errors.  The next version 
    // will involve try/catch blocks.  Here we just let the method throw them.
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        String filename = "WorldSeriesWinners.txt";
        ArrayList<String> teams = new ArrayList<String>();
        // Use the filename to build a FileReader object
        // File reader gets characters one at a time
        FileReader freader = new FileReader(filename);
        // Use the FileReader object to build a BufferedReader
        // The BufferedReadered saves all of the characters into 
        // a string
        BufferedReader inFile = new BufferedReader(freader);

        // Read in the data in the file and store it in an ArrayList
        String input = inFile.readLine();
        while (input != null)
        {
            teams.add(input);
            input = inFile.readLine();
            
        }
        // End of the data read block
      
        // Close the file.
        inFile.close();
        
        
        // We will use the PrintWriter to write the lines of data that we 
        //stored in the ArrayList
        PrintWriter output = new PrintWriter("output.txt");
        
        // This uses the enhanced for loop as outlined on page 345, section 7.7.2
        // in the text book.  You can use a regular for loop if you wish. The 
        // syntax for the regular loop is 
        // for(int count = 0; count < teams.size();count++)
        for(String line: teams)
        {
            output.println(line);
        }
        output.close();
    }
    
}
