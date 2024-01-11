import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(print(n,m));

    }
    public static int print(int a, int b)
    {

        int sum =0;

        for(int i = a; i<=b; i++){
            boolean k = true;
           for(int j =2; j<a; j++){

               if(i % j == 0){
                   k = false;
               }
           }
           if(k){
               sum += i;
           }
        }
        return sum;


    }


}