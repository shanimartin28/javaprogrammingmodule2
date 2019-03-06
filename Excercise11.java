package bestseller.javaprogramming.module2;

/*
 * Create a class with a finalize( ) method that prints a message. In main( ), 
 * create an object of your class. Explain the behaviour of your program
 * -->finalize() not called
 */
public class Excercise11 {
  public Excercise11() {
  }
  public static void main(String[] args) throws Exception{
   Excercise11 ex1 = new Excercise11();
  }
  
  public void finalize(){
    System.out.println("Helloo!! from Finalize!");
  }
}
