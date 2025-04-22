package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Read/write primitive values
public class Examples {
    // WRITE
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new
        FileOutputStream("settings.bin"))) {
        dout.writeInt(40);
        dout.writeDouble(3.14159);
        dout.writeUTF("Aditya");
        } catch (IOException e) {
        System.out.println(e.getMessage());
        }
        // READ
        try (DataInputStream din = new DataInputStream(new
        FileInputStream("settings.bin"))) {
        int n = din.readInt();
        double pi = din.readDouble();
        String msg = din.readUTF();
        } catch (IOException e) {
        System.out.println(e.getMessage());
        }

        // Example
        // Read a whole text file line-by-line
        Path path = Paths.get("notes.txt");
        try (BufferedReader br = Files.newBufferedReader(path)) {
        String line;
        while ((line = br.readLine()) != null) {
        System.out.println(line);
        }
        } catch (IOException e) {
        System.out.println(e.getMessage());
        }

        // Example
        StringWriter sw = new StringWriter();

        try (BufferedWriter bw = new BufferedWriter(sw)) {
            bw.write("Hello, ");
            bw.write("world!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String result = sw.toString();
        System.out.println(result);
    }
}
