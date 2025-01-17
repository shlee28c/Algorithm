import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner console = new Scanner (System.in);
    int totalMoney=console.nextInt();
    int numItem=console.nextInt();
    int sum=0;
    for (int i= numItem; i>=1; i--){
      int price=console.nextInt();
      int numItem2=console.nextInt();
      sum+=price*numItem2;
      }
    if (totalMoney!=sum){
      System.out.println("No");
    }
    else {
      System.out.println("Yes");
    }
    }
    }