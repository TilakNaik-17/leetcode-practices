import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class solution1{
    public int[] twoSum(int arr[],int target){
        HashMap <Integer,Integer> list =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int need=target-arr[i];

            if(list.containsKey(need)){
                return new int[]{list.get(need),i}; 

            }
            list.put(arr[i], i);
        }
        return new int[]{} ;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total arr element");
        n=sc.nextInt();
        System.out.println("enter the arr element");
           int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int target=sc.nextInt();
        solution1 sn=new solution1();
        System.out.println("two sum is "+Arrays.toString(sn.twoSum(arr, target)));
       
    }


}