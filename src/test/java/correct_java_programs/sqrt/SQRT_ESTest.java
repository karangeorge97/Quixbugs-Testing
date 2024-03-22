/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 21 01:50:58 GMT 2024
 */

package correct_java_programs.sqrt;

import correct_java_programs.SQRT;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SQRT_ESTest extends SQRT_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = SQRT.sqrt(2.0, 2.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = SQRT.sqrt((-1.0), 294.491);
      assertEquals((-0.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      SQRT.sqrt((-1438.520690455), 1303.0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = SQRT.sqrt(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SQRT sQRT0 = new SQRT();
  }
}
