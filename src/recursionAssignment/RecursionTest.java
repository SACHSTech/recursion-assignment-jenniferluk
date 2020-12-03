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
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
