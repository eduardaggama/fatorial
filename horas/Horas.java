import java.util.Scanner;
public class Horas {
   
    public String Horas() {
        int seg, hrs, min, segs;
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um valor em segundos.");
        seg = sc.nextInt();

        hrs = seg / 3600;
        min = (seg % 3600) / 60;
        segs = (seg % 3600) % 60;
        
        return String.format(seg + " segundos equivalem a %02d horas, %02d minutos e %02d segundos.", hrs, min, segs);
    }
}
