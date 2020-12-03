package recursionAssignment;
import java.io.*;
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
    
    // If the rightmost digit is not 8, then remove it and run through the method again
    }else {
      return count8(intN/10);
    }
  }
  /**
  * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
  * @param str, the string with appearances of "pi"
  * @return string with "pi" replaced with "3.14"
  */
  public static String changePi(String str){
    
    // Base case, if the string length is less than or equal to 1, then "pi" is not present
    if(str.length() <= 1){
      return str; 
    }
    return str;
  }

}