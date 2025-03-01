class Pyramid{
  synchronized void draw_py(char ch){
    for(int i=0;i<10;i+=2){
      for(int k=10-i;k>0;k--){
        System.out.print(" ");
      }
      for(int j=0;j<=i;j++){
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}