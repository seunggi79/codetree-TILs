import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int cnt = 1;
        int cnt2 = 0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                for(int j =0; j<n; j++){
                    System.out.print(cnt+" ");
                    cnt++;
                }
                cnt2 = cnt;

            }
            else{
                for(int j =n-1; j>=0; j--){
                    System.out.print(cnt2+j+" ");
                    cnt++;

                }

            }

            System.out.println();
        }
    }
}