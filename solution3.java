import java.util.*;

public class solution3{
    public int lengthofstring(String s){
        int l=0;
        int r=0;
        int maxlen=0;
        HashMap <Character,Integer> lists=new HashMap<>();
        while (r<s.length()){
            char c=s.charAt(r);
            if(lists.containsKey(c)&&lists.get(c)>=1){
                l=lists.get(c)+1;
            }
            int len=r-l+1;
            maxlen=Math.max(len, maxlen);
            lists.put(c, r);
            r++;
        }
return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String s=sc.next();
        solution3 sn=new solution3();
        System.out.println("length of string is :"+sn.lengthofstring(s));

    }

}