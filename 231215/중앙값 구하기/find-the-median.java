import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = -100;
        int min = 100;
        
        if(max <= a){
            max = a;
        }
        if(max <= b){
            max = b;
        }
        if(max <= c){
            max = c;
        }
        if(min >= a){
            min = a;
        }
        if(min >= b){
            min = b;
        }
        if(min >= c){
            min = c;
        }
        
        if (a != max && a != min){
            System.out.println(a);
        }
        if (b != max && b != min){
            System.out.println(b);
        }
        if (c != max && c != min){
            System.out.println(c);
        }
    }
}