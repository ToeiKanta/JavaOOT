// Enter number :  6
// 1    22   23   25   28   32   
// 2    7    24   26   29   33   
// 3    8    12   27   30   34   
// 4    9    13   16   31   35   
// 5    10   14   17   19   36   
// 6    11   15   18   20   21   
   
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    int count = 1;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(j>=i)
          arr[j][i] = count++;
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(j<i)
          arr[j][i] = count++;
      }
    }
    for(int m[] : arr){
      for(int k : m){
        System.out.printf("%-5d",k);
      }
      System.out.println("");
    }
  }
}