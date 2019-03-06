package bestseller.javaprogramming.module2;

/*
 * Create a class with two methods. Within the first method, call the second method twice: the first time without using this, 
 * and the second time using this.
 */
public class Excercise9 {
  
  public void methodOne(){
    System.out.println("You are in methodOne!");
    methodTwo();
    this.methodTwo();
  }  
  
  public void methodTwo(){
    System.out.println("You are in methodTwo!");
  }  

  public static void main(String[] args) throws Exception{
     Excercise9 eobj = new Excercise9();
     eobj.methodOne();
   }  
}
