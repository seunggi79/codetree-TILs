import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();
        char[] arr = str.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        boolean k =true;
        for(int i=0; i<str.length(); i++){
            if(arr[i] != arr2[i]){
                k = false;
            }
        }
        
        if(str.length() != str2.length()){
            System.out.println("No");
        }
        else if(k){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}