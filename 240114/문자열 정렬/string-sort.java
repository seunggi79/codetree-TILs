import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String str2 = String.valueOf(arr);
        System.out.println(str2);

    }

}