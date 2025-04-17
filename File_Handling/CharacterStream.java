package File_Handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("file.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.println((char) data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
