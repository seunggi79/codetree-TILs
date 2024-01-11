import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);

    }
    public static void print(int a)
    {

        if(a % 2== 0 && ((a/10) + (a%10))%5==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}