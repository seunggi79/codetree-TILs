import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        int m = sc.nextInt();
        
        for (int i = 1; i<=n; i++){
            if(i % 2 != 0){
                if((i < 10&& i != 5) || (i < 100 && i%10 != 5) || (i>=100&& i%100 != 5)){
                    if(i % 3 == 0 && i % 9 == 0){
                        System.out.print(i+ " ");
                    }
                }else {
                    continue;
                }
            }
            else{
                continue;
            }
        }

        
    }
}