
import java.util.Random;

public class Meses {
     private final String[] vetmeses = new String[]{"janeiro", "feveireiro", "março", "abril",
        "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

    public void mesAleatorio() {
        Random num = new Random();
        int mes = num.nextInt(12);

        System.out.println("valor: " + mes + ". é o mês: " + this.vetmeses[mes]);

    }
}
