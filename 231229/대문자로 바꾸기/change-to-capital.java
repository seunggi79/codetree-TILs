import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        
        
        for(int i =0; i<5; i++){
            for(int j =0; j<3; j++){
                char n = sc.next().charAt(0);
                System.out.print((char)(n-32)+" ");    
            }
            System.out.println();
            
        }

    }
}