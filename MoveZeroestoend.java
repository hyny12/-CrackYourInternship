import java.util.*;
public class Solution{
    public static void moveZeroes(int arr[]){
         int nonZero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[nonZero];
                arr[nonZero]=temp;
                nonZero++;
            }
        }
    }

public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       moveZeroes(arr);
       for (int i : arr) {
            System.out.print(i + " ");
        }

    }
    
}
