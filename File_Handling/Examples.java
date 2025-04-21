package File_Handling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Read/write primitive values
public class Examples {
    // WRITE
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("settings.bin"))) {
            dout.writeInt(40);
            dout.writeDouble(3.14159);
            dout.writeUTF("Aditya");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // READ
        try (DataInputStream din = new DataInputStream(new FileInputStream("settings.bin"))) {
            int n = din.readInt();
            double pi = din.readDouble();
            String msg = din.readUTF();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
