import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x = new int[5];
        System.out.println("inter int array elements:");
        for (int i = 0; i < x.length; i++) {
            x[i] = in.nextInt();
        }
        int []y = new int[5];
        for (int i = 0; i < y.length; i++) {
            y[i] = x[i];
        }
        System.out.println("cloned array:");
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }
}
