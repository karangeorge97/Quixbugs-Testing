/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 03:08:13 GMT 2024
 */

package correct_java_programs.subsequences;

import correct_java_programs.SUBSEQUENCES;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SUBSEQUENCES_ESTest extends SUBSEQUENCES_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      int int0 = 50;
      int int1 = 3176;
      // Undeclared exception!
      SUBSEQUENCES.subsequences(50, 3176, 50);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SUBSEQUENCES.subsequences(869, (-2681), (-2681));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(2461, 2461, 2461);
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences((-438), (-182), 1);
      assertEquals(256, arrayList0.size());
  }
}