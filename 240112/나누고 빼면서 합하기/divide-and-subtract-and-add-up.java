import java.util.Scanner;

public class Main {

    public static int print(int m, int[] arr){

        int sum = 0;
        while(m >= 1){
            sum += arr[m-1];
            if(m % 2==0){
                m /=2;
            }else{
                m -= 1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(print(m, arr));



    }

}