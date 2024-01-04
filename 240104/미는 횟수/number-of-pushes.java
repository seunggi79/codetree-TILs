import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();
        if(str.length() != str2.length()){
            System.out.println(-1);
            System.exit(0);
        }

        String a = str;
        String[] b = new String[str.length()];
        int cnt =0;
        while(true){
            b[cnt] = str;
            str = str.substring(str.length()-1,str.length())+str.substring(0,str.length()-1);
            cnt++;

            if(str.equals(a)){
                break;
            }
        }
        for(int i=0;i<cnt; i++){
            if(b[i].equals(str2)){
                System.out.println(i);
            }
        }

    }
}