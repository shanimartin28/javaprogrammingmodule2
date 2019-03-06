package bestseller.javaprogramming.module2;

/*
 * Create a class with a String field that is initialised at the point of definition, and another one that is initialised by the constructor. 
 * What is the difference between the two approaches?
 */
public class Excercise16 {
  private static String strVal="Hello";

  public static void main(String[] args) throws Exception{
    try{
      System.out.println("String Value : " +strVal);   
    }catch (Exception e){
      System.out.println(e);  
    }
  }
}
