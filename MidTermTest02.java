  // Enter number :  6
  // 22   27   31   34   36   16   
  // 23   28   32   35   11   17   
  // 24   29   33   7    12   18   
  // 25   30   4    8    13   19   
  // 26   2    5    9    14   20   
  // 1    3    6    10   15   21   
  
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
        if(j>=n-i-1)
          arr[j][i] = count++;
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(j<n-i-1)
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