import java.util.Scanner;

public class Main {

    public static void print(int[] a){
        for(int i =0; i<a.length; i++){
            if(a[i] % 2 ==0){
                a[i] = a[i]/2;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for(int i =0; i<n1;i++){
            arr[i] = sc.nextInt();
        }
        print(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}