import java.util.Scanner;

public class Main {

    public static int print(int n) {
        if(n < 10)
            return n;
        return print(n/10) + n %10;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(print(n * m * k));

    }

}