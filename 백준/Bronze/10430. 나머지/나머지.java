import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int a=console.nextInt();
      int b=console.nextInt();
      int c=console.nextInt();
      console.close();
      System.out.println((a+b)%c);
      System.out.println(((a%c)+(b%c))%c);
      System.out.println((a*b)%c);
      System.out.println(((a%c)*(b%c))%c);
  }
}