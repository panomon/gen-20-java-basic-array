import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bacatxt {
    public static void main (String[] args) throws IOException{
        try {
            BufferedReader reader = new BufferedReader(new FileReader("c:/Users/Lenovo/git_pan/gen-20-java-basic-array/Hallo.txt"));
            String line;
            while( (line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
