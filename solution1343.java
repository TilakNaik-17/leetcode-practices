import java.util.*;

class solution1343{
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cursum=0;
        int count=0;
        for(int i=0;i<k;i++){
            cursum=cursum+arr[i];
          
            }
            int avg=cursum/k;
            if(avg>=threshold){
                count++;

        }
        for(int i=k;i<arr.length;i++){
            cursum=cursum+arr[i]-arr[i-k];
            avg=cursum/k;
            if(avg>=threshold){
                count++;
            }

        }

        return count;

        
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the slide window");
        int k=sc.nextInt();
        System.out.println("enter the value of thresold");
        int threshold=sc.nextInt();
        solution1343 sn=new solution1343();
        System.out.println("output is:"+sn.numOfSubarrays(arr,k,threshold));
        sc.close();
    }
}