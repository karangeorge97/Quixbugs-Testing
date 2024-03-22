package correct_java_programs.knapsack;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop_KNAPSACK_Regression10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5001");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5002");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(30, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5003");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(52, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5004");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(52, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack(52, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray28);
        java.lang.Class<?> wildcardClass43 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5005");
        int[] intArray7 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray8 = new int[][] { intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        int int10 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray8);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray8);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5006");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5007");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5008");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack(30, intArray28);
        java.lang.Class<?> wildcardClass43 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5009");
        int[] intArray11 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[] intArray17 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[] intArray23 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[][] intArray24 = new int[][] { intArray11, intArray17, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 30 + "'", int25 == 30);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 30 + "'", int26 == 30);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30 + "'", int27 == 30);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 30 + "'", int28 == 30);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 30 + "'", int30 == 30);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5010");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5011");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5012");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5013");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5014");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5015");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5016");
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray26 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        java.lang.Class<?> wildcardClass41 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5017");
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray27 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5018");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5019");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5020");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5021");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5022");
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray24 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5023");
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray24 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5024");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5025");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.KNAPSACK.knapsack((-1), intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5026");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(1, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        java.lang.Class<?> wildcardClass41 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5027");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5028");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5029");
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray26 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5030");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5031");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5032");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5033");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5034");
        int[] intArray8 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[] intArray14 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[] intArray20 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[][] intArray21 = new int[][] { intArray8, intArray14, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        java.lang.Class<?> wildcardClass25 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30 + "'", int22 == 30);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 30 + "'", int23 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5035");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5036");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5037");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5038");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5039");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5040");
        int[] intArray11 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray12 = new int[][] { intArray11 };
        int int13 = correct_java_programs.KNAPSACK.knapsack(0, intArray12);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray12);
        int int15 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray12);
        int int16 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray12);
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray12);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray12);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray12);
        java.lang.Class<?> wildcardClass20 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5041");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5042");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5043");
        int[][] intArray5 = new int[][] {};
        int int6 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray5);
        int int7 = correct_java_programs.KNAPSACK.knapsack(0, intArray5);
        int int8 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray5);
        int int9 = correct_java_programs.KNAPSACK.knapsack(30, intArray5);
        int int10 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray5);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5044");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5045");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5046");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5047");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((-1), intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5048");
        int[] intArray13 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray14 = new int[][] { intArray13 };
        int int15 = correct_java_programs.KNAPSACK.knapsack(0, intArray14);
        int int16 = correct_java_programs.KNAPSACK.knapsack(0, intArray14);
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray14);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray14);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray14);
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray14);
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray14);
        int int22 = correct_java_programs.KNAPSACK.knapsack(10, intArray14);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray14);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5049");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5050");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5051");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5052");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5053");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5054");
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray29);
        java.lang.Class<?> wildcardClass45 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5055");
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray22 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5056");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5057");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(30, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((-1), intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5058");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5059");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(52, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5060");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5061");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5062");
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray25 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5063");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5064");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5065");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5066");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5067");
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray25 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5068");
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray22 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5069");
        int[] intArray9 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray10 = new int[][] { intArray9 };
        int int11 = correct_java_programs.KNAPSACK.knapsack(0, intArray10);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray10);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray10);
        int int14 = correct_java_programs.KNAPSACK.knapsack(30, intArray10);
        int int15 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5070");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5071");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5072");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5073");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(100, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray18);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5074");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(52, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5075");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5076");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5077");
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack(1, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack(100, intArray29);
        java.lang.Class<?> wildcardClass45 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5078");
        int[] intArray18 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray19 = new int[][] { intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(30, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(52, intArray19);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray19);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray19);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray19);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray19);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5079");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5080");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5081");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5082");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5083");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5084");
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray28 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack(1, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack(100, intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack(30, intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5085");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5086");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5087");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5088");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5089");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5090");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5091");
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack(1, intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray29);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5092");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5093");
        int[] intArray9 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray10 = new int[][] { intArray9 };
        int int11 = correct_java_programs.KNAPSACK.knapsack(0, intArray10);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray10);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray10);
        int int14 = correct_java_programs.KNAPSACK.knapsack(30, intArray10);
        int int15 = correct_java_programs.KNAPSACK.knapsack(0, intArray10);
        java.lang.Class<?> wildcardClass16 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5094");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5095");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5096");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5097");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(1, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5098");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5099");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5100");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5101");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5102");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5103");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5104");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5105");
        int[] intArray13 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray14 = new int[][] { intArray13 };
        int int15 = correct_java_programs.KNAPSACK.knapsack(0, intArray14);
        int int16 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray14);
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray14);
        int int18 = correct_java_programs.KNAPSACK.knapsack(30, intArray14);
        int int19 = correct_java_programs.KNAPSACK.knapsack(52, intArray14);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray14);
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray14);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray14);
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray14);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5106");
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray24 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5107");
        int[][] intArray5 = new int[][] {};
        int int6 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray5);
        int int7 = correct_java_programs.KNAPSACK.knapsack(0, intArray5);
        int int8 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray5);
        int int9 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray5);
        int int10 = correct_java_programs.KNAPSACK.knapsack(30, intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5108");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5109");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5110");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5111");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5112");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5113");
        int[] intArray10 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray11 = new int[][] { intArray10 };
        int int12 = correct_java_programs.KNAPSACK.knapsack(0, intArray11);
        int int13 = correct_java_programs.KNAPSACK.knapsack(0, intArray11);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray11);
        int int15 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray11);
        int int16 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray11);
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray11);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5114");
        int[] intArray9 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray10 = new int[][] { intArray9 };
        int int11 = correct_java_programs.KNAPSACK.knapsack(0, intArray10);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray10);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray10);
        int int14 = correct_java_programs.KNAPSACK.knapsack(30, intArray10);
        int int15 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray10);
        java.lang.Class<?> wildcardClass16 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5115");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(52, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_KNAPSACK_Regression10.test5116");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }
}

