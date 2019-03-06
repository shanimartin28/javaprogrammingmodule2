package bestseller.javaprogramming.module2;

/*
 * Complete Exercise 3 by creating objects to attach to the array of references.
 * @author: Shani Martin
 */
public class Excercise4 {
  public Excercise4() {
  }
  public static void main(String[] args) throws Exception{
    Excercise2[] objArray = new Excercise2[2];
    Excercise2 eobj1 = new Excercise2("Hello World from Excercise4!");
    Excercise2 eobj2 = new Excercise2("Hello World from Excercise4!");
    objArray[0] = eobj1;
    objArray[1] = eobj2;
  }  
}
