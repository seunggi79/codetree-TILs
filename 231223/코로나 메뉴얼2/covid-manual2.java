import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i =0; i<3; i++){
            char a = sc.next().charAt(0);
            int n = sc.nextInt();

            if(n >= 37 && a == 'Y'){
                arr[0] += 1;
            } else if (n >= 37 && a == 'N') {
                arr[1] +=1;
            } else if (n < 37 && a=='Y') {
                arr[2] += 1;
            } else {
                arr[3] += 1;
            }

        }
        for(int i = 0; i<=3; i++){
            System.out.print(arr[i]+" ");
        }
        if(arr[0] >= 2){
            System.out.print('E');
        }



    }
}