package javaapplication7;

import java.util.Scanner;
public class JavaApplication7 {
      
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         
         int valor;
         double dolar, alemao, libra;
         double dd, aa, ll;
         
         dolar = 1.80;
         alemao = 2;
         libra = 3.57;
        
        System.out.printf("Informe o valor: ");
        valor = ler.nextInt();
        
       dd = dolar * valor;
       aa = alemao * valor;
       ll = libra * valor;
       
        System.out.println("Em dólar fica " + dd);
        System.out.println("Em marco alemão fica " + aa);
        System.out.println("Em libra esterlina fica " + ll);

    }
    
}
