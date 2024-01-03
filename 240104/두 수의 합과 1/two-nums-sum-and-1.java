import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int cnt =0;
        String str = Integer.toString(n+m);
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == '1'){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}