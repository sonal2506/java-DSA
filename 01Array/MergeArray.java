import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of arr1: ");
        int n=sc.nextInt();
        int []arr1=new int[n];

        System.out.print("enter size of arr2: ");
        int m=sc.nextInt();
        int []arr2=new int[m];

        System.out.print("enter elements of 1st arr : ");
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }

        System.out.print("enter elements of 2nd arr : ");
        for(int i=0; i<m; i++){
            arr2[i]=sc.nextInt();
        }
        int []arr3=new int[arr1.length+arr2.length];
        for(int i=0; i<arr1.length; i++){
            arr3[i]=arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            arr3[i+arr1.length]=arr2[i];
        }
        System.out.println("Merged Array: "+Arrays.toString(arr3));
        sc.close();
    }
}
