import java.util.Scanner;

public class Main {

    public static int print(int n) {
        if(n % 2 == 0){
            if(n==2){
                return 2;
            }
        }else{
            if(n == 1){
                return 1;
            }
        }
        return print(n-2)+n;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        System.out.println(print(n));


    }

}