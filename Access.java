//java prrogram demonstrate the use of access modifiers

class Test{
  public int publicvar=10;
  int defaultvar=20;
  private int privatevar=30;
  protected int protectedvar=40;
  void display(){
    System.out.println("publicvar "+publicvar);
    System.out.println("defaultvar "+defaultvar); //error if called by a subclass in different package
    System.out.println("privatevar "+privatevar);//error if called by class other than Test
    System.out.println("protectedvar "+protectedvar);//error if called by  different package
  }
}
class Access{
  public static void main(String args[]){
    Test t=new Test();
    t.display();
  }
}