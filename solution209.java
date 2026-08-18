import java.util.*;
public class solution209 {
    public int minsubarray(int target,int[] nums){
       int l=0;
       int r=0;
       int maxlen=Integer.MAX_VALUE;
       int curlen=0;

       for(r=0;r<nums.length;r++){
        curlen=curlen+nums[r];
        while  (curlen>=target){
            int curwindowlen=r-l+1;

            maxlen=Math.min(curwindowlen,maxlen);
            curlen=curlen-nums[l];
            l++;

            
        }
       }

       return maxlen==Integer.MAX_VALUE?0:maxlen;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. array elements");
        int n=sc.nextInt();
        System.out.println("enter the arraay elements");
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();

        }
        System.out.println("enter the taarget elements");
        int target=sc.nextInt();
        solution209 sn=new solution209();
        System.out.println("minimal size sub array sum is:::"+sn.minsubarray(target, arr));
        sc.close();
    }
}
