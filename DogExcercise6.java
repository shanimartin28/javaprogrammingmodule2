package bestseller.javaprogramming.module2;

/*
 * Create a class called Dog with an overloaded bark( ) method. This method should be overloaded based on various 
 * primitive data types, and print different types of barking, howling, etc., depending on which overloaded version 
 * is called. Write a main( ) that calls all the different versions. 
 */
public class DogExcercise6 {
  private static String dogName;
  public DogExcercise6() {
  }
  
  public DogExcercise6(String name) {
    this.dogName = name;
  }
  
  public String bark(int howLingCode){
    if(howLingCode==0){
      return "HowlCode0";
    }else if(howLingCode==1){
      return "HowlCode1";
    }else {
      return "HowlCode2";
    }
  }  
  
  public String bark(String barkingType){
    if(barkingType.equalsIgnoreCase("A")){
      return "BowBow";
    }else if(barkingType.equalsIgnoreCase("B")){
      return "BowBowUhhh";
    }else {
      return "BowBowUhhhBowww";
    }
  }  
  
  public String dogName(String name){
    return name;
  }  
  
  public static void main(String[] args) throws Exception{
     DogExcercise6 dobj = new DogExcercise6();
     System.out.println(dobj.bark(0));
     System.out.println(dobj.bark("A"));
     System.out.println(dobj.bark("zzzz"));
     System.out.println(dobj.bark("B"));
     System.out.println(dobj.bark(1));
   }  
   
}
