import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();
        int aInt = Integer.parseInt(str+str2);
        int bInt = Integer.parseInt(str2+str);
        System.out.println(aInt+bInt);
        

    }
}