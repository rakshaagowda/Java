class Pyramid{
   synchronized void draw_py(char ch){
    for(int i=0;i<10;i+=2){
      for(int k=10-i;k>0;k-=2){
        System.out.print(" ");
      }
      for(int j=0;j<=i;j++){
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}
class A extends Thread{
  Pyramid p;
  A(Pyramid p){
    this.p=p;
  }
  public void run(){
    p.draw_py('*');
  }
}

class B extends Thread{
  Pyramid p;
  B(Pyramid p){
    this.p=p;
  }
  public void run(){
    p.draw_py('#');
  }
}

class Synchtest{
  public static void main(String[] args){

    Pyramid obj = new Pyramid();
    A a = new A(obj);
    B b = new B(obj);
    a.start();
    b.start();
}

}