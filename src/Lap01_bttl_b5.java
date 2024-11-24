import java.util.Scanner;

public class Lap01_bttl_b5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Mời nhập vào số n: ");
        n = input.nextInt();
        System.out.println("Mời nhập vào số m: ");
        m = input.nextInt();

        int sum = n + m;
        System.out.println("sum = " + sum);
    }
}
