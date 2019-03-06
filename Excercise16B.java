package bestseller.javaprogramming.module2;

/*
 * Create a class with a String field that is initialised at the point of definition, and another one that is initialised by the constructor. 
 * What is the difference between the two approaches?
 * With the constructor the initialization takes place while creating the object
 */
public class Excercise16B {
  private static String strVal;
  
  public Excercise16B() {
    this.strVal = "Hello";
  }

  public static void main(String[] args) throws Exception{
    try{
      System.out.println("String Value Before: " +strVal);   
      new Excercise16B();
      System.out.println("String Value After: " +strVal);   
    }catch (Exception e){
      System.out.println(e);  
    }
  }
}
