import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 1;

        int n = sc.nextInt();
        while(true){
            if (n%2 == 0){
                n *= 3;
                n+=1;
                
            }
            else{
                n*=2;
                n+=2;
            }
            cnt +=1;
            if(n>= 1000){
                break;
            }
            
            
        }
        System.out.println(cnt);
    }
}