import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        char a1 = sc.next().charAt(0);
        int a = sc.nextInt();
        char b1 = sc.next().charAt(0);
        int b = sc.nextInt();
        char c1 = sc.next().charAt(0);
        int c = sc.nextInt();

        int A = 0;
        
        if (a1 == 'Y' && a >= 37){
            A += 1;
        }

        if (b1 == 'Y' && b >= 37){
            A += 1;
        }
        if (c1 == 'Y' && c >= 37){
            A += 1;
        }
        
        if(A >= 2){
            System.out.println('E');
        }else{
            System.out.println('N');
        }
    }
}