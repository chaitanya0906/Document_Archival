import java.io.*;
import java.util.zip.*;

public class ZippingFileExample {

    public static void main(String[] args) throws Exception {

        // input file 
        FileInputStream in = new FileInputStream("data.txt");

        // out put file 
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream("tmp.zip"));

        // name the file inside the zip  file 
        out.putNextEntry(new ZipEntry("zippedjava.txt")); 

        // buffer size
        byte[] b = new byte[1024];
        int count;

        while ((count = in.read(b)) > 0) {
            out.write(b, 0, count);
        }
        out.close();
        in.close();
    }
}
