import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class P3 {
    public static void main(String[] args) {
        try {
            // Character Stream Copy
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("destination.txt");
            int i;
            while ((i = fr.read()) != -1) {
                fw.write(i);
            }
            fr.close();
            fw.close();

            // Show copied content
            System.out.println("Content copied to destination.txt:");
            FileReader fr2 = new FileReader("destination.txt");
            while ((i = fr2.read()) != -1) {
                System.out.print((char) i);
            }
            fr2.close();
            System.out.println("\nCharacter stream copy successful!\n");

            // Byte Stream Copy
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("destination.txt");
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, length);
            }
            fis.close();
            fos.close();

            // Show copied content again
            System.out.println("Content copied to destination.txt (byte stream):");
            FileInputStream fis2 = new FileInputStream("destination.txt");
            while ((length = fis2.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, length));
            }
            fis2.close();
            System.out.println("\nByte stream copy successful!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
