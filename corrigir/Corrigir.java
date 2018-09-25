import java.util.Scanner;
public class Corrigir {
    
    private final String alunos[] = new String[12];
    private final Double notas[] = new Double[12];
    private final char[] vetgab = new char[8];
    private final char[] vetresp = new char[8];
    private int aprovados;
    
    Scanner ler = new Scanner(System.in);

    public void lergab() {
        String temp;

        for (int i = 0; i < 8; i++) {
            System.out.println("resposta da pergunta " + (i + 1) + "º:");
            temp = ler.nextLine();
            this.vetgab[i] = temp.charAt(0);
        }}

    public void corrigir() {
        double pontuacao;
        String temp;
        for (int i = 0; i < 12; i++) {
            pontuacao = 0;
            System.out.println("RA:");
            alunos[i] = ler.nextLine();

            for (int j = 0; j < 8; j++) {
                System.out.println("resposta da pergunta " + (j + 1) + " º: ");
                temp = ler.nextLine();
                vetresp[j] = temp.charAt(0);

                if (vetresp[j] == vetgab[j]) {
                    pontuacao += 1.25;
                }}

            notas[i] = pontuacao;
            if (pontuacao >= 5) {
                aprovados++;
            }}}

    public void notas() {
        for (int i = 0; i < 12; i++) {
            System.out.println();
            System.out.println("RA: " + alunos[i]);
            System.out.println("nota:" + notas[i]);
        }
        System.out.println("taxa de aprovação:" + ((aprovados * 100) / 12) + "%");
    }}
