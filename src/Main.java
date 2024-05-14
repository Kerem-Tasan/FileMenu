import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //üst klasör varsa mkdir kullanılır bkz:src
        File dosya=new File("src/main.txt");

        // eğer src altındaki main.txt dosyası yoksa oluşturacak ve true değer döndürecek
        //    System.out.println(dosya.createNewFile());
        System.out.println(dosya.mkdir());

//yolu olmasa bile üst klasör yazılınca üst klasörü oluşturur
       File dosya2 =new File("READMe/main.txt");

       // System.out.println(dosya2.mkdirs());

        // eğer src altındaki main.txt dosyası varsa silecek ve true değer döndürecek
        //System.out.println(  dosya.delete());






     //   File dosya=new File("main.txt");
      //      try {
//      if(dosya.createNewFile()){
//
//          System.out.println(dosya.getName()+" dosyası oluşturuldu");
//
//      }
//      else{
//          System.out.println(dosya.getName()+" dosyası zaten var!");
//
//      }
//      }catch (IOException E)
//      {
//          System.out.println(E.getMessage());
//      }
//



    }
}