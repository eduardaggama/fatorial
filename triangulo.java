
package javaapplication10;
import java.util.*;
public class JavaApplication10 {

    public static void main(String[] args) {
System.out.println("***** for loop for # 2 *******");
        int height = 5;
        int count = 1;
        for (int h = 1; h < height + 1; h++) {
            for (int spot = 0; spot < h; spot++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println("***** while loop for # 2 *******");
        int h = 1;
        while (h<=height) {
            int spot = 0;
            while (spot < h) {
                System.out.print(count + " ");
                count++;
                spot ++;
            }
            h++;
            System.out.println();
        }}}
