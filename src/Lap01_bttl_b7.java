import java.util.Scanner;

public class Lap01_bttl_b7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b;
        a = input.nextFloat();
        b = input.nextFloat();
        float min=a;
        float max=b;
        if(b<a){
            min=b;
            max=a;
        }
        System.out.println(min);
        System.out.println(max);

    }
}
