import java.io.*;
import java.util.*;

public class PrintMatrixInSpiralForm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
      
        for(int i=0; i<m; i++)
          for(int j=0; j<n; j++)
            arr[i][j] = sc.nextInt();
      
        int t=0, b=m-1, l=0, r=n-1, dir=0;
      
        while(t<=b && l<=r) {
          if(dir==0) { // left to right
            for(int i=l; i<=r; ++i)
              System.out.print(arr[t][i]+" ");
            t++; 
          }
          if(dir==1) { // top to bottom
            for(int i=t; i<=b; ++i)
              System.out.print(arr[i][r]+" ");
            r--;
          }
          if(dir==2) { // right to left
            for(int i=r; i>=l; --i)
              System.out.print(arr[b][i]+" ");
            b--; 
          }

          if(dir==3) { // bottom to top
            for(int i=b; i>=t; --i)
              System.out.print(arr[i][l]+" ");
            l++; 
          }

          dir = (dir+1)%4; // move in 4 directions
        }
    }
}