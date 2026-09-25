import java.util.Scanner;

public class BinarySearch {
    public static int binarysearch(int arr[],int key) {
        int lo=0, hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key) lo=mid+1;
            else hi=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter arr : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter key: ");
        int key=sc.nextInt();
        System.out.println("found at : "+ binarysearch(arr, key));
        sc.close();
    }
}
