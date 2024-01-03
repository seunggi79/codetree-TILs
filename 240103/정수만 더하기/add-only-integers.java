import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();
        int sum = 0;
        
        for(int i=0; i<str.length(); i++){
            if (arr[i] >= '0' && arr[i] <= '9' ) {
                sum += (int)arr[i];
            }
        }
        System.out.println(sum);

    }
}