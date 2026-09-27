import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of arr: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter arr element: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int ts=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays : "+ts);
        sc.close();
    }
}
