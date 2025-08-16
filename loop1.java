import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter " + (i+1) + " Element : " );
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
        }
        System.out.println("Total sum = "+sum);
    }
}
