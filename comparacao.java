
package javaapplication10;
import java.util.*;
public class JavaApplication10 {

    public static void main(String[] args) {
Scanner ler  = new Scanner (System.in);
int idade;
        System.out.println("Quantos anos você tem?");
        idade = ler.nextInt();
        
        if(idade >= 11 && idade <= 18){
            System.out.println("Você é um adolescente."
                    + "");
        }else if(idade < 11){
            System.out.println("Você é uma criança.");}
        else{System.out.println("Você é adulto.");}
}
}
