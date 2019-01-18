// 3 2 5 3 5 2 2 1 1 3
// 3 5 5 2 1
// 3 3 2 3
class Main {
  public static void main(String[] args) {
    int[][] n = {{3},
                {2,5},
                {3,5,2},
                {2,1,1,3}};
    printStep(n,1);
    printStep(n,2);
    printStep(n,3);
  }
  public static void printStep(int[][] n ,int step){
    int count = 0 ;
    System.out.print(n[0][0] + " ");
    for(int i=0;i<n.length;i++)
      for(int j=0;j<n[i].length;j++){
        if(count == step){
          System.out.print(n[i][j] + " ");
          count = 0;
        }
        count++;
      }
      System.out.println(" ");
  }
}
