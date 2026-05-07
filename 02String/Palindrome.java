import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0; 
        int j=s.length()-1;
        boolean Is_palindrome=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                Is_palindrome=false;
                break;
            }
            i++;
            j--;
        }
        if(Is_palindrome==true) System.out.println("palindrome");
        else System.out.println("not a Palindrome");

        sc.close();
    }
}
