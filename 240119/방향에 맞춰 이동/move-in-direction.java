import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        
        for(int i =0; i<n; i++){
            char c = sc.next().charAt(0);
            int distance = sc.nextInt();
            
            if(c == 'N'){
                y += distance;
            } else if (c == 'E') {
                x += distance;
            } else if (c == 'S') {
                y -= distance;
            }else{
                x -= distance;
            }
        }

        System.out.println(x+" "+y);
    }

}