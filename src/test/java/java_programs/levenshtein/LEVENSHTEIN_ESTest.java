/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 21 01:32:51 GMT 2024
 */

package java_programs.levenshtein;

import java_programs.LEVENSHTEIN;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LEVENSHTEIN_ESTest extends LEVENSHTEIN_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = LEVENSHTEIN.levenshtein("", "");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        LEVENSHTEIN.levenshtein((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      LEVENSHTEIN.levenshtein("k?/ZNZ-LkE", "Nc[|I4.x,l:#6<");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = LEVENSHTEIN.levenshtein("Nc[|I4.x,l:#6<", "Nc[|I4.x,l:#6<");
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
  }
}