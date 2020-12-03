package recursionAssignment;
/**
* @author: J. Luk
*
*/
public class Recursion{
 
  /**
  * Takes in a number and recursively counts the occurrences of 8 as a digit
  * @param intN, the number we are adding up the digits for
  * @return sum of digit 8
  */
  public static int count8(int intN){

    // Base case, if the number is 0, return 0
    if (intN == 0) {
      return 0;
    
    // Recursive step, otherwise check if the rightmost digit is 8
    }else if (intN % 10 == 8) {
      return 1 + count8(intN / 10);
    
    }
  }
}