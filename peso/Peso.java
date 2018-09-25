import java.util.Scanner;
public class Peso {
   private char sexo;
    private double altura;
    private double peso;

    public void peso() {
        Scanner scString = new Scanner(System.in);
        Scanner scDouble = new Scanner(System.in);

        System.out.println("qual sua altura? (use vírgula ao invés de ponto)");
        this.altura = scDouble.nextDouble();

        System.out.println("qual seu sexo? f para mulher e m para homem.");
        String sexoIn = scString.nextLine();

        this.sexo = Character.toUpperCase(sexoIn.charAt(0));

        while (this.sexo != 'M' && this.sexo != 'F') {
            System.out.println("sexo inválido. f para mulher e m para homem.");
            sexoIn = scString.nextLine();

            this.sexo = Character.toUpperCase(sexoIn.charAt(0));
        }
        
        if (sexo == 'M') {
            this.peso = (72.7 * this.altura) - 58;
            System.out.println("seu peso ideal é " + this.peso);

        } else {
            this.peso = (62.1 * this.altura) - 44.7;
            System.out.println("seu peso ideal é " + this.peso);
        }
    }
}