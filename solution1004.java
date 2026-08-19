

import java.util.*;

public class solution1004 {
    public int findingonce(int [] nums,int k){
        int l=0;
        int r=0;
        int len=0;
        int zeros=0;
        int maxlen=0;
        while(r<nums.length){
            if(nums[r]==0){
                zeros++;
            } 
            if (zeros>k) {
                if(nums[l]==0){
                    zeros--;

                }
                l++;
            }  
            if(zeros<=k){
                    len=r-l+1;
                    maxlen=Math.max(len, maxlen);
                
            }
 r++;
    }
    return maxlen;
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array length");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("enter key elements");
    int k=sc.nextInt();
    solution1004 sn=new solution1004();
    System.out.println("solution is"+sn.findingonce(arr, k));
    sc.close();
}
}


