//java program to calculate area of circle and rectangle demonstrating overloading
import java.util.*;
class calculate{
  void area(int r){
    System.out.println(3.14*r*r);
  }

  void area(int l,int b){
    System.out.println(l*b);
  }
}
class Overloading {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int l = in.nextInt();
    calculate c = new calculate();
    c.area(a);
    c.area(l,b);
    in.close();
  }  
}

