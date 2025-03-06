//Java program
class Parent{
  void method1(){
    System.out.println("Parent class method");
  }
}

class child extends Parent
  {
    void method1(){
  
      System.out.println("child class method");}
}
public class Overriding {
  public static void main(String[] args) {
    Parent p= new Parent();
    p.method1();
    child c= new child();
    c.method1();


  }
}
