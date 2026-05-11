import java.util.*;
public class isAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int freq[]=new int[256];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
            freq[t.charAt(i)]--;
        }
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)]!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st string: ");
        String s=sc.next();
        System.out.print("enter2nd string: ");
        String t=sc.next();
        if(isAnagram(s,t)) System.out.println("Anagram");
        else System.out.println("Not a Anagram");

    }
}

