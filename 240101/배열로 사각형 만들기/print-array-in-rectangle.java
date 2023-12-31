import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][100];
        
        for(int i =0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i == 0 || j == 0){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = arr[i][j-1]+ arr[i-1][j];

                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j =0; j<5; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}