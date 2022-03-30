import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.UnsupportedAddressTypeException;


public class FileHandling {
    public static void main(String[] args) throws IOException {
        File on = new File("Sdc.txt");
        System.out.println("File created");
        InputStream st = new InputStream() {
            @Override
            public int read() throws IOException{
                throw new UnsupportedOperationException("Not supported yet");
            }
        };       
    }

}
