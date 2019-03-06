package bestseller.javaprogramming.module2;

/*
 * Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
 */
public class Excercise10 {
  public Excercise10() {
    this("Hi! I'm the overloaded constructor");
    System.out.println("Hi! I'm the Default constructor");
  }
  public Excercise10(String msg) {
   System.out.println(msg);
  }
  public static void main(String[] args) throws Exception{
   new Excercise10();
  }  
}
