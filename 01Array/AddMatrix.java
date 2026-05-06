import java.util.*;
public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("column: ");
        int m=sc.nextInt();
        System.out.print("rows: ");
        int n=sc.nextInt();
        int [][]arr1=new int[m][n];
        int [][]arr2=new int[m][n];

        System.out.println("enter element of arr1: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter element of arr2: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr1[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr1[i][j]+" ");
            }
                System.out.print("\n");
        }
        sc.close();
    }
}
