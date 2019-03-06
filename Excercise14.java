package bestseller.javaprogramming.module2;

/*
 * Create a class containing an int and a char that are not initialised, and print their values 
 * to verify that Java performs default initialisation.
 */
public class Excercise14 {
  private static int iVal;
  private static char chVal;
  
  public static void main(String[] args) throws Exception{
    System.out.println("Int Value : " +iVal);
    System.out.println("Char Value : " +chVal);
  }
}
