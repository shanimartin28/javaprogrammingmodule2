package bestseller.javaprogramming.module2;

/*
 * To create an overloaded constructor to Exercise 1 that takes a String argument and prints it along with your message.
 * @author: Shani Martin
 */
public class Excercise2 {
  public Excercise2(String msg) {
    System.out.println(msg);
  }
  public static void main(String[] args) throws Exception{
    Excercise2 eobj = new Excercise2("Hello World from Constructor!");
  }
}
