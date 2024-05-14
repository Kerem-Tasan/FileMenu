import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args)  {



        String yazi="KEREM TAŞAN";

        try {
            // yazi stringini main.txt dosyamıza ekledik
            FileOutputStream output=new FileOutputStream("main.txt",true);

             byte[] yazibYTE=yazi.getBytes();

             output.write(yazibYTE);
             output.close();



        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}