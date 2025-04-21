package File_Handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    // copy file using FileInputStream / FileOutputStream
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("photo.jpg");
                FileOutputStream out = new FileOutputStream("photo_copy.jpg")) {

            byte[] buffer = new byte[8 * 1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
