package bestseller.javaprogramming.module2;

/*
 * Create an array of String objects and assign a string to each element. Print the array using a for loop.
 *  @author: Shani Martin
 */
public class Excercise5 {
  public Excercise5() {
  }
  public static void main(String[] args) throws Exception{
     String[] strArray = {"one","two","three"};
     // Print all the array elements
     for (int i = 0; i < strArray.length; i++) {
       System.out.println(strArray[i] + " ");
     }
   }  
}
