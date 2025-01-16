import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    int H= console.nextInt();
    int M=console.nextInt();
    
    if ((H<=23) && (H>=0)){
      if ((M<=59) && (M>=0)){
        if (H>0){
          if (M<45){
            System.out.println((H-1)+ " " + (60-(45-M)));
          }
          else if (M==45){
            System.out.println(H + " " + 0);
          }
          else if (M>=45){
            System.out.println(H + " " + (M-45));
          }
          }
        else if (H==0) {
          if (M<45){
            System.out.println((H+23)+ " " + (60-(45-M)));
          }
          else if ((M==45) && (M<=0)){
            System.out.println(H+23 + " " + 0);
          }
          else if (M>=45){
            System.out.println(H + " " + (M-45));
          }
        }
          }
    }
    }
  }