import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner console = new Scanner (System.in);
      int a=console.nextInt();
      int b=console.nextInt();
      int c=console.nextInt();

      if ((a==b) && (a==c) && (b==c)){
        System.out.println(10000+(a*1000));
      }
      else if ((a==b) || (a==c) || (b==c)){
        if ((a==b)&&(a!=c)&&(b!=c)){
          System.out.println(1000+(a*100));
        }
        else if ((b==c)&&(b!=a)&&(c!=a)){
          System.out.println(1000+(b*100));
        }
        else if ((a==c)&&(c!=b)&&(a!=b)){
          System.out.println(1000+(c*100));
        }
      }
      else if ((a!=b) && (a!=c) && (b!=c)){
        if ((a>b)&&(a>c)){
          System.out.println((a*100));
        }
        else if ((b>a)&&(b>c)){
          System.out.println((b*100));
        }
        else if ((c>a)&&(c>b)){
          System.out.println((c*100));
        }
      }
      }
      }