package bestseller.javaprogramming.module2;

import java.util.ArrayList;

/*
 * Extend the class Dog from excercise 6 and add a field name which will get initialised by the constractor, getting a String as parameter.
 * Write a program that creates an ArrayList object of Dog instances and write a method that is able to find dogs by
 * name by using the contains() method of the ArrayList.
 *
 */
public class Excercise19 extends DogExcercise6{
  public Excercise19() {
  }
  
  
  public static void main(String[] args) throws Exception{
    try{
      Excercise19 exObj = new Excercise19();
      ArrayList<DogExcercise6> dogsObjects = new ArrayList<DogExcercise6>();
      DogExcercise6 dogObj1 = new DogExcercise6("Alle");
      dogsObjects.add(dogObj1);
      DogExcercise6 dogObj2 = new DogExcercise6("Betty");
      dogsObjects.add(dogObj2);
      DogExcercise6 dogObj3 = new DogExcercise6("Cathy");
      dogsObjects.add(dogObj3);
      findDog(dogObj1,dogsObjects);
      findDog(dogObj2,dogsObjects);
      findDog(dogObj3,dogsObjects);
      findDog(new DogExcercise6("cc"),dogsObjects);            
    }catch (Exception e){
      System.out.println(e);  
    }
  }
  
  private static void findDog(DogExcercise6 dog,ArrayList<DogExcercise6> dogsObjects){
    System.out.println("Found dog: " + dogsObjects.contains(dog));
  }
}
