/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 21 01:35:12 GMT 2024
 */

package java_programs.max_sublist_sum;

import java_programs.MAX_SUBLIST_SUM;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MAX_SUBLIST_SUM_ESTest extends MAX_SUBLIST_SUM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      int int0 = MAX_SUBLIST_SUM.max_sublist_sum(intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        MAX_SUBLIST_SUM.max_sublist_sum((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java_programs.MAX_SUBLIST_SUM", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = MAX_SUBLIST_SUM.max_sublist_sum(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MAX_SUBLIST_SUM mAX_SUBLIST_SUM0 = new MAX_SUBLIST_SUM();
  }
}