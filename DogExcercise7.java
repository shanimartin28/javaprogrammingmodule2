package bestseller.javaprogramming.module2;


/*
 * Modify Exercise 6 so that two of the overloaded methods have two arguments (of two different types), 
 * but in reversed order relative to each other. Verify that this works.
 */
public class DogExcercise7 {
  public DogExcercise7() {
  }
  
  public String bark(int howLingCode, String msg){
    System.out.println(msg);
    if(howLingCode==0){
      return "HowlCode0";
    }else if(howLingCode==1){
      return "HowlCode1";
    }else {
      return "HowlCode2";
    }
  }  
  
  public String bark(String barkingType, int msgCode){
    System.out.println(msgCode);
    if(barkingType.equalsIgnoreCase("A")){
      return "BowBow";
    }else if(barkingType.equalsIgnoreCase("B")){
      return "BowBowUhhh";
    }else {
      return "BowBowUhhhBowww";
    }
  }  
  
  public static void main(String[] args) throws Exception{
     DogExcercise7 dobj = new DogExcercise7();
     System.out.println(dobj.bark(0,"Hi"));
     System.out.println(dobj.bark("A",0));
     System.out.println(dobj.bark("zzzz",0));
     System.out.println(dobj.bark("B",0));
     System.out.println(dobj.bark(1,"Cyu"));
   }  
}
