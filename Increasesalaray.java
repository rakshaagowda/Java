//java program to increase the salary of employee based on their type
class Employee{
  double salary=50000;
  void increment(String type){
    if(type.equals("Fulltime")){
      salary+=salary*.5;
    }
    if(type.equals("Intern")){
      salary+=salary*.25;
    
    }
      
    }
  }




class Increasesalaray{
  public static void main(String args[]){
    Employee e=new Employee();
    e.increment("Fulltime");
    System.out.println(e.salary); 
      Employee e1=new Employee(); 
    e1.increment("Intern");    
    System.out.println(e1.salary);
  }

}
