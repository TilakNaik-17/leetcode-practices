import java.util.*;

public  class solution1{
    public  int maxvowel(String s, int k){
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
                
            }
        }
max=count;


for(int i=k;i<s.length();i++){
    if(isVowel(s.charAt(i))){
        count++;
    }

    if(isVowel(s.charAt(i-k))){
        count--;
    }
    max=Math.max(max, count);

}
return max;


    }


    private boolean isVowel(char c ) {
        return c=='a'|| c=='e'||c=='i'||c=='o'||c=='u';
    }


public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String s=sc.next();
    System.out.println("enter k");

    int k=sc.nextInt();
    solution1 sn=new solution1();
    System.out.println("this string contains "+sn.maxvowel(s,k));

    sc.close();
}
}