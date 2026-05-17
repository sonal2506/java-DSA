import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size : ");
        int n=sc.nextInt();
        int []nums=new int[n];
        System.out.print("enter nums : ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
}

