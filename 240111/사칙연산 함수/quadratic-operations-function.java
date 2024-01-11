import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char m = sc.next().charAt(0);
        int k = sc.nextInt();
        int answer = print(n,m,k);
        if(answer == 10001){
            System.out.println("False");
        }else{
            System.out.println(n+" "+m+" "+k+" = "+answer);

        }



    }
    public static int print(int a, char b, int c) {
        if(b == '+'){
            return a+c;
        }
        if(b == '-'){
            return a-c;
        }
        if(b == '/'){
            return a/c;
        }
        if(b == '*'){
            return a*c;
        }
        return 10001;
    }

}