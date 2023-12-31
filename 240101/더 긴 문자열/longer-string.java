import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        if(str.length() == str2.length()){
            System.out.println("same");
        }
        else{
            if(str.length() > str2.length()){
                System.out.println(str +" "+str.length());
            }else
                System.out.println(str2+" "+str2.length());
        }


    }
}