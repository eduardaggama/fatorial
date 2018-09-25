import java.util.Scanner;
public class Resistencia {
    
    private final double[] resist = new double[10];
    private double equiv, maior, menor;

    public void setresistencias() {
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "º resistencia:");
            this.resist[i] = ler.nextDouble();
        }
    }

    public double[] getresistencias() {
        return this.resist;
    }

    public void somaresistencia(double[] vetresist) {
        for (int i = 0; i < vetresist.length; i++) {
            this.equiv += vetresist[i];
        
        if (vetresist[i] > maior) {
                this.maior = vetresist[i];
            } else if (vetresist[i] < menor) {
                this.menor = vetresist[i];
            }
            if (i == 0) {
                this.maior = vetresist[i];
                this.menor = vetresist[i];
            }
        }

        System.out.println("maior: " + this.maior);
        System.out.println("menor: " + this.menor);
        System.out.println("equivalente: " + this.equiv);
    }
}

