package array;

import java.util.Scanner;

public class arrSumInEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i< n; i++) {
            System.out.print("Enter " + (i + 1) + " Element: ");
            arr[i] = sc.nextInt();
        }

        // Multiply odd indexed elements by 2 and add 10 to even indexed element

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
               arr[i] += 10 ;
            }else{
                arr[i] *= 2;
            }
        }
        System.out.println("Total = ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
