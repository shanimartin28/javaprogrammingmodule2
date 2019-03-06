package bestseller.javaprogramming.module2;

/*
 *Create a class containing an uninitialised String reference. Demonstrate that this reference is initialised by Java to null. 
 */
public class Excercise15 {
  private static String strVal;

  public static void main(String[] args) throws Exception{
  try{
    System.out.println("String Value : " +strVal);   
  }catch (Exception e){
    System.out.println(e);  
  }
 }
}
