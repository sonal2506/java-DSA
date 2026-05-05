import java.util.*;
public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size : ");
        int n=sc.nextInt();
        int []nums=new int[n];
        System.out.print("enter nums : ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
}
