import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i =0; i<q; i++){
            int m = sc.nextInt();
            if(m == 1){
                int k =sc.nextInt();
                System.out.println(arr[k-1]);
            } else if (m == 2) {
                int k = sc.nextInt();
                boolean swich = true;
                for(int j = 0; j<n; j++){
                   if (arr[j] == k){
                       swich = false;
                       System.out.println(j+1);
                       break;
                    }
                }
                if(swich){
                    System.out.println(0);
                }

            } else if (m == 3) {
                int k = sc.nextInt();
                int l = sc.nextInt();
                for(int j = k; j<=l; j++){
                    System.out.print(arr[j-1]+" ");
                }
                System.out.println();
            }
        }


    }
}