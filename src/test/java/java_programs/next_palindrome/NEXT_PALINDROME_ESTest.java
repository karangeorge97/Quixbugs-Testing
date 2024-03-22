/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 21 01:37:37 GMT 2024
 */

package java_programs;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NEXT_PALINDROME_ESTest extends NEXT_PALINDROME_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[4] = 9;
      intArray0[5] = 659;
      String string0 = NEXT_PALINDROME.next_palindrome(intArray0);
      assertEquals("[0, 0, 0, 1, 0, 660, 0, 0, 0]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[2];
      String string0 = NEXT_PALINDROME.next_palindrome(intArray0);
      assertEquals("[1, 1]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        NEXT_PALINDROME.next_palindrome((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java_programs.NEXT_PALINDROME", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[9];
      String string0 = NEXT_PALINDROME.next_palindrome(intArray0);
      assertEquals("[0, 0, 0, 0, 1, 0, 0, 0, 0]", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[0];
      String string0 = NEXT_PALINDROME.next_palindrome(intArray0);
      assertEquals("[1, 1]", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NEXT_PALINDROME nEXT_PALINDROME0 = new NEXT_PALINDROME();
  }
}
