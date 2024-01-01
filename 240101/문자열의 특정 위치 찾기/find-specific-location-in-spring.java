import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        boolean k = true;
        String str1 = sc.next();
        char c = sc.next().charAt(0);
        
        for(int i =0; i<str1.length(); i++){
            if(str1.charAt(i) == c){
                System.out.println(i);
                k = false;
                break;
            }
            
        }
        if(k){
            System.out.println("No");
        }

    }
}