
package javaapplication10;
import java.util.*;
public class JavaApplication10 {

    public static void main(String[] args) {
double[] decimals = {3.4, 2.8, 90.3, 178.6, 1.6, 274.5};
        double max = Double.MIN_VALUE; //0
        double min = Double.MAX_VALUE;
        for(int d =0; d< decimals.length; d++) {
            if(max < decimals[d]) {
                max = decimals[d]; //upgrading
            }
            if(min>decimals[d]) {
                min = decimals[d]; //downgrading
            }
        }
        System.out.println("The max in array decimals is " + max);
        System.out.println("The min in array decimals is " + min);
}
}
