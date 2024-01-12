import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(print(n1, n2, n3));
    }

    public static String print(int a, int b,int c){

            if(b>=3 && b<=5){
                if(c<=day(a, b)){
                    return "Spring";
                }else{
                    return "-1";
                }
            } else if (b>=6 && b<=8) {
                if(c<=day(a, b)){
                    return "Summer";
                }else{
                    return "-1";
                }

            } else if (b>=9 && b<=11){
                if(c<=day(a, b)){
                    return "Fall";
                }else{
                    return "-1";
                }

            } else if (b<=12 && b<=2){
                if(c<=day(a, b)){
                    return "Winter";
                }else{
                    return "-1";
                }
            }else{
                return "-1";
            }

    }
    public static int day(int a ,int b){
        if(b == 2){
            if(yoonYear(a)){
                return 29;
            }
            else{
                return 28;
            }
        }
        else if(b==1 ||b==3||b==5||b==7||b==8||b==10||b==12){
            return 31;
        } else if (b==4|| b==6||b==9||b==11) {
            return 30;
        }
        return -1;
    }
    public static boolean yoonYear(int n1){
        if(n1 % 4 == 0){
            if(n1 % 100 == 0){
                if(n1 % 400 == 0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }else{
            return false;
        }
    }

}