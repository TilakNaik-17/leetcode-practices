    import java.util.*;

    class solution424 {
        public int characterReplacement(String s, int k) {
            int l=0;
            int r=0;
            HashMap <Character,Integer>  list=new HashMap<>(26);

            int maxlen=0;
            int maxf=0;
            while (r<s.length()) {
            char ch=s.charAt(r);
            list.put(ch, list.getOrDefault(ch, 0) + 1);
            maxf=Math.max(maxf,list.get(ch));

            while((r-l+1)-maxf>k){
            char lch=s.charAt(l);
            list.put(lch, list.get(lch) - 1);
            
            l++;
            }
            maxlen=Math.max(maxlen, r-l+1);
            r++;
            }
        
    return maxlen;

        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter thhe string:");
            String s=sc.next();
            System.out.println("enter k value:");
            int k=sc.nextInt();
            solution424 sn=new solution424();
         System.out.println("Maximum length: " + sn.characterReplacement(s, k));

         sc.close();
        }
    }