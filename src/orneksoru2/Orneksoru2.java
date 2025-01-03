
package orneksoru2;
import java.util.Scanner;

public class Orneksoru2 {

    public static void main(String[] args) {
     Scanner klavye =new Scanner (System.in);
      System.out.println("Sicil No Giriniz:");
       String Sicil_No=klavye.nextLine();
        System.out.println("Çalışma Saatini Giriniz:");
         int Calisma_Saati=klavye.nextInt();
          System.out.println("Saatlik Ücret Giriniz :");
           int Saatlik_Ucret=klavye.nextInt();
          double Maas,Pirim,Vergi,Net_Maas;
         Maas = Calisma_Saati*Saatlik_Ucret;
        Pirim=Maas*0.14;
       Vergi=Maas*0.15;
      Net_Maas=Maas-(Pirim+Vergi);
     System.out.println("Sicil No,Pirim,Vergi,Net_Maası:"+Sicil_No+","+Pirim+","+Vergi+
        ","+Net_Maas);
    }
    
}
