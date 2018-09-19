package mesa;
import java.util.Scanner;
public class Mesa {

    public static void main(String[] args){

    String input = "hello"; //can be anything
    int index = input.length()/2;
    String newWord = input.substring(index) + input.substring(0, index);
    System.out.println(newWord);
}
} 
