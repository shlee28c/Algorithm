import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int a=console.nextInt();
      int b=console.nextInt();
      console.close();
      if (a>b){
          System.out.println(">");
      }
      else if (a<b){
          System.out.println("<");
      }
      else{
          System.out.println("==");
      }
  }
}