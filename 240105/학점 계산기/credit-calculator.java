import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        System.out.printf("%.1f",sum/n);
        System.out.println();
        if(sum/n >=4.0){
            System.out.print("Perfect");
        } else if (sum/n >= 3.0) {
            System.out.println("Good");
        }
        else{
            System.out.println("Poor");
        }
    }
}