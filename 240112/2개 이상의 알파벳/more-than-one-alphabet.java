import java.util.Scanner;

public class Main {
    
    public static int print(String str){
        int cnt =0;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) != str.charAt(i+1)){
                cnt++;
            }
            
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(2<=print(str)){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }

}