import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class lineReader {
    private String filepath = "";
    private ArrayList<String> output = new ArrayList<String>();
    
    public lineReader (String fp) {
        filepath = fp;
    }
    
    public void readAll () throws IOException {
        File file = new File(filepath);
        try {
            BufferedReader rd = new BufferedReader(new FileReader(file));
            String line;
            while ((line = rd.readLine()) != null) {
                output.add(line);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void readSeparated () throws IOException {
        try {
            File file = new File(filepath);
            BufferedReader rd = new BufferedReader(new FileReader(file));
            Integer cur = -1;
            String cur_s = "";
            while ((cur = rd.read()) != -1) {
                cur_s = cur_s + Character.toString( cur);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
