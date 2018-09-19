package javaapplication15;
import java.util.*;
public class JavaApplication15 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("coloque a senha:");
String senha = s.nextLine();
boolean senhavalida = true;
if (senha.length() < 10) {
    senhavalida = false;
}
boolean allLowercase = senha.equals(senha.toLowerCase());

if (allLowercase) { 
    senhavalida = false;
}
int digitos = 0;
for (int i = 0; i < senha.length(); i++) {
    if (senha.substring(i, i + 1).equals("1") 
            || senha.substring(i, i + 1).equals("2")
            || senha.substring(i, i + 1).equals("3") 
            || senha.substring(i, i + 1).equals("4")
            || senha.substring(i, i + 1).equals("5") 
            || senha.substring(i, i + 1).equals("6")
            || senha.substring(i, i + 1).equals("7") 
            || senha.substring(i, i + 1).equals("8")
            || senha.substring(i, i + 1).equals("9") 
            || senha.substring(i, i + 1).equals("0")
    ) {
        digitos++;
    }
}
if (digitos < 2) {
    senhavalida = false;
}
if (senhavalida) {
    System.out.println("senha válida");
} else {
    System.out.println("senha inválida");
}
        }
    }
