import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int n = sc.nextInt();
        char[] arr = str1.toCharArray();

        for(int i=0; i<2; i++){
            int k = sc.nextInt();
            if(k == 1){
                int l1 = sc.nextInt();
                int l2 = sc.nextInt();
                char temp = arr[l1-1];
                arr[l1-1] = arr[l2-1];
                arr[l2-1] = temp;
                System.out.println(String.valueOf(arr));
            }
            else{

                char c1 = sc.next().charAt(0);
                char c2 = sc.next().charAt(0);
                for(int j=0; j<str1.length(); j++){
                    if(arr[j] == c1){
                        arr[j] = c2;
                    }
                }
                System.out.println(String.valueOf(arr));
            }
        }
        
    }
}