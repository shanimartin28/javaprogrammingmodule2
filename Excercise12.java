package bestseller.javaprogramming.module2;

/*
 * Modify Exercise 11 so that your finalize( ) will always be called.
 */
public class Excercise12 {
  public Excercise12() {
  }
  public static void main(String[] args) throws Exception{
    Excercise12 ex12 = new Excercise12();
    ex12.finalize();
  }
  
  public void finalize(){
    System.out.println("Helloo!! from Finalize!");
  }
}
