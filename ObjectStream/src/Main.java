import java.io.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)  {

        Car c1=new Car("BMW","320");
     // oluşturulan nesnenin bilgilerini yazdırdık

        try{
            FileOutputStream fos=new FileOutputStream("araba.txt");
            ObjectOutputStream outputStream=new ObjectOutputStream(fos);

            outputStream.writeObject(c1);
            outputStream.close();

        }catch(Exception e){
            System.out.println(e.getMessage());

        }
        //Burada da car bir Car sınıfına ait veri oluşturduk ve o veri ile araba.txt içerisindeki nesnenin özelliklerini yazdırdık.
try{
    FileInputStream inputStream=new FileInputStream("araba.txt");
    ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
    Car c2=(Car)objectInputStream.readObject();
    System.out.print(c2.getBrand());
    System.out.print(c2.getModel());
}catch (Exception e){
    System.out.println(e.getMessage());
}


    }
}