import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);

    }
    public static void print(int a)
    {
        int sum =0;
        for(int i =1; i<=100; i++){
            sum += i;
        }

        System.out.println(sum/10);
    }
}