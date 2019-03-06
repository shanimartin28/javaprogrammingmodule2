package bestseller.javaprogramming.module2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/*
 * Create a class called Tank that can be filled and emptied, and has a death condition that it must be empty when
 * the object is cleaned up. Write a finalize( ) that verifies this death condition. In main( ), test the possible scenarios
 * that can occur when your Tank is used.
 */
public class Excercise13Tank {
  
  private BufferedReader reader;
  
  public Excercise13Tank() {
    InputStream input = this.getClass()
              .getClassLoader()
              .getResourceAsStream("C:/SourceCode_01/TECH_15102018/Module1/src/bestseller/javaprogramming/module2/file.txt");
    this.reader = new BufferedReader(new InputStreamReader(input));
  }
  public static void main(String[] args) {
    String firstLine=null;;
    try {
      Excercise13Tank ex12 = new Excercise13Tank();    
      firstLine = ex12.readFirstLine();
    } catch (Exception e) {
      System.out.println("e :" +e);
    }
    System.out.println(firstLine);
    // To trigger the garbage collector and thus to call the finalize method
    System.gc();
    
  }
    
  public String readFirstLine() throws IOException {
          //String firstLine = reader.readLine();
          String firstLine = "aa";
          return firstLine;
  }
  
  public void finalize(){
    System.out.println("Helloo!! from Finalize!");
    try {
      reader.close();
      System.out.println("Closed BufferedReader in the finalizer");
    } catch (IOException e) {
      // TODO
    }
  }
}
