class Demo{
  int a=5;
  void show(int a){
    System.out.println(a);
    System.out.println(this.a);
  }
}

public class ThisDemo{
  public static void main(String args[]){{
    Demo d=new Demo();
    d.show(10);
  }
}

}