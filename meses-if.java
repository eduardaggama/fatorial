
package javaapplication10;
import java.util.*;
public class JavaApplication10 {

    public static void main(String[] args) {

    String month = "Jan";

        if(month == "Jan" || month == "Mar" || month == "Mai" || month == "Jul" || month == "Ago" || month == "Out" || month == "Dez"){
            System.out.println("31 dias.");
        }
        
        else if(month == "Abr" || month == "Jun" || month == "Set"|| month == "Nov"){
            System.out.println("30 dias.");
        }    
    
    else if(month == "Fev"){
        System.out.println("28 dias. 29 em ano bissexto.");
        }
}}
