
class Myrunnable implements Runnable{
  String threadname;
  Myrunnable(String name){
    threadname=name;
  }
  public void run(){
    System.out.println("thread name "+threadname);  
    for(int i=0;i<5;i++){
      System.out.println(threadname+" "+i);
      try{
      Thread.sleep(1000);
       }catch(InterruptedException e){
         System.out.println(threadname+" interrupted "+e);
       }
       
  }
  System.out.println(threadname+" exiting");

}
}

public class MultiThread {
  public static void main(String[] args){
    Thread t = new Thread(new Myrunnable("first"));
    Thread t3 = new Thread(new Myrunnable("second"));
    t.start();
    t3.start();
  }
}