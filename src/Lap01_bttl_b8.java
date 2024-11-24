import java.util.Scanner;

public class Lap01_bttl_b8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, c;
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        float min = a;
        if(a > b){
            min = b;
            if(b > c){
                min = c;
            }
        }else{
            if (c < a){
                min = c;
            }
        }
        System.out.println("min:"+min);

        float max = 0;
        if (a < b){
            max = b;
            if (c > b){
                max = c;
            }
        }else{
            if (a > c){
                max = a;
            }
        }
        System.out.println("max:"+max);
    }
}
