package javaapplication10;
import java.util.*;
public class JavaApplication10 {

    public static void main(String[] args) {
String[] palavras = {"feliz", "triste", "bravo", "chateado", "raivoso", "animada"};
String[] duplicar = new String[palavras.length];
int s = 0;
while (s<palavras.length){
    duplicar[s]=palavras[s];
    System.out.println(duplicar[s] + ", ");
    s++;
    
}
}}
