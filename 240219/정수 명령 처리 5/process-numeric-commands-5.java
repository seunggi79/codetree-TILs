import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> v = new ArrayList<>();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String str = sc.next();

            if(str.equals("push_back")){
                int a = sc.nextInt();
                v.add(a);
            }
            else if(str.equals("pop_back")){
                v.remove(v.size() - 1);
            }
            else if(str.equals("size")){
                System.out.println(v.size());
            }
            else if(str.equals("get")){
                int b = sc.nextInt();
                System.out.println(v.get(b-1));
            }
        }
    }
}