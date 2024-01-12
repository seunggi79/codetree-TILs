import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(print(n1, n2));
    }

    public static String print(int a, int b){

        if(a == 2){
            if(b<=28){
                return "Yes";
            }
            else{
                return "No";
            }
        }
        else if(a < 8 && a % 2 != 0){
            if(b<=31){
                return "Yes";
            }else{
                return "No";
            }

        }
        else if (a < 8 && a % 2 ==0){
            if (b<=30){
                return "Yes";
            }
            else{
                return "No";
            }

        }
        else if (a<13 && a >= 8 && a % 2 ==0){
            if (b<=31){
                return "Yes";
            }
            else{
                return "No";
            }

        }
        else if (a<13 && a >= 8 && a % 2 !=0){
            if (b<=30){
                return "Yes";
            }
            else{
                return "No";
            }

        }
        else{
            return "No";
        }
    }

}