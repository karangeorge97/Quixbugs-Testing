package java_programs.bucketsort;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop_BUCKETSORT_Buggy_Regression9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4501");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 1);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4502");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4503");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 1);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 10);
        java.lang.Class<?> wildcardClass24 = intList23.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4504");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4505");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, 0);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = intList25.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4506");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 0);
        java.lang.Class<?> wildcardClass30 = intList29.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4507");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, 10);
        java.lang.Class<?> wildcardClass20 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4508");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4509");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = intList21.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4510");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList17, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, 10);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 1);
        java.lang.Class<?> wildcardClass30 = intList29.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4511");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4512");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 1);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, 10);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList23, 10);
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList29, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList33 = java_programs.BUCKETSORT.bucketsort(intList31, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4513");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 10);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4514");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 10);
        java.lang.Class<?> wildcardClass26 = intList25.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4515");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList11, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4516");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4517");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList19, 0);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4518");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4519");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4520");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4521");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) 'a');
        java.lang.Class<?> wildcardClass28 = intList27.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4522");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, 10);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList21, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList33 = java_programs.BUCKETSORT.bucketsort(intList31, 10);
        java.util.ArrayList<java.lang.Integer> intList35 = java_programs.BUCKETSORT.bucketsort(intList33, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertNotNull(intList35);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4523");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, 0);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, 1);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, 10);
        java.lang.Class<?> wildcardClass26 = intList23.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4524");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = intList19.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4525");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList27, 0);
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList29, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList33 = java_programs.BUCKETSORT.bucketsort(intList31, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4526");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4527");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4528");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.lang.Class<?> wildcardClass30 = intList29.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4529");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList17, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList27, 0);
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList27, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4530");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList11, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4531");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4532");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 0);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, 1);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4533");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 0);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4534");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4535");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList13, 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList13, 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList13, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList13, (int) 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4536");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, 10);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4537");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4538");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4539");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList19, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList29, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList33 = java_programs.BUCKETSORT.bucketsort(intList29, (int) (byte) 10);
        java.lang.Class<?> wildcardClass34 = intList29.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4540");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4541");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 0);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4542");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList25, 100);
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4543");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4544");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList25, 100);
        java.util.ArrayList<java.lang.Integer> intList33 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList35 = java_programs.BUCKETSORT.bucketsort(intList33, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList37 = java_programs.BUCKETSORT.bucketsort(intList33, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList39 = java_programs.BUCKETSORT.bucketsort(intList37, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList41 = java_programs.BUCKETSORT.bucketsort(intList39, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList43 = java_programs.BUCKETSORT.bucketsort(intList39, 1);
        java.util.ArrayList<java.lang.Integer> intList45 = java_programs.BUCKETSORT.bucketsort(intList43, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList47 = java_programs.BUCKETSORT.bucketsort(intList43, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertNotNull(intList35);
        org.junit.Assert.assertNotNull(intList37);
        org.junit.Assert.assertNotNull(intList39);
        org.junit.Assert.assertNotNull(intList41);
        org.junit.Assert.assertNotNull(intList43);
        org.junit.Assert.assertNotNull(intList45);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4545");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4546");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList25, 10);
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList25, 100);
        java.util.ArrayList<java.lang.Integer> intList33 = java_programs.BUCKETSORT.bucketsort(intList31, (int) 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4547");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, 1);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4548");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 0);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4549");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = intList21.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4550");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 1);
        java.lang.Class<?> wildcardClass22 = intList21.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4551");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4552");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, 100);
        java.lang.Class<?> wildcardClass20 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4553");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList27, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4554");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4555");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList17, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4556");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList27, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList27, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList33 = java_programs.BUCKETSORT.bucketsort(intList27, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList35 = java_programs.BUCKETSORT.bucketsort(intList33, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertNotNull(intList35);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4557");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 1);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, 10);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList23, 10);
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList29, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList33 = java_programs.BUCKETSORT.bucketsort(intList29, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList35 = java_programs.BUCKETSORT.bucketsort(intList29, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertNotNull(intList35);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4558");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4559");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = intList23.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4560");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList13, 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList13, 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList13, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4561");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4562");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 0);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) 'a');
        java.lang.Class<?> wildcardClass20 = intList19.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4563");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList33 = java_programs.BUCKETSORT.bucketsort(intList31, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList35 = java_programs.BUCKETSORT.bucketsort(intList33, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList37 = java_programs.BUCKETSORT.bucketsort(intList35, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertNotNull(intList35);
        org.junit.Assert.assertNotNull(intList37);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4564");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) '4');
        java.lang.Class<?> wildcardClass26 = intList23.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4565");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList7, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4566");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 1);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, 1);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4567");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, 0);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = intList23.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4568");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4569");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList13, 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList13, 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList13, 0);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4570");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4571");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4572");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList13, 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4573");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList23, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList27, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList27, 0);
        java.util.ArrayList<java.lang.Integer> intList33 = java_programs.BUCKETSORT.bucketsort(intList31, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList35 = java_programs.BUCKETSORT.bucketsort(intList31, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertNotNull(intList35);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4574");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = intList19.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4575");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4576");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, 10);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, 0);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList27, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4577");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, (int) 'a');
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4578");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList13, 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList13, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4579");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) ' ');
        java.lang.Class<?> wildcardClass24 = intList23.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4580");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4581");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList23, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList27, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList27, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList33 = java_programs.BUCKETSORT.bucketsort(intList27, 100);
        java.util.ArrayList<java.lang.Integer> intList35 = java_programs.BUCKETSORT.bucketsort(intList33, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList37 = java_programs.BUCKETSORT.bucketsort(intList35, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertNotNull(intList35);
        org.junit.Assert.assertNotNull(intList37);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4582");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList19, 1);
        java.lang.Class<?> wildcardClass24 = intList19.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4583");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, 10);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList17, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4584");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4585");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '#');
        java.lang.Class<?> wildcardClass20 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4586");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, 1);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, 10);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList23, 10);
        java.util.ArrayList<java.lang.Integer> intList31 = java_programs.BUCKETSORT.bucketsort(intList29, (int) (short) 0);
        java.lang.Class<?> wildcardClass32 = intList31.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4587");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 0);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, 1);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4588");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4589");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4590");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, 10);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, 0);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, 1);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4591");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = intList19.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4592");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, 1);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList29 = java_programs.BUCKETSORT.bucketsort(intList25, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4593");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList15, 10);
        java.lang.Class<?> wildcardClass20 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4594");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_BUCKETSORT_Buggy_Regression9.test4595");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, 1);
        java.util.ArrayList<java.lang.Integer> intList23 = java_programs.BUCKETSORT.bucketsort(intList21, 0);
        java.util.ArrayList<java.lang.Integer> intList25 = java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList27 = java_programs.BUCKETSORT.bucketsort(intList21, 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }
}

