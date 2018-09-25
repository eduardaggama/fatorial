import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Nascimento {

    private String nome, cidade;
    private LocalDate nasc;

    public Nascimento(String nome, String cidade, LocalDate nasc) {
        this.nome = nome;
        this.cidade = cidade;
        this.nasc = nasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setDataNascimento(LocalDate nasc) {
        this.nasc = nasc;
    }

    public LocalDate getDataNascimento() {
        return this.nasc;
    }

    public int idade() {
        LocalDate now = LocalDate.now();
        return Period.between(now, nasc).getYears();
    }

    public void imprimir() {
        System.out.println("nome: " + this.nome);
        System.out.println("nascimento: " + this.nasc.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("cidade: " + this.cidade);
        System.out.println("idade: " + idade());
    }
}