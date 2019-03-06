package bestseller.javaprogramming.module2;

/*
 * Repeat Exercise 17 for a three-dimensional array.
 * Basically, 3d array is an array of 2d arrays.
 */
public class Excercise18 {
  public Excercise18() {
  }
 
  public static void main(String[] args) throws Exception{
    try{
      Excercise18 exObj = new Excercise18();
      double[][][] arr = exObj.create3DArray(3,4,3,1);
      exObj.print3DArray(3,4,3,arr);
    }catch (Exception e){
      System.out.println(e);  
    }
  }
  
  private double[][][] create3DArray(int rowCount, int colCount, int threedRowCount,  int initStartVal){
    double[][] arr = new double[rowCount][colCount]; 
    double[][][] threeDarr = new double[rowCount][colCount][threedRowCount]; 
    for(int i=0;i<rowCount;i++){
      for(int j=0;j<colCount;j++){
        arr[i][j] = initStartVal;
        initStartVal++;
      }
    }
    for(int k=0;k<threedRowCount;k++){
      for(int i=0;i<rowCount;i++){
        for(int j=0;j<colCount;j++){
          threeDarr[i][j][k]  = arr[i][j];
        }
      }
    }
    
    return threeDarr;
  }
  
  private void print3DArray(int rowCount, int colCount, int threedRowCount, double[][][] arr){
        
     for(int k=0;k<threedRowCount;k++){
       for(int i=0;i<rowCount;i++){
         for(int j=0;j<colCount;j++){
           System.out.print(arr[i][j][k]  + "   ");
         }
         System.out.println("");
       }
       System.out.println("");
     }
     
  }
}
