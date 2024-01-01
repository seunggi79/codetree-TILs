import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        String iStr = sc.next();
        String tStr = sc.next();
        
        int cnt = 0;
        for(int i = 0; i<iStr.length(); i++){
            boolean k =true;
            
            for(int j =0; j<tStr.length(); i++){
                if(iStr.charAt(i+j) == tStr.charAt(j)){
                    continue;
                }
                k = false;
            }
            
            if(k){
                cnt+=1;
            }
            
        }
        System.out.println(cnt);
    }
}