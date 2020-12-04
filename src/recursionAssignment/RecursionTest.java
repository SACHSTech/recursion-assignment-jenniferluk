package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
       
    // Problem 1 Tests
    
    // Check if Base Case works
    @Test
    public void Test1_1(){
      // make assertion statement(s)
      assertEquals(0,Recursion.count8(0));
    }
    
     
    @Test
    public void Test1_2(){
      // make assertion statement(s)
      assertEquals(1,Recursion.count8(8));
    }

    @Test
    public void Test1_3(){
      // make assertion statement(s)
      assertEquals(2,Recursion.count8(818));
    }  

    @Test
    public void Test1_4(){
      // make assertion statement(s)
      assertEquals(3,Recursion.count8(8818));
    }  

    // Test a case without 8
    @Test
    public void Test1_5(){
      // make assertion statement(s)
      assertEquals(0,Recursion.count8(126));
    } 

    // Tests Complex Case
    @Test
    public void Test1_6(){
      // make assertion statement(s)
      assertEquals(6,Recursion.count8(1234886767318978868));
    }  

    // Problem 2 Tests
    
    // Check if Base Case works
    @Test
    public void Test2_1(){
      // make assertion statement(s)
      assertEquals("p",Recursion.changePi("p"));
    }  

    @Test
    public void Test2_2(){
      // make assertion statement(s)
      assertEquals("x3.14x",Recursion.changePi("xpix"));
    }  

    @Test
    public void Test2_3(){
      // make assertion statement(s)
      assertEquals("3.143.14",Recursion.changePi("pipi"));
    }  

    @Test
    public void Test2_4(){
      // make assertion statement(s)
      assertEquals("3.14p",Recursion.changePi("pip"));
    }  

    // Tests complex case
    @Test
    public void Test2_5(){
      // make assertion statement(s)
      assertEquals("3.14pxxx3.14abc3.14paa",Recursion.changePi("pipxxxpiabcpipaa"));
    }  

    // Problem 3 Tests
    @Test
    public void Test3_1(){
        // make assertion statement(s)
        assertTrue(Recursion.array220(new int[] {1, 2, 20},0));
    } 

    @Test
    public void Test3_2(){
        // make assertion statement(s)
        assertFalse(Recursion.array220(new int[] {},0));
    }  

    @Test
    public void Test3_3(){
        // make assertion statement(s)
        assertTrue(Recursion.array220(new int[] {3, 30},0));
    }  

    @Test
    public void Test3_4(){
        // make assertion statement(s)
        assertFalse(Recursion.array220(new int[] {3},0));
    }  
    
}
