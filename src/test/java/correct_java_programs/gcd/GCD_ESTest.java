/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 21 01:34:26 GMT 2024
 */

package correct_java_programs.gcd;


import correct_java_programs.GCD;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GCD_ESTest extends GCD_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = GCD.gcd((-493), 2246);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = GCD.gcd((-493), 0);
      assertEquals((-493), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = GCD.gcd(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GCD gCD0 = new GCD();
  }
}
