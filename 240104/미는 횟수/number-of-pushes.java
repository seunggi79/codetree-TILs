import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();
        int cnt =0;
        while(true){
            str = str.substring(str.length()-1,str.length())+str.substring(0,str.length()-1);
            cnt++;
            if(str.equals(str2)){
                break;
            }
        }
        System.out.println(cnt);

    }
}