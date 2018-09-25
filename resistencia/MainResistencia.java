
public class MainResistencia {
     public static void main(String[] args) {
        Resistencia objresistencia = new Resistencia();

        objresistencia.setresistencias();
        double[] resistencias = objresistencia.getresistencias();
        objresistencia.somaresistencia(resistencias);
    }
}
