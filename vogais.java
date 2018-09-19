package mesa;
import java.util.Scanner;
public class Mesa {
public static void main(String[] args){
     Scanner ler = new Scanner (System.in);
     System.out.println("qual palavra?");
    String palavra = ler.nextLine();
    
int vogais = 0;
for (int i = 0; i < palavra.length(); i++) {
    if (palavra.substring(i, i + 1).equals("a") 
     || palavra.substring(i, i + 1).equals("e")
     || palavra.substring(i, i + 1).equals("i") 
     || palavra.substring(i, i + 1).equals("o")
     || palavra.substring(i, i + 1).equals("u")) {
        vogais++;
    }
}
System.out.println("The number of vowels in " + palavra + " is " + vogais);}}
