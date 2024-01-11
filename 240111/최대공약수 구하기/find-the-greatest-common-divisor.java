import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        System.out.println(gcd(n, m));
    }
    public static int gcd(int p, int q)
    {
        if (q == 0)
            return p;
        return gcd(q, p%q);
    }
}