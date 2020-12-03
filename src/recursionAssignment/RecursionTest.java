package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    // Problem 1 Tests
    // Check if Base Case works
    @Test
    public void Test1(){
        // make assertion statement(s)
        assertEquals(0,Recursion.count8(0));
    }
    
    @Test
    public void Test2(){
        // make assertion statement(s)
        assertEquals(1,Recursion.count8(8));
    }

    @Test
    public void Test3(){
        // make assertion statement(s)
        assertEquals(2,Recursion.count8(818));
    }  

    @Test
    public void Test4(){
        // make assertion statement(s)
        assertEquals(3,Recursion.count8(8818));
    }  

    @Test
    public void Test5(){
        // make assertion statement(s)
        assertEquals(0,Recursion.count8(126));
    }  

    // Problem 2 Tests
    @Test
    public void Test6(){
        // make assertion statement(s)
        assertEquals("p",Recursion.changePi("p"));
    }  

    @Test
    public void Test7(){
        // make assertion statement(s)
        assertEquals("x3.14x",Recursion.changePi("xpix"));
    }  

    @Test
    public void Test8(){
        // make assertion statement(s)
        assertEquals("3.143.14",Recursion.changePi("pipi"));
    }  

    @Test
    public void Test9(){
        // make assertion statement(s)
        assertEquals("3.14p",Recursion.changePi("pip"));
    }  


    // Problem 3 Tests
    @Test
    public void Test10(){
        // make assertion statement(s)
        assertTrue(Recursion.array220(new int[] {1, 2, 20},0));
    } 

    @Test
    public void Test11(){
        // make assertion statement(s)
        assertFalse(Recursion.array220(new int[] {},0));
    }  

    @Test
    public void Test12(){
        // make assertion statement(s)
        assertTrue(Recursion.array220(new int[] {3, 30},0));
    }  




    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
