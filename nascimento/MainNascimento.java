import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainNascimento {

    public static void main(String[] args) {
        String dt, nome, cidade;
        Scanner ler = new Scanner(System.in);

        LocalDate data;

        System.out.println("nome: ");
        nome = ler.nextLine();

        System.out.println(" cidade: ");
        cidade = ler.nextLine();

        System.out.println("nascimento (dd/mm/aaaa): ");
        dt = ler.nextLine();

        DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        data = LocalDate.parse(dt, dtm);

        Nascimento objNascimento = new Nascimento(nome, cidade, data);
        objNascimento.imprimir();
    }
}