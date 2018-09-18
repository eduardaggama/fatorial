
package javaapplication10;
import java.util.*;
public class JavaApplication10 {

    public static void main(String[] args) {
Scanner ler = new Scanner (System.in);

int input;
int oddNum = 1;
int soma = 0;

        System.out.println("Eu sou um programa que mostra números ímpares. Quantos termos você quer?");
        input = ler.nextInt();
        
for (int i = 0; i < input; i++){
    System.out.println(oddNum);
            soma += oddNum;
oddNum += 2;
}
        System.out.println("Você pediu " + input + " valores e a soma deles é " + soma);
}    
}
