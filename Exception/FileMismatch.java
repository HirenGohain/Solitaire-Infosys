import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileMismatch {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileReader re = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(re);
            String as = null; 
            while((as=br.readLine())!=null){
                System.out.println(as);
            }
        }
        catch(Exception e){
        System.out.println(e);
        }
        finally{
            System.out.println("hello");
            System.out.println(20/0);
            System.out.println("welcome");
        }
    }
    
}
