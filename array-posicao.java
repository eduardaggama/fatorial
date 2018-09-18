
package javaapplication10;
import java.util.*;
public class JavaApplication10 {

    public static void main(String[] args) {
int[] numeros = {1, 2, 3, 5, 8, 13, 21};
int numero = 5;

for (int n = 0; n < numeros.length; n++)
{if(numero == numeros[n])
    System.out.println(numero + " está na posição " + n);
}
}}
