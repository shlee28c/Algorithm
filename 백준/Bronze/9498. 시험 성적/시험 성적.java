import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    int test= console.nextInt();
    console.close();
    if (test >= 90){
      System.out.println("A");
    }
    else if (test >=80){
      System.out.println("B");
    }
    else if (test >=70){
      System.out.println("C");
    }
    else if (test >=60){
      System.out.println("D");
    }
    else{
      System.out.println("F");
    }
    }
}