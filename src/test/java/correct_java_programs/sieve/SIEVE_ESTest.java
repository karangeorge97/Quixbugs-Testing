/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 03:07:46 GMT 2024
 */

package correct_java_programs.sieve;

import correct_java_programs.SIEVE;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SIEVE_ESTest extends SIEVE_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ArrayList<Integer> arrayList0 = SIEVE.sieve(integer0);
      Integer integer1 = new Integer(2);
      boolean boolean0 = arrayList0.add(integer1);
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp((-1), arrayList0);
      assertEquals(1, arrayList0.size());
      assertFalse(arrayList1.contains(boolean0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(27);
      ArrayList<Integer> arrayList0 = SIEVE.sieve(integer0);
      assertFalse(arrayList0.contains(27));
      assertEquals(9, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        SIEVE.sieve((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("correct_java_programs.SIEVE", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ArrayList<Integer> arrayList0 = SIEVE.sieve(integer0);
      arrayList0.add((Integer) null);
      // Undeclared exception!
      try { 
        SIEVE.list_comp((-1), arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        SIEVE.list_comp(0, arrayList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Boolean> arrayList0 = new ArrayList<Boolean>();
      arrayList0.add((Boolean) null);
      // Undeclared exception!
      try { 
        SIEVE.any(arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("correct_java_programs.SIEVE", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        SIEVE.all((ArrayList<Boolean>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("correct_java_programs.SIEVE", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer((-4436));
      ArrayList<Integer> arrayList0 = SIEVE.sieve(integer0);
      boolean boolean0 = arrayList0.add(integer0);
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp(162, arrayList0);
      assertTrue(arrayList1.contains(boolean0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ArrayList<Integer> arrayList0 = SIEVE.sieve(integer0);
      Integer integer1 = new Integer(2);
      arrayList0.add(integer1);
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp(0, arrayList0);
      boolean boolean0 = SIEVE.all(arrayList1);
      assertEquals(1, arrayList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp(1315, arrayList0);
      Boolean boolean0 = Boolean.valueOf(true);
      arrayList1.add(boolean0);
      boolean boolean1 = SIEVE.all(arrayList1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ArrayList<Integer> arrayList0 = SIEVE.sieve(integer0);
      Integer integer1 = new Integer(2);
      arrayList0.add(integer1);
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp(0, arrayList0);
      boolean boolean0 = SIEVE.any(arrayList1);
      assertEquals(1, arrayList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp(1315, arrayList0);
      Boolean boolean0 = Boolean.valueOf(true);
      arrayList1.add(boolean0);
      boolean boolean1 = SIEVE.any(arrayList1);
      assertEquals(0, arrayList0.size());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(1746);
      // Undeclared exception!
      SIEVE.sieve(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SIEVE sIEVE0 = new SIEVE();
  }
}
