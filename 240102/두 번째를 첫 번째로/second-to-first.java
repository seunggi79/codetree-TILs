import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char c1 = str1.charAt(1);
        char c2 = str1.charAt(0);
        char[] arr = str1.toCharArray();
        for(int i=0; i<str1.length(); i++){
            if(arr[i] == c1){
                arr[i] = c2;
            }
        }
        System.out.println(String.valueOf(arr));
    }
}