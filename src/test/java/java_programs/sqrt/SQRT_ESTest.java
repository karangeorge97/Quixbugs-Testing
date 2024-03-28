/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 21 01:39:11 GMT 2024
 */

package java_programs.sqrt;

import java_programs.SQRT;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SQRT_ESTest extends SQRT_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = SQRT.sqrt(1337.42256544, 855.298338);
      assertEquals(668.71128272, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = SQRT.sqrt((-1914.879520558581), 1300.0);
      assertEquals((-957.4397602792905), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      SQRT.sqrt(1.0, (-1.0));
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
