import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char c = a.charAt(0);
        double b = sc.nextDouble();
        double d = sc.nextDouble();

        System.out.println(c);
        System.out.printf("%.2f", b);
        System.out.println();
        System.out.printf("%.2f", d);
        
    }
}