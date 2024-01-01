import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        boolean k = true;
        if(str1.length() == str2.length()){
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    continue;
                }
                else{
                    k = false;
                    break;
                }
            }
            if(k){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
            
        }
        else{
            System.out.println(false);
        }
        
    }
}