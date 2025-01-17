import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner console = new Scanner (System.in);
    int n=console.nextInt();
    int num=1;
    int s=0;
    while (num<=n){
      s+=num;
      num+=1;
    }
    System.out.println(s);
  }
}