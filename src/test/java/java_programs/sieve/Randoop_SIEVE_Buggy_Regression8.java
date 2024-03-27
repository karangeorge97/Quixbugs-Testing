package java_programs.sieve;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop_SIEVE_Buggy_Regression8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4001");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4002");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '4', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((-1), intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 0, intList14);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4003");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4004");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4005");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass8 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4006");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = java_programs.SIEVE.any(booleanList11);
        boolean boolean16 = java_programs.SIEVE.any(booleanList11);
        boolean boolean17 = java_programs.SIEVE.any(booleanList11);
        boolean boolean18 = java_programs.SIEVE.all(booleanList11);
        boolean boolean19 = java_programs.SIEVE.any(booleanList11);
        boolean boolean20 = java_programs.SIEVE.all(booleanList11);
        boolean boolean21 = java_programs.SIEVE.all(booleanList11);
        boolean boolean22 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4007");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 100, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4008");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4009");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4010");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4011");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4012");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4013");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        java.lang.Class<?> wildcardClass17 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4014");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass5 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4015");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4016");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4017");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4018");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '4', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4019");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = java_programs.SIEVE.any(booleanList19);
        java.lang.Class<?> wildcardClass22 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4020");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(10, intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4021");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4022");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4023");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = java_programs.SIEVE.any(booleanList9);
        boolean boolean14 = java_programs.SIEVE.any(booleanList9);
        boolean boolean15 = java_programs.SIEVE.all(booleanList9);
        boolean boolean16 = java_programs.SIEVE.any(booleanList9);
        boolean boolean17 = java_programs.SIEVE.all(booleanList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4024");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4025");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(1, intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4026");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass8 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4027");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = java_programs.SIEVE.any(booleanList11);
        boolean boolean16 = java_programs.SIEVE.any(booleanList11);
        boolean boolean17 = java_programs.SIEVE.any(booleanList11);
        boolean boolean18 = java_programs.SIEVE.all(booleanList11);
        boolean boolean19 = java_programs.SIEVE.any(booleanList11);
        boolean boolean20 = java_programs.SIEVE.all(booleanList11);
        boolean boolean21 = java_programs.SIEVE.all(booleanList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4028");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4029");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4030");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4031");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4032");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((-1), intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        boolean boolean23 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4033");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4034");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = java_programs.SIEVE.any(booleanList3);
        boolean boolean9 = java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4035");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4036");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4037");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass13 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4038");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '4', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(100, intList13);
        boolean boolean22 = java_programs.SIEVE.all(booleanList21);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4039");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4040");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4041");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4042");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4043");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '4', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(10, intList14);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4044");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '4', intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4045");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4046");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4047");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4048");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4049");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.lang.Class<?> wildcardClass22 = booleanList21.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4050");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4051");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4052");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((-1), intList12);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4053");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        java.util.ArrayList<java.lang.Boolean> booleanList3 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = java_programs.SIEVE.all(booleanList3);
        boolean boolean9 = java_programs.SIEVE.all(booleanList3);
        boolean boolean10 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass11 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4054");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4055");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4056");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = java_programs.SIEVE.all(booleanList15);
        java.lang.Class<?> wildcardClass18 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4057");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = java_programs.SIEVE.all(booleanList13);
        java.lang.Class<?> wildcardClass16 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4058");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4059");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(10, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4060");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4061");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4062");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) ' ', intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass12 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4063");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        boolean boolean22 = java_programs.SIEVE.all(booleanList21);
        boolean boolean23 = java_programs.SIEVE.all(booleanList21);
        java.lang.Class<?> wildcardClass24 = booleanList21.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4064");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4065");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.all(booleanList15);
        boolean boolean18 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4066");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4067");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(1, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4068");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4069");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4070");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4071");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass10 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4072");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4073");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4074");
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.lang.Class<?> wildcardClass26 = booleanList25.getClass();
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4075");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4076");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '4', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) '4', intList14);
        boolean boolean24 = java_programs.SIEVE.any(booleanList23);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4077");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4078");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass12 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4079");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4080");
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((-1), intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '4', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) '#', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp((int) (byte) 100, intList14);
        boolean boolean28 = java_programs.SIEVE.all(booleanList27);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4081");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4082");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = java_programs.SIEVE.any(booleanList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4083");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        boolean boolean20 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4084");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4085");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4086");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.lang.Class<?> wildcardClass22 = booleanList21.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4087");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4088");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4089");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4090");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4091");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        java.lang.Class<?> wildcardClass19 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4092");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4093");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4094");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(10, intList12);
        boolean boolean24 = java_programs.SIEVE.any(booleanList23);
        boolean boolean25 = java_programs.SIEVE.all(booleanList23);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4095");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4096");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4097");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.lang.Class<?> wildcardClass18 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4098");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4099");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '4', intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        boolean boolean20 = java_programs.SIEVE.any(booleanList17);
        boolean boolean21 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4100");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4101");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4102");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(100, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4103");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4104");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4105");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '4', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(1, intList13);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4106");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '4', intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4107");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4108");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4109");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4110");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4111");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        java.lang.Class<?> wildcardClass20 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4112");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4113");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4114");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(100, intList12);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4115");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4116");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        java.lang.Class<?> wildcardClass19 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4117");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4118");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4119");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4120");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        boolean boolean22 = java_programs.SIEVE.all(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4121");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((-1), intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((-1), intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(10, intList12);
        boolean boolean24 = java_programs.SIEVE.any(booleanList23);
        boolean boolean25 = java_programs.SIEVE.any(booleanList23);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4122");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4123");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = java_programs.SIEVE.all(booleanList9);
        boolean boolean14 = java_programs.SIEVE.all(booleanList9);
        boolean boolean15 = java_programs.SIEVE.all(booleanList9);
        boolean boolean16 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass17 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4124");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) ' ', intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4125");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4126");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(100, intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        boolean boolean21 = java_programs.SIEVE.all(booleanList19);
        boolean boolean22 = java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4127");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4128");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4129");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4130");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(10, intList12);
        boolean boolean24 = java_programs.SIEVE.any(booleanList23);
        boolean boolean25 = java_programs.SIEVE.any(booleanList23);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4131");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((-1), intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((-1), intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        boolean boolean24 = java_programs.SIEVE.all(booleanList23);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4132");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4133");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4134");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4135");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4136");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4137");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4138");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(100, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4139");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        boolean boolean21 = java_programs.SIEVE.any(booleanList19);
        java.lang.Class<?> wildcardClass22 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4140");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4141");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '4', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4142");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4143");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4144");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.all(booleanList15);
        boolean boolean18 = java_programs.SIEVE.all(booleanList15);
        boolean boolean19 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4145");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass8 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4146");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4147");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((-1), intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4148");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4149");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4150");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4151");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4152");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) ' ', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((-1), intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4153");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) -1, intList2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4154");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '4', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) '#', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) 1, intList14);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4155");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4156");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4157");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4158");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = java_programs.SIEVE.all(booleanList7);
        boolean boolean13 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass14 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4159");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4160");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(100, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4161");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        boolean boolean23 = java_programs.SIEVE.all(booleanList21);
        boolean boolean24 = java_programs.SIEVE.any(booleanList21);
        boolean boolean25 = java_programs.SIEVE.any(booleanList21);
        boolean boolean26 = java_programs.SIEVE.all(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4162");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4163");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((-1), intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.lang.Class<?> wildcardClass22 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4164");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4165");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((-1), intList4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4166");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = java_programs.SIEVE.all(booleanList17);
        boolean boolean20 = java_programs.SIEVE.all(booleanList17);
        boolean boolean21 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4167");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4168");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4169");
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((-1), intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp(0, intList13);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4170");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        java.lang.Class<?> wildcardClass17 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4171");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        java.lang.Class<?> wildcardClass15 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4172");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(10, intList11);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4173");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((-1), intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(0, intList12);
        boolean boolean24 = java_programs.SIEVE.all(booleanList23);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4174");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList5);
        boolean boolean11 = java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4175");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4176");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(10, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4177");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        boolean boolean22 = java_programs.SIEVE.all(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4178");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4179");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass9 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4180");
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '#', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (byte) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((int) (byte) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp(100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = java_programs.SIEVE.list_comp((int) (byte) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = java_programs.SIEVE.list_comp(10, intList15);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertNotNull(booleanList28);
        org.junit.Assert.assertNotNull(booleanList29);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4181");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.lang.Class<?> wildcardClass18 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4182");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass16 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4183");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = java_programs.SIEVE.any(booleanList9);
        boolean boolean14 = java_programs.SIEVE.any(booleanList9);
        boolean boolean15 = java_programs.SIEVE.all(booleanList9);
        boolean boolean16 = java_programs.SIEVE.any(booleanList9);
        boolean boolean17 = java_programs.SIEVE.all(booleanList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4184");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4185");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4186");
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) '4', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4187");
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp(100, intList13);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4188");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        boolean boolean22 = java_programs.SIEVE.all(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4189");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4190");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4191");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4192");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4193");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        java.lang.Class<?> wildcardClass17 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4194");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        boolean boolean20 = java_programs.SIEVE.all(booleanList17);
        java.lang.Class<?> wildcardClass21 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4195");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4196");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4197");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4198");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        boolean boolean21 = java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4199");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4200");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass10 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4201");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4202");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '4', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(100, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4203");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4204");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4205");
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4206");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4207");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '#', intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        boolean boolean21 = java_programs.SIEVE.all(booleanList19);
        java.lang.Class<?> wildcardClass22 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4208");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = java_programs.SIEVE.all(booleanList3);
        boolean boolean9 = java_programs.SIEVE.all(booleanList3);
        boolean boolean10 = java_programs.SIEVE.any(booleanList3);
        boolean boolean11 = java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4209");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4210");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) ' ', intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4211");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((-1), intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) ' ', intList13);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4212");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4213");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4214");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4215");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4216");
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '#', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) '#', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (short) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (short) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp((int) (short) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = java_programs.SIEVE.list_comp((int) (byte) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = java_programs.SIEVE.list_comp((int) 'a', intList15);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertNotNull(booleanList28);
        org.junit.Assert.assertNotNull(booleanList29);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4217");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        java.util.ArrayList<java.lang.Boolean> booleanList3 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = java_programs.SIEVE.any(booleanList3);
        boolean boolean9 = java_programs.SIEVE.any(booleanList3);
        boolean boolean10 = java_programs.SIEVE.all(booleanList3);
        boolean boolean11 = java_programs.SIEVE.all(booleanList3);
        boolean boolean12 = java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4218");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = java_programs.SIEVE.all(booleanList19);
        boolean boolean22 = java_programs.SIEVE.all(booleanList19);
        java.lang.Class<?> wildcardClass23 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4219");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((-1), intList11);
        java.lang.Class<?> wildcardClass22 = booleanList21.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4220");
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (byte) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((-1), intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp(0, intList14);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4221");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4222");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4223");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4224");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((-1), intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        boolean boolean24 = java_programs.SIEVE.all(booleanList23);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4225");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 100, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass9 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4226");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        boolean boolean20 = java_programs.SIEVE.any(booleanList17);
        boolean boolean21 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4227");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = java_programs.SIEVE.all(booleanList7);
        boolean boolean13 = java_programs.SIEVE.any(booleanList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList7);
        boolean boolean15 = java_programs.SIEVE.any(booleanList7);
        boolean boolean16 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass17 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4228");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4229");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4230");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4231");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '#', intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass9 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4232");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(100, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4233");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4234");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4235");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        boolean boolean21 = java_programs.SIEVE.any(booleanList19);
        java.lang.Class<?> wildcardClass22 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4236");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4237");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(0, intList11);
        boolean boolean22 = java_programs.SIEVE.all(booleanList21);
        boolean boolean23 = java_programs.SIEVE.any(booleanList21);
        java.lang.Class<?> wildcardClass24 = booleanList21.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4238");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4239");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4240");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4241");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '4', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '4', intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4242");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '#', intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4243");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4244");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4245");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = java_programs.SIEVE.any(booleanList19);
        boolean boolean22 = java_programs.SIEVE.all(booleanList19);
        boolean boolean23 = java_programs.SIEVE.all(booleanList19);
        boolean boolean24 = java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4246");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4247");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4248");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = java_programs.SIEVE.any(booleanList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList7);
        boolean boolean15 = java_programs.SIEVE.all(booleanList7);
        boolean boolean16 = java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4249");
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((-1), intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (byte) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((-1), intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (byte) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((int) '#', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp((-1), intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = java_programs.SIEVE.list_comp((int) (short) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = java_programs.SIEVE.list_comp((int) '4', intList15);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertNotNull(booleanList28);
        org.junit.Assert.assertNotNull(booleanList29);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4250");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) '#', intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4251");
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((-1), intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) '4', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) '4', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((-1), intList13);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4252");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4253");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass12 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4254");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4255");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = java_programs.SIEVE.all(booleanList19);
        boolean boolean22 = java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4256");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4257");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4258");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4259");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        boolean boolean21 = java_programs.SIEVE.any(booleanList19);
        boolean boolean22 = java_programs.SIEVE.any(booleanList19);
        boolean boolean23 = java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4260");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4261");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4262");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(1, intList12);
        boolean boolean24 = java_programs.SIEVE.any(booleanList23);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4263");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(10, intList11);
        java.lang.Class<?> wildcardClass22 = intList11.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4264");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4265");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((-1), intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4266");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        java.lang.Class<?> wildcardClass17 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4267");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4268");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4269");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4270");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4271");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4272");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4273");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4274");
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) ' ', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((-1), intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((-1), intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp((int) (byte) 100, intList14);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4275");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4276");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4277");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4278");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.lang.Class<?> wildcardClass24 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4279");
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (byte) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((-1), intList13);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4280");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(100, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.all(booleanList15);
        java.lang.Class<?> wildcardClass18 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4281");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(0, intList12);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4282");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4283");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4284");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass17 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4285");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4286");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((-1), intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        boolean boolean24 = java_programs.SIEVE.all(booleanList23);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4287");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4288");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4289");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4290");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.lang.Class<?> wildcardClass22 = intList11.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4291");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4292");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4293");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4294");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '4', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        boolean boolean23 = java_programs.SIEVE.all(booleanList21);
        boolean boolean24 = java_programs.SIEVE.all(booleanList21);
        boolean boolean25 = java_programs.SIEVE.all(booleanList21);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4295");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4296");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4297");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4298");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4299");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4300");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) '#', intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4301");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4302");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4303");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4304");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4305");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4306");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4307");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((-1), intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4308");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '#', intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4309");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4310");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.all(booleanList17);
        java.lang.Class<?> wildcardClass20 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4311");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((-1), intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '4', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((-1), intList13);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4312");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((-1), intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass9 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4313");
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) ' ', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (short) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4314");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        java.lang.Class<?> wildcardClass19 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4315");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4316");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4317");
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((-1), intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((-1), intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) '#', intList13);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4318");
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((-1), intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp((int) (short) 1, intList14);
        java.lang.Class<?> wildcardClass28 = booleanList27.getClass();
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4319");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4320");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4321");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4322");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4323");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) 'a', intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '4', intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 10, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) 'a', intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) -1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (short) 1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (byte) 10, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((int) 'a', intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp((int) (byte) 100, intList16);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4324");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4325");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = java_programs.SIEVE.all(booleanList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList7);
        boolean boolean15 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass16 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4326");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4327");
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4328");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4329");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4330");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4331");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((-1), intList12);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4332");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 100, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass8 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4333");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4334");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4335");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4336");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4337");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4338");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4339");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4340");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4341");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4342");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4343");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4344");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) ' ', intList4);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4345");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4346");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4347");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4348");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((-1), intList12);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4349");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4350");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(10, intList11);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4351");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4352");
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '#', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) ' ', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp(1, intList14);
        java.lang.Class<?> wildcardClass28 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4353");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4354");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '4', intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4355");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4356");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(1, intList12);
        boolean boolean24 = java_programs.SIEVE.all(booleanList23);
        java.lang.Class<?> wildcardClass25 = booleanList23.getClass();
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4357");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        java.lang.Class<?> wildcardClass17 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4358");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4359");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4360");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        boolean boolean21 = java_programs.SIEVE.all(booleanList19);
        boolean boolean22 = java_programs.SIEVE.all(booleanList19);
        java.lang.Class<?> wildcardClass23 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4361");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        java.lang.Class<?> wildcardClass17 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4362");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '#', intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4363");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        boolean boolean24 = java_programs.SIEVE.any(booleanList23);
        boolean boolean25 = java_programs.SIEVE.all(booleanList23);
        boolean boolean26 = java_programs.SIEVE.any(booleanList23);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4364");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4365");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4366");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4367");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4368");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4369");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4370");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4371");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4372");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4373");
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((-1), intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((-1), intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (byte) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (byte) 100, intList13);
        boolean boolean26 = java_programs.SIEVE.all(booleanList25);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4374");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4375");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4376");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((-1), intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4377");
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) '#', intList13);
        boolean boolean26 = java_programs.SIEVE.any(booleanList25);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4378");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4379");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4380");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4381");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = java_programs.SIEVE.any(booleanList11);
        boolean boolean16 = java_programs.SIEVE.all(booleanList11);
        boolean boolean17 = java_programs.SIEVE.all(booleanList11);
        boolean boolean18 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4382");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.all(booleanList15);
        boolean boolean18 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4383");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = java_programs.SIEVE.any(booleanList15);
        java.lang.Class<?> wildcardClass18 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4384");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4385");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4386");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4387");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4388");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4389");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(1, intList12);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4390");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(10, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        java.lang.Class<?> wildcardClass21 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4391");
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4392");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = java_programs.SIEVE.all(booleanList19);
        java.lang.Class<?> wildcardClass22 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4393");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4394");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4395");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) -1, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4396");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = java_programs.SIEVE.all(booleanList2);
        boolean boolean6 = java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = java_programs.SIEVE.any(booleanList2);
        boolean boolean9 = java_programs.SIEVE.all(booleanList2);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4397");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4398");
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) ' ', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (byte) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp(1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((int) (short) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp(1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = java_programs.SIEVE.list_comp((int) (short) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = java_programs.SIEVE.list_comp(0, intList15);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertNotNull(booleanList28);
        org.junit.Assert.assertNotNull(booleanList29);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4399");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4400");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4401");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4402");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4403");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = java_programs.SIEVE.any(booleanList3);
        boolean boolean9 = java_programs.SIEVE.any(booleanList3);
        boolean boolean10 = java_programs.SIEVE.any(booleanList3);
        boolean boolean11 = java_programs.SIEVE.all(booleanList3);
        boolean boolean12 = java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4404");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(100, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4405");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4406");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4407");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = java_programs.SIEVE.any(booleanList3);
        boolean boolean9 = java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4408");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass15 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4409");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4410");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4411");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) -1, intList2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4412");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((-1), intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4413");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4414");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        boolean boolean24 = java_programs.SIEVE.all(booleanList23);
        boolean boolean25 = java_programs.SIEVE.all(booleanList23);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4415");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4416");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = java_programs.SIEVE.all(booleanList7);
        boolean boolean13 = java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4417");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '4', intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4418");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList9);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4419");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.lang.Class<?> wildcardClass24 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4420");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4421");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4422");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4423");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4424");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4425");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4426");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList5);
        boolean boolean11 = java_programs.SIEVE.all(booleanList5);
        boolean boolean12 = java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4427");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4428");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4429");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4430");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(0, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4431");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        boolean boolean23 = java_programs.SIEVE.all(booleanList21);
        boolean boolean24 = java_programs.SIEVE.any(booleanList21);
        boolean boolean25 = java_programs.SIEVE.all(booleanList21);
        boolean boolean26 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4432");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4433");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '4', intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4434");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(100, intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        boolean boolean23 = java_programs.SIEVE.all(booleanList21);
        boolean boolean24 = java_programs.SIEVE.any(booleanList21);
        boolean boolean25 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4435");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4436");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        boolean boolean20 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4437");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        java.lang.Class<?> wildcardClass19 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4438");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4439");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4440");
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '4', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (byte) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp(10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((int) (byte) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp((-1), intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = java_programs.SIEVE.list_comp((int) (byte) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = java_programs.SIEVE.list_comp(0, intList15);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertNotNull(booleanList28);
        org.junit.Assert.assertNotNull(booleanList29);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4441");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = java_programs.SIEVE.all(booleanList17);
        boolean boolean20 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4442");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4443");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4444");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = java_programs.SIEVE.any(booleanList13);
        boolean boolean17 = java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass18 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4445");
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '#', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp((int) (byte) 100, intList14);
        boolean boolean28 = java_programs.SIEVE.any(booleanList27);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4446");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4447");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4448");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4449");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4450");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        boolean boolean22 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4451");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(0, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4452");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4453");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4454");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(100, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4455");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4456");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4457");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4458");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '4', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp(0, intList14);
        boolean boolean24 = java_programs.SIEVE.all(booleanList23);
        boolean boolean25 = java_programs.SIEVE.all(booleanList23);
        java.lang.Class<?> wildcardClass26 = booleanList23.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4459");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(100, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4460");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4461");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4462");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.lang.Class<?> wildcardClass24 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4463");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(100, intList3);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4464");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4465");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(1, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4466");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4467");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass9 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4468");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4469");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4470");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass15 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4471");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4472");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(100, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4473");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '4', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(10, intList13);
        boolean boolean22 = java_programs.SIEVE.all(booleanList21);
        boolean boolean23 = java_programs.SIEVE.all(booleanList21);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4474");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        boolean boolean20 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4475");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(10, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4476");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '4', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp(10, intList13);
        boolean boolean22 = java_programs.SIEVE.all(booleanList21);
        boolean boolean23 = java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4477");
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) '#', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) (byte) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp(1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp((int) '#', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = java_programs.SIEVE.list_comp((int) 'a', intList15);
        boolean boolean30 = java_programs.SIEVE.any(booleanList29);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertNotNull(booleanList28);
        org.junit.Assert.assertNotNull(booleanList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4478");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4479");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4480");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList8);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4481");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4482");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4483");
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '#', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp((int) '#', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((-1), intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = java_programs.SIEVE.list_comp((int) '4', intList14);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4484");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4485");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4486");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(100, intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4487");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4488");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4489");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4490");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4491");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass9 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4492");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((-1), intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4493");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4494");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(100, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4495");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4496");
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = java_programs.SIEVE.list_comp((int) 'a', intList13);
        boolean boolean26 = java_programs.SIEVE.all(booleanList25);
        boolean boolean27 = java_programs.SIEVE.all(booleanList25);
        java.lang.Class<?> wildcardClass28 = booleanList25.getClass();
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4497");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4498");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4499");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Buggy_Regression8.test4500");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }
}

