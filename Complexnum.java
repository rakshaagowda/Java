//java program to add two complex numbers
class Complexadd {
  private double real;
  private double imaginary;
  static int count;
  public Complexadd(double real, double imaginary) {
      this.real = real;
      this.imaginary = imaginary;
      count++;
  }  
Complexadd add(Complexadd other){
  //use of this keyword
  double newReal = this.real + other.real;
  double newImaginary = this.imaginary + other.imaginary;
  return new Complexadd(newReal, newImaginary);
}
void display(){
  System.out.println(real + " + " + imaginary + "i");
}
void getcount(){
  System.out.println(count);
}

}
class Complexnum{
public static void main(String[] args){
  Complexadd c1 = new Complexadd(3.2, 4.5);
  Complexadd c2 = new Complexadd(1.8, 2.3);
  Complexadd result = c1.add(c2);
  System.out.print("Sum of complex numbers: ");
  result.display();
  result.getcount();
}
}
