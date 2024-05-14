import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {


        try {
            FileInputStream input=new FileInputStream("main.txt");
            System.out.println(input.available());
            input.skip(1);// metodu girilen değer kadar karakter atlar
       int i =input.read();
            while (i!=-1) {
                System.out.print((char)i);
               i= input.read();
            }
// input.available(); içerideki byte sayısını söyler







        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    }
