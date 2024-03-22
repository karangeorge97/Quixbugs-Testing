package correct_java_programs.find_first_in_sorted;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop_FIND_FIRST_IN_SORTED_Regression11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5501");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5502");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5503");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5504");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5505");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5506");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5507");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5508");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5509");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5510");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5511");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5512");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5513");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int34 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass35 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5514");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5515");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5516");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5517");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5518");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5519");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5520");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5521");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5522");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5523");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5524");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5525");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5526");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5527");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5528");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5529");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 0);
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int27 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        int int29 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass30 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5530");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5531");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5532");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5533");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5534");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5535");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5536");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5537");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5538");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5539");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5540");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5541");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5542");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5543");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5544");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5545");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5546");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5547");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int34 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int36 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int38 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5548");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5549");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5550");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5551");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5552");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5553");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5554");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5555");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5556");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) -1);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5557");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5558");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5559");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5560");
        int[] intArray2 = new int[] { 1, (-1) };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5561");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass33 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5562");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5563");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5564");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5565");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5566");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5567");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5568");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass31 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5569");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5570");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 0);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5571");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5572");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5573");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5574");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5575");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5576");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5577");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5578");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5579");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5580");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5581");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5582");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5583");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        java.lang.Class<?> wildcardClass29 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5584");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5585");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5586");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5587");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) -1);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5588");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        java.lang.Class<?> wildcardClass31 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5589");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5590");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5591");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5592");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5593");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5594");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5595");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5596");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5597");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5598");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5599");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5600");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5601");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5602");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5603");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5604");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5605");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5606");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5607");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int34 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5608");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '4');
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5609");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5610");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5611");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5612");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5613");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5614");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5615");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5616");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5617");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5618");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5619");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5620");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass29 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5621");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5622");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5623");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5624");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5625");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5626");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5627");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5628");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5629");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5630");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5631");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5632");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5633");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5634");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5635");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5636");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5637");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5638");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5639");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5640");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5641");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5642");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5643");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5644");
        int[] intArray2 = new int[] { 1, (-1) };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5645");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        java.lang.Class<?> wildcardClass33 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5646");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5647");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '4');
        int int27 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int29 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5648");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5649");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5650");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) -1);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5651");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5652");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '#');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5653");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5654");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5655");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5656");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int27 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5657");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5658");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5659");
        int[] intArray3 = new int[] { (short) 100, 3, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 3, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5660");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '4');
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5661");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) -1);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5662");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5663");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5664");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5665");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5666");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5667");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5668");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5669");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '4');
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        int int27 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5670");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5671");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5672");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5673");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '#');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5674");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5675");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5676");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5677");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5678");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5679");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5680");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5681");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5682");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5683");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5684");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5685");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5686");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        java.lang.Class<?> wildcardClass31 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5687");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5688");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5689");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5690");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int34 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5691");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_FIND_FIRST_IN_SORTED_Regression11.test5692");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }
}

