import java.util.*;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size : ");
        int n=sc.nextInt();
        int []nums=new int[n];
        System.out.print("enter nums : ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int max=nums[0];
        for(int i=0; i<n; i++){
            if(nums[i]>max) max=nums[i];
        }
        System.out.println("largest number is: "+max);
        sc.close();
    }
}
