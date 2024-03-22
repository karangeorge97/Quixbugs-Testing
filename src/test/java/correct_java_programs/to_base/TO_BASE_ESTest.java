/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 03:09:13 GMT 2024
 */

package correct_java_programs.to_base;

import correct_java_programs.TO_BASE;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TO_BASE_ESTest extends TO_BASE_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = TO_BASE.to_base(335, 335);
      assertEquals("10", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = TO_BASE.to_base((-56), (-56));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      TO_BASE.to_base(1, 1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        TO_BASE.to_base(2133, (-511));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        TO_BASE.to_base(1, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TO_BASE tO_BASE0 = new TO_BASE();
  }
}
