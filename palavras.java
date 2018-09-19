package mesa;
import java.util.Scanner;
public class Mesa {
public static void main(String[] args){
    Scanner ler = new Scanner (System.in);
    System.out.println("qual frase?");
     String frase = ler.nextLine();
int palavras = 1;
for(int i = 0; i<frase.length(); i++) {
    if(frase.substring(i, i+1).equals(" ")) {
        palavras++;
    }
}
System.out.println("o numero de palavras na frase '" + frase + "' é " + palavras);}}
