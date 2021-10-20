/** IF-ELSE
 * @author : Wassgud42069
 * @created : 2021-10-21
**/


import java.util.Scanner;

public class Ifelse{
  public static void main(String[] Args){
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();

    if((n % 2 != 0) || (n % 2 == 0 && ((n >= 6) && (n <= 20)))){
      System.out.println("Weird");
    }
    else if(((n % 2 == 0) && ((n >= 2) && (n <= 5))) || ((n % 2 == 0) && (n > 20))){
      System.out.println("Not Weird");
    }


  }
}







