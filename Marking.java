import java.util.Random;

/**
 * This program uses 2d arrays to calculate student marks.
 * 
 * @author Amin Zeina
 * @version 1.0
 * @since 2020-03-06
 */

 
public class Marking {
  
  /**
  * This method calculates and returns the class average.
  */
 
  public static int calculateAverage(int[][] marksArray) {
    int classAverage = 0;
    // Nested loop to add each mark value, finding class average
    for (int row = 0; row < marksArray.length; row++) {
      for (int column = 0; column < marksArray[0].length; column++) {
        classAverage += marksArray[row][column];
      } 
    }
    // Divide by 24 to get average 
    classAverage = classAverage / 24;
    return classAverage;
  }
  
  /**
  * This class generates students marks, then calls calculateAverage.
  */
    
  public static void main(String[] args) {
    
    // Create random object
    Random random = new Random();
    
    // Delcare variables
    int[][] marksArray = new int[4][6];
    int classAverage = 0;
    
    // Populate array with marks 50-100 to make higher marks more frequent
    for (int row = 0; row < marksArray.length; row++) {
      for (int column = 0; column < marksArray[0].length; column++) {
        // Generate random from 50-100 so higher marks are more frequent 
        marksArray[row][column] = random.nextInt((50) + 1) + 50;
      } 
    }
    // Get average of marks, rounded
    System.out.println("The class average is: " 
        + Math.round(calculateAverage(marksArray) * 100) / 100 + "%.");
  }
}