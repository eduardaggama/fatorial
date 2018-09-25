import java.util.Scanner;
public class IsLetra {
    
    public boolean IsLetra() {
        int letra;
        char caracter;
        Scanner ler = new Scanner(System.in);

        System.out.println("digite um caracter:");
        caracter = ler.nextLine().charAt(0);
        letra = caracter;

        return (letra > 64 && letra < 91) || (letra > 96 && letra < 123);
    }
}
