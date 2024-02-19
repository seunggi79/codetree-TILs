import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String str = sc.next();

            if(str.equals("push_front")){
                int a = sc.nextInt();
                l.addFirst(a);
            }
            else if(str.equals("push_back")){
                int b = sc.nextInt();
                l.addLast(b);
            }
            else if(str.equals("pop_front")){
                System.out.println(l.pollFirst());
            }
            else if(str.equals("pop_back")){

                System.out.println(l.pollLast());
            }
            else if(str.equals("size")){
                System.out.println(l.size());
            }
            else if(str.equals("empty")){
                if(l.isEmpty()){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            }
            else if(str.equals("front")){
                System.out.println(l.peekFirst());
            }
            else if(str.equals("back")){
                System.out.println(l.peekLast());
            }
        }
    }
}