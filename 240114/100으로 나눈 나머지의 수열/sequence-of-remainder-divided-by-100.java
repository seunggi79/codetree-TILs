import java.util.Scanner;

public class Main {

    public static int print(int n) {
        if (n == 0){
            return 0;
        }
        else if(n == 1){
            return 2;
        } else if (n == 2) {
            return 4;
        }

        return (print(n-1) * print(n-2)) % 100;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        System.out.println(print(n));

    }

}