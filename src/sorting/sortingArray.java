package sorting;

public class sortingArray {
    public static void main(String[] args) {
        int[] arr = {56,85,34,12,98,45,90};
        for(int i = 0; i < arr.length-1; i++){
           for(int j = 0; j < arr.length-1; j++){
               if(arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
               }
           }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
