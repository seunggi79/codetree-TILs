import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int start = 1;
        int end = n;
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                if(j%2 == 0){
                    System.out.print(start);
                }else System.out.print(end);
            }
            start += 1;
            end -=1;
            System.out.println();
        }
    }
}