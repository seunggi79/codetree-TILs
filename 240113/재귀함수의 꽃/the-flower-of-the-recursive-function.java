import java.util.Scanner;

public class Main {

    public static void print(int n) {

        if(n == 0)
            return;
        System.out.print(n+" ");
        print(n-1);




    }
    public static void print2(int n) {

        if(n == 0)
            return;

        print2(n-1);
        System.out.print(n+" ");



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        print(n);
        print2(n);




    }

}