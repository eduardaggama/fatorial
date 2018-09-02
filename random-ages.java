package javaapplication10;
import java.util.*;
public class JavaApplication10 {

    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner ler = new Scanner (System.in);
        int idade;

        double media;
        int pessoas;
        
        
        System.out.println("Qual sua idade?");
        idade = ler.nextInt();
        
          for (int i = 0; i < 15; i++) {
          System.out.println(gerador.nextInt(100));
         }
          
     
          
        System.out.println("A média da idade das pessoas que responderam é: " + ((idade * 15) / 15));
        
        
    }
    
}
