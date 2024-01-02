import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        for(int i =len; i>0; i--){
            str = str.substring(i)+str.substring(0,i);
            System.out.println(str);
        }

    }
}