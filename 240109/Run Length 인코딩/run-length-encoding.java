import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int len = A.length();
        char c = A.charAt(0);
        int cnt = 0;
        for(int i =0; i<len; i++){
            if (A.charAt(i) == c){
                cnt++;
            }else{
                System.out.print(c);
                c = A.charAt(i);
                System.out.print(cnt);
                cnt =1;
            }
        }
        System.out.print(c);
        System.out.print(cnt);



    }
}