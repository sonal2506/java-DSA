import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter string:");
        String str=sc.next();
        int freq[]=new int[256];

        for(int i=0; i<str.length(); i++){
            if(freq[str.charAt(i)]==0){
                System.out.print(str.charAt(i));
                freq[str.charAt(i)]++;
            }
        }
        sc.close();
    }
}
    

