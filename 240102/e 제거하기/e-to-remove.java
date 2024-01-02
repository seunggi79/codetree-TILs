import java.awt.print.Pageable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        char[] arr = str.toCharArray();
        boolean k = true;
        int idex = 0;
        for (int i=0; i<len; i++){
            if(arr[i] == 'e'){
                k =false;
                idex = i;
                break;
            }
        }
        System.out.println(str.substring(0, idex)+str.substring(idex+1));



    }
}