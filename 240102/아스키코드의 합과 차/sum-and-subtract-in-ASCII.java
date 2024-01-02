import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        System.out.print((int)c+(int)c2+" ");
        if((int)c - (int)c2 > 0){
            System.out.print((int)c - (int)c2);
        }
        else{
            System.out.print((int)c2 - (int)c);
        }

    }
}