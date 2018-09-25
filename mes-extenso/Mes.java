import java.util.Scanner;
public class Mes {
    private final String meses[][] = {
        {"janeiro", "january"},
        {"fevereiro", "february"},
        {"março", "march"},
        {"abril", "april"},
        {"maio", "may"},
        {"junho", "june"},
        {"julho", "july"},
        {"agosto", "august"},
        {"Setembro", "september"},
        {"outubro", "october"},
        {"novembro", "november"},
        {"dezembro", "december"}
    };

    public String getmes() {
        int mes, idioma;
        
        Scanner ler = new Scanner(System.in);

        System.out.println("digite um número: ");
        mes = ler.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("inválido. o número tem que ser entre 1 e 12.");
            mes = ler.nextInt();
        }

        System.out.println("digite 1 para português, 2 para inglês.");
        idioma = ler.nextInt();
        while (idioma < 1 || idioma > 2) {
            System.out.println("inválido. o número tem que ser 1 ou 2.");
            idioma = ler.nextInt();
        }

        return meses[mes - 1][idioma - 1];
    }
}