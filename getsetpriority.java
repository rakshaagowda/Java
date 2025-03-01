
class Mythread extends Thread{
  public void run(){
    System.out.println("thread Name "+Thread.currentThread().getName());
    System.out.println("thread priority "+Thread.currentThread().getPriority());
  }
}
class getsetpriority{
  public static void main(String[] args){
    Mythread t1=new Mythread();
    t1.setName("first thread");
    t1.setPriority(Thread.MIN_PRIORITY);
    Mythread t2=new Mythread();
    t2.setName("second thread");
    t2.setPriority(Thread.MAX_PRIORITY);
    t1.start();
   t2.start();
  }
}