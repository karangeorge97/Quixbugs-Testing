/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 21 01:42:01 GMT 2024
 */

package correct_java_programs.knapsack;

import correct_java_programs.KNAPSACK;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KNAPSACK_ESTest extends KNAPSACK_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[][] intArray0 = new int[7][9];
      int[] intArray1 = new int[3];
      intArray1[1] = 1260;
      intArray0[0] = intArray1;
      // Undeclared exception!
      KNAPSACK.knapsack(1260, intArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][] intArray0 = new int[1][9];
      int[] intArray1 = new int[2];
      intArray1[1] = 71;
      intArray0[0] = intArray1;
      int int0 = KNAPSACK.knapsack(71, intArray0);
      assertEquals(71, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(1, (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[][] intArray0 = new int[0][7];
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-962), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("correct_java_programs.KNAPSACK", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[][] intArray0 = new int[7][9];
      int[] intArray1 = new int[5];
      intArray1[0] = (-1);
      intArray0[1] = intArray1;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(1260, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][] intArray0 = new int[1][9];
      int[] intArray1 = new int[2];
      intArray1[0] = 71;
      intArray0[0] = intArray1;
      int int0 = KNAPSACK.knapsack(71, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
  }
}