
package javaapplication10;
import java.util.*;
public class JavaApplication10 {

    public static void main(String[] args) {
String power;
Scanner ler = new Scanner(System.in);

        System.out.println("A luz está ligada ou desligada? L / D");
        power = ler.nextLine();
        
        switch(power){
        case("L"): System.out.println("Desligando então.");
        break;
        case("D"): System.out.println("Ligando então.");
        }
        
    }
}
