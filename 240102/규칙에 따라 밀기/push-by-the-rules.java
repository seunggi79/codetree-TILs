import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len =str.length();
        String str2 = sc.next();
        char[] arr = str2.toCharArray();
        char temp = ' ';
        for(int i=0; i<str2.length();i++){
            if(arr[i] == 'L'){
                str = str.substring(1, len)+str.substring(0,1);
                
            } else if (arr[i] == 'R') {
                str = str.substring(len-1)+str.substring(0,len-1);
                
            }
        }
        System.out.println(str);


    }
}