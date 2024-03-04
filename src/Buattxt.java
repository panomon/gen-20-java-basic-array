import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buattxt {
    public static void main (String[] args) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("keluaran.txt"));
            writer.write("Menulis ke file");
            writer.write("\nHai");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
