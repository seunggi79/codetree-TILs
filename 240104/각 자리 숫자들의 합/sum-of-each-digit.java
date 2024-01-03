import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        int cnt =0;
        String str = Integer.toString(n);
        for(int i=0; i< str.length(); i++){
            cnt+=str.charAt(i);
        }
        System.out.println(cnt);

    }
}