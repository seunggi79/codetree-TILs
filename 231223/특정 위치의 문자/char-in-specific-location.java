import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        char[] arr = new char[6];
        arr[0] = 'L';
        arr[1] = 'E';
        arr[2] = 'B';
        arr[3] = 'R';
        arr[4] = 'O';
        arr[5] = 'S';
        int answer = 0;
        for(int i =0; i<=5; i++){
            if(arr[i] == n){
                answer = i;
                break;
            }
        }
        if (answer ==0){
            System.out.println("None");
        }else{
            System.out.println(answer);
        }

    }
}