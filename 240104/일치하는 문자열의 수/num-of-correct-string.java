import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =0;
        String str = sc.next();
        for(int i=0; i<n; i++){
            String str2 = sc.next();
            if(str.compareTo(str2) == 0){
                cnt++;
            }
            
        }
        System.out.println(cnt);
        

    }
}