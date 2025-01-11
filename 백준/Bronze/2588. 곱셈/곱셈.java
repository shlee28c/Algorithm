import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int a=console.nextInt();
      int b=console.nextInt();
      console.close();
      System.out.println((b%10)*a);
      System.out.println(((b/10)%10)*a);
      System.out.println((b/100)*a);
      System.out.println((a*b));
  }
}