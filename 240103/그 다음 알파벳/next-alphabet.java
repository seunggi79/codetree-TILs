import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        char c2 = (char)((int)c+1);
        if(c == 'z'){
            c2 = 'a';
        }
        System.out.println(c2);

        
    }
}