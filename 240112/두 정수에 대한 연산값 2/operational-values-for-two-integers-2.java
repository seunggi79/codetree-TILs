import java.util.Scanner;

class IntWrapper{
    int value;

    public IntWrapper(int value){
        this.value=value;
    }
}

public class Main {
    public static void print(IntWrapper a, IntWrapper b){
        if(a.value < b.value){
            a.value += 10;
            b.value *= 2;
        }else{
            b.value += 10;
            a.value *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        IntWrapper a = new IntWrapper(n);
        IntWrapper b = new IntWrapper(m);
        print(a, b);
        n = a.value;
        m = b.value;
        System.out.println(n+" "+m);
    }

}