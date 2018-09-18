
package javaapplication10;
import java.util.*;
public class JavaApplication10 {

    public static void main(String[] args) {
    String month;
    Scanner ler = new Scanner(System.in);

        System.out.println("Me diga um mês. (Jan / Fev / Mar / Abr / Mai / Jun / Jul / Ago / Set / Out / Nov / Dez.)");
        month = ler.nextLine();
        
        switch(month){
        case("Jan"): System.out.println("31 dias.");
        break;
        case("Fev"): System.out.println("28 dias. 29 em ano bissexto.");
        break;
        case("Mar"): System.out.println("31 dias.");
        break;
        case("Abr"): System.out.println("30 dias.");
        break;
        case("Mai"): System.out.println("31 dias.");
        break;
        case("Jun"): System.out.println("30 dias.");
        break;
        case("Jul"): System.out.println("31 dias.");
        break;
          case("Ago"): System.out.println("31 dias.");
        break;
          case("Set"): System.out.println("30 dias.");
        break;
          case("Out"): System.out.println("31 dias.");
        break;
          case("Nov"): System.out.println("30 dias.");
        break;
          case("Dez"): System.out.println("31 dias.");
        break;
        
        
        }
        
    }
}
