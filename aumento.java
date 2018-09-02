package javaapplication9;
import java.util.*;
public class JavaApplication9 {


    public static void main(String[] args) {

        Scanner ler = new Scanner (System.in);
        double salario;

        System.out.println("Quanto você recebe?");
        salario = ler.nextDouble();
        
        if(301 > salario)
        {System.out.println("Novo salário de " + ((salario / 100) * 150));
        }
        if(salario > 300 && salario < 500)
        {System.out.println("Novo salário de " + ((salario / 100) * 140));
        
    }
        
        if(salario > 500 && salario < 700)
        {System.out.println("Novo salário de " + ((salario / 100) * 130));
}
    if (salario > 700)
    {System.out.println("Novo salário de " + ((salario / 100) * 120));
            
            }
    
    }}
