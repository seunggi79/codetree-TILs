import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        String[] str = new String[200];
        while(true){

            str[cnt] = sc.next();

            if(str[cnt].equals("0")){
                break;
            }
            cnt++;


        }
        System.out.println(cnt);
        for(int i=0; i<cnt; i++){
            if(i % 2 ==0){
                System.out.println(str[i]);
            }
        }

    }
}