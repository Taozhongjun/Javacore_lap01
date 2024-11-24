import java.util.Scanner;

public class Lap01_bttl_b6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, m1;
        float n2, m2;
        System.out.println("Mời nhập vào số n1: ");
        n1 = input.nextInt();
        System.out.println("Mời nhập vào số m1: ");
        m1 = input.nextInt();
        System.out.println("Mời nhập vào số n2: ");
        n2 = input.nextFloat();
        System.out.println("Mời nhập vào số m2: ");
        m2 = input.nextFloat();

        // In
        System.out.println("n1 + m1 = " +(n1 + m1));
        System.out.println("n2 + m2 = " +(n2 + m2));
        System.out.println("n1 + n2 = "+((float)n1 + n2));
    }
}
