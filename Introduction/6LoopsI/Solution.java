/**
 * Java loops 1
 * @author : wassgud42069
 * @created : 2021-10-26
**/

import java.util.Scanner;

public class Solution{
  public static void main(String[] Args){

    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for(int i = 1; i <= 10; i++){

      int ans = n * i;
      System.out.printf("%d " + "x" + " %d " + "=" + " %d\n", n, i, ans);
    }

  }
}


















