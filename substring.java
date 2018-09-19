package mesa;
import java.util.Scanner;
public class Mesa {

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("qual seu nome?");
        String nome = ler.nextLine();
        int random = (int) (Math.random()*nome.length());
        String cidade = nome.substring(random, nome.length()) + nome.substring(0, random);
        System.out.println("a cidade fake que você mora é " + cidade);
        
// ***********************************************************************************8

        String s = "ElefantesSaoGrandes";
        String primeira = s.substring(0, 9);
        System.out.println("a primeira palavra é " + primeira);
        
        String ultima = s.substring(12);
        System.out.println("a última palavra é " + ultima);
             
    }

}
