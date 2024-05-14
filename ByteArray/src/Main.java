import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

 //ByteArrayInputStream güvenlik ile alakalı olan durumlarda genel olarak kullanılan bir yapı.
   byte[] dizi={12,60,51,57,59,16,5,51,59,21};
   // Aldığın ilk veri byte dizisi oluyor.
   // ikincisi (opsiyonel) başlıyacağı değer oluyor.
   // 3 ise uzunluğu belirtiyor.
        ByteArrayInputStream input=new ByteArrayInputStream(dizi,4,4);

        System.out.printf("Kullanılabilen byte sayısı:"+ input.available());

        // input.read(); bir değer alır bunu i ye atıyoruz while içerisinde eğer dosya sonuna kadar yazdırıyoruz döngü bitmeden yeni değer veriyoruz i .
        int i=input.read();
        while(i!=-1){
            System.out.print(i+" ");
            i=input.read();
        }
// Hata ihtimaline karşı try catch bloğuna almamızı istiyor java olur da kapanamazsa diye.
        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String data="Byte ile output işlemleri";

        ByteArrayOutputStream out=new ByteArrayOutputStream();
        byte[] dataBy=data.getBytes();

        try {
            out.write(dataBy);
            String newdata=out.toString();
            System.out.println("\n\nSonuç:"+ newdata);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}