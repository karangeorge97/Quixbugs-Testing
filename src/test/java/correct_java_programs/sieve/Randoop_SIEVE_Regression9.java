package correct_java_programs.sieve;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop_SIEVE_Regression9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4501");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4502");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4503");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4504");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4505");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
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
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4506");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) '#', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass16 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4507");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass17 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4508");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
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
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4509");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
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
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4510");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList8);
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
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4511");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
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
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4512");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp(100, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4513");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
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
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4514");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp(1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) '#', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4515");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4516");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4517");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4518");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList14);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList14);
        java.lang.Class<?> wildcardClass17 = booleanList14.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4519");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(0, intList14);
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
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4520");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4521");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4522");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4523");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4524");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList11);
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
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4525");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList17);
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
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4526");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
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
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4527");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4528");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList9);
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
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4529");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
        boolean boolean21 = correct_java_programs.SIEVE.any(booleanList19);
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
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4530");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList9);
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
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4531");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((-1), intList11);
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
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4532");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
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
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4533");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(100, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4534");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4535");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4536");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4537");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4538");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList13);
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
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4539");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4540");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList8);
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
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4541");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass17 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4542");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4543");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4544");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4545");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4546");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
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
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4547");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass15 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4548");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(100, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4549");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList10);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList10);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList10);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList10);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4550");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList11);
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
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4551");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
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
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4552");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4553");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList11);
        boolean boolean22 = correct_java_programs.SIEVE.all(booleanList21);
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
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4554");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4555");
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp(100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList15);
        java.lang.Class<?> wildcardClass30 = intList15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4556");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        boolean boolean22 = correct_java_programs.SIEVE.any(booleanList21);
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
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4557");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(100, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4558");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((-1), intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4559");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
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
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4560");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList2);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4561");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4562");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(1, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList17);
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
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4563");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4564");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4565");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4566");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
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
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4567");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4568");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList8);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList8);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4569");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList13);
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
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4570");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList11);
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
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4571");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList10);
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
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4572");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList11);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4573");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
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
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4574");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4575");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4576");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4577");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4578");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((-1), intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4579");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
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
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4580");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4581");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4582");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4583");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4584");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
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
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4585");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
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
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4586");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4587");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList9);
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
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4588");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4589");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4590");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4591");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4592");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(1, intList13);
        boolean boolean26 = correct_java_programs.SIEVE.any(booleanList25);
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
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4593");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4594");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
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
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4595");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList17);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4596");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
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
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4597");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4598");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4599");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) '4', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4600");
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp(100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.lang.Class<?> wildcardClass30 = intList15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4601");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4602");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass14 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4603");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
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
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4604");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(10, intList10);
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
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4605");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
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
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4606");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4607");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4608");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
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
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4609");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
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
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4610");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        boolean boolean24 = correct_java_programs.SIEVE.all(booleanList23);
        boolean boolean25 = correct_java_programs.SIEVE.any(booleanList23);
        boolean boolean26 = correct_java_programs.SIEVE.all(booleanList23);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4611");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) '4', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(0, intList13);
        boolean boolean26 = correct_java_programs.SIEVE.any(booleanList25);
        boolean boolean27 = correct_java_programs.SIEVE.all(booleanList25);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4612");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(100, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4613");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
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
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4614");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
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
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4615");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4616");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((-1), intList11);
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
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4617");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
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
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4618");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) ' ', intList15);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
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
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4619");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList13);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4620");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
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
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4621");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
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
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4622");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4623");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4624");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4625");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
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
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4626");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4627");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.lang.Class<?> wildcardClass24 = booleanList23.getClass();
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
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4628");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList17);
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
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4629");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4630");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList9);
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
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4631");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) '4', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4632");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) ' ', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList14);
        boolean boolean28 = correct_java_programs.SIEVE.all(booleanList27);
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
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4633");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4634");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
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
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4635");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList10);
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
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4636");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4637");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
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
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4638");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4639");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList7);
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
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4640");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList9);
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
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4641");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4642");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
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
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4643");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4644");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
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
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4645");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList10);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4646");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) '4', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4647");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
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
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4648");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4649");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '4', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) '#', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((-1), intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        boolean boolean28 = correct_java_programs.SIEVE.all(booleanList27);
        boolean boolean29 = correct_java_programs.SIEVE.all(booleanList27);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4650");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
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
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4651");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4652");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) ' ', intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4653");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
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
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4654");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass15 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4655");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4656");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList19);
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
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4657");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4658");
        java.util.ArrayList<java.lang.Integer> intList18 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) 'a', intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(100, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(0, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(0, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) 'a', intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(1, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp(10, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList30 = correct_java_programs.SIEVE.list_comp(1, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList31 = correct_java_programs.SIEVE.list_comp(10, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList32 = correct_java_programs.SIEVE.list_comp((int) '4', intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList33 = correct_java_programs.SIEVE.list_comp((-1), intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList34 = correct_java_programs.SIEVE.list_comp((int) '#', intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList35 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList18);
        org.junit.Assert.assertNotNull(intList18);
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
        org.junit.Assert.assertNotNull(booleanList30);
        org.junit.Assert.assertNotNull(booleanList31);
        org.junit.Assert.assertNotNull(booleanList32);
        org.junit.Assert.assertNotNull(booleanList33);
        org.junit.Assert.assertNotNull(booleanList34);
        org.junit.Assert.assertNotNull(booleanList35);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4659");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
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
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4660");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4661");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
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
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4662");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4663");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(10, intList8);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4664");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4665");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4666");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        boolean boolean24 = correct_java_programs.SIEVE.any(booleanList23);
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
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4667");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList2);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4668");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4669");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
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
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4670");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
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
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4671");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4672");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4673");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(1, intList11);
        boolean boolean22 = correct_java_programs.SIEVE.any(booleanList21);
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
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4674");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
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
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4675");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass17 = booleanList13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4676");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
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
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4677");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
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
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4678");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
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
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4679");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass16 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4680");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
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
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4681");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4682");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
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
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4683");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
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
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4684");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList15);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4685");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
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
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4686");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4687");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
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
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4688");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4689");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4690");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4691");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
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
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4692");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) '4', intList14);
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
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4693");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4694");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
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
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4695");
        java.util.ArrayList<java.lang.Integer> intList16 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(100, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp(100, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp(0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp(100, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList30 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList31 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList16);
        boolean boolean32 = correct_java_programs.SIEVE.all(booleanList31);
        org.junit.Assert.assertNotNull(intList16);
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
        org.junit.Assert.assertNotNull(booleanList30);
        org.junit.Assert.assertNotNull(booleanList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4696");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4697");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) '#', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(0, intList13);
        boolean boolean26 = correct_java_programs.SIEVE.all(booleanList25);
        java.lang.Class<?> wildcardClass27 = booleanList25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4698");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4699");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4700");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
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
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4701");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
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
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4702");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(1, intList12);
        boolean boolean24 = correct_java_programs.SIEVE.all(booleanList23);
        boolean boolean25 = correct_java_programs.SIEVE.any(booleanList23);
        boolean boolean26 = correct_java_programs.SIEVE.any(booleanList23);
        java.lang.Class<?> wildcardClass27 = booleanList23.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4703");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
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
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4704");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
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
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4705");
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) 'a', intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(100, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(100, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp(0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList30 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList31 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList32 = correct_java_programs.SIEVE.list_comp((int) ' ', intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList33 = correct_java_programs.SIEVE.list_comp(0, intList17);
        org.junit.Assert.assertNotNull(intList17);
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
        org.junit.Assert.assertNotNull(booleanList30);
        org.junit.Assert.assertNotNull(booleanList31);
        org.junit.Assert.assertNotNull(booleanList32);
        org.junit.Assert.assertNotNull(booleanList33);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4706");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4707");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
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
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4708");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4709");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4710");
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) 'a', intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(100, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(100, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp(0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList30 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList31 = correct_java_programs.SIEVE.list_comp((int) 'a', intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList32 = correct_java_programs.SIEVE.list_comp(1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList33 = correct_java_programs.SIEVE.list_comp((-1), intList17);
        org.junit.Assert.assertNotNull(intList17);
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
        org.junit.Assert.assertNotNull(booleanList30);
        org.junit.Assert.assertNotNull(booleanList31);
        org.junit.Assert.assertNotNull(booleanList32);
        org.junit.Assert.assertNotNull(booleanList33);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4711");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4712");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(10, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList17);
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
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4713");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList13);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4714");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) '#', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4715");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4716");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList3);
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
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4717");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4718");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
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
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4719");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(1, intList13);
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
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4720");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
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
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4721");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList11);
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
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4722");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4723");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
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
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4724");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(0, intList14);
        boolean boolean28 = correct_java_programs.SIEVE.all(booleanList27);
        boolean boolean29 = correct_java_programs.SIEVE.all(booleanList27);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4725");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4726");
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) 'a', intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(100, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(100, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp(100, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList30 = correct_java_programs.SIEVE.list_comp(0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList31 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList32 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList33 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList17);
        org.junit.Assert.assertNotNull(intList17);
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
        org.junit.Assert.assertNotNull(booleanList30);
        org.junit.Assert.assertNotNull(booleanList31);
        org.junit.Assert.assertNotNull(booleanList32);
        org.junit.Assert.assertNotNull(booleanList33);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4727");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp(1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass8 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4728");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) '4', intList12);
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
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4729");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        boolean boolean24 = correct_java_programs.SIEVE.any(booleanList23);
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
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4730");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
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
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4731");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        boolean boolean22 = correct_java_programs.SIEVE.all(booleanList21);
        boolean boolean23 = correct_java_programs.SIEVE.all(booleanList21);
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
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4732");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4733");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4734");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        boolean boolean28 = correct_java_programs.SIEVE.all(booleanList27);
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
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4735");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4736");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) '4', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4737");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList10);
        java.lang.Class<?> wildcardClass12 = booleanList10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4738");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4739");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
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
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4740");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
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
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4741");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4742");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
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
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4743");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4744");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4745");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList16);
        java.lang.Class<?> wildcardClass18 = booleanList16.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4746");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4747");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4748");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4749");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList16);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList16);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList16);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4750");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4751");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(10, intList11);
        boolean boolean22 = correct_java_programs.SIEVE.any(booleanList21);
        boolean boolean23 = correct_java_programs.SIEVE.all(booleanList21);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4752");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList2);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4753");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
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
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4754");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4755");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass10 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4756");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
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
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4757");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4758");
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp(10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp(10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp((int) '4', intList15);
        boolean boolean30 = correct_java_programs.SIEVE.all(booleanList29);
        boolean boolean31 = correct_java_programs.SIEVE.all(booleanList29);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4759");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
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
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4760");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4761");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(10, intList12);
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
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4762");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4763");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4764");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList14);
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
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4765");
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp(10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) '#', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp((int) '4', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp(1, intList15);
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
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4766");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4767");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4768");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4769");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp(0, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4770");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
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
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4771");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4772");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
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
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4773");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4774");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(10, intList11);
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
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4775");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList14);
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
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4776");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4777");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((-1), intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4778");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList17);
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
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4779");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4780");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) '#', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4781");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4782");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4783");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4784");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList15);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4785");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4786");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4787");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
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
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4788");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(100, intList14);
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
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4789");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4790");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList19);
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
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4791");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4792");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4793");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.lang.Class<?> wildcardClass26 = intList13.getClass();
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
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4794");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(100, intList11);
        boolean boolean22 = correct_java_programs.SIEVE.all(booleanList21);
        boolean boolean23 = correct_java_programs.SIEVE.any(booleanList21);
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
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4795");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4796");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4797");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4798");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4799");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4800");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList8);
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
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4801");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) ' ', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4802");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4803");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4804");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList18);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList18);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4805");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4806");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4807");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4808");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.lang.Class<?> wildcardClass23 = booleanList22.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4809");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList13);
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
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4810");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4811");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4812");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4813");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
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
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4814");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList8);
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
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4815");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
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
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4816");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4817");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((-1), intList10);
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
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4818");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
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
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4819");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList8);
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
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4820");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList9);
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
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4821");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList9);
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
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4822");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList17);
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
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4823");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4824");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4825");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
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
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4826");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
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
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4827");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
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
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4828");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4829");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4830");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4831");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4832");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4833");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) '4', intList13);
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
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4834");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4835");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean21 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean22 = correct_java_programs.SIEVE.all(booleanList15);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4836");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
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
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4837");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.lang.Class<?> wildcardClass17 = booleanList16.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4838");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4839");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4840");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList12);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4841");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4842");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4843");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.lang.Class<?> wildcardClass14 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4844");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(1, intList12);
        boolean boolean24 = correct_java_programs.SIEVE.all(booleanList23);
        boolean boolean25 = correct_java_programs.SIEVE.any(booleanList23);
        java.lang.Class<?> wildcardClass26 = booleanList23.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4845");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4846");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        boolean boolean26 = correct_java_programs.SIEVE.any(booleanList25);
        boolean boolean27 = correct_java_programs.SIEVE.any(booleanList25);
        boolean boolean28 = correct_java_programs.SIEVE.any(booleanList25);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4847");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4848");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4849");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4850");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
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
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4851");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList11);
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
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4852");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4853");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        boolean boolean28 = correct_java_programs.SIEVE.all(booleanList27);
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
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4854");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4855");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4856");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
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
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4857");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) '4', intList12);
        boolean boolean24 = correct_java_programs.SIEVE.any(booleanList23);
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
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4858");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4859");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4860");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4861");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
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
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4862");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
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
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4863");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(10, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
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
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4864");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
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
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4865");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4866");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4867");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4868");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
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
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4869");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        boolean boolean22 = correct_java_programs.SIEVE.any(booleanList21);
        boolean boolean23 = correct_java_programs.SIEVE.all(booleanList21);
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
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4870");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4871");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4872");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList6);
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
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4873");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4874");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
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
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4875");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
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
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4876");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4877");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4878");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        boolean boolean28 = correct_java_programs.SIEVE.all(booleanList27);
        boolean boolean29 = correct_java_programs.SIEVE.all(booleanList27);
        java.lang.Class<?> wildcardClass30 = booleanList27.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4879");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4880");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
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
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4881");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4882");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4883");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4884");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        boolean boolean26 = correct_java_programs.SIEVE.any(booleanList25);
        boolean boolean27 = correct_java_programs.SIEVE.all(booleanList25);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4885");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
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
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4886");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
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
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4887");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4888");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean21 = correct_java_programs.SIEVE.all(booleanList17);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4889");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
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
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4890");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
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
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4891");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp(0, intList15);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
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
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4892");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
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
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4893");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4894");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList10);
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
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4895");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4896");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4897");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) '#', intList12);
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
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4898");
        java.util.ArrayList<java.lang.Integer> intList18 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) 'a', intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(100, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(0, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(0, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp(100, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp(100, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList30 = correct_java_programs.SIEVE.list_comp(1, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList31 = correct_java_programs.SIEVE.list_comp(0, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList32 = correct_java_programs.SIEVE.list_comp(0, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList33 = correct_java_programs.SIEVE.list_comp((int) 'a', intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList34 = correct_java_programs.SIEVE.list_comp((int) '4', intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList35 = correct_java_programs.SIEVE.list_comp(0, intList18);
        boolean boolean36 = correct_java_programs.SIEVE.all(booleanList35);
        org.junit.Assert.assertNotNull(intList18);
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
        org.junit.Assert.assertNotNull(booleanList30);
        org.junit.Assert.assertNotNull(booleanList31);
        org.junit.Assert.assertNotNull(booleanList32);
        org.junit.Assert.assertNotNull(booleanList33);
        org.junit.Assert.assertNotNull(booleanList34);
        org.junit.Assert.assertNotNull(booleanList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4899");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        boolean boolean22 = correct_java_programs.SIEVE.any(booleanList21);
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
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4900");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.lang.Class<?> wildcardClass13 = booleanList12.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4901");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4902");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
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
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4903");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4904");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(10, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList17);
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
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4905");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
        boolean boolean21 = correct_java_programs.SIEVE.all(booleanList19);
        boolean boolean22 = correct_java_programs.SIEVE.all(booleanList19);
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
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4906");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4907");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
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
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4908");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4909");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4910");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4911");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList11);
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
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4912");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4913");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList18);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList18);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4914");
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(100, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) 'a', intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList15);
        boolean boolean30 = correct_java_programs.SIEVE.any(booleanList29);
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
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4915");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((-1), intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4916");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
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
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4917");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4918");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
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
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4919");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4920");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
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
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4921");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4922");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
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
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4923");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((-1), intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4924");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
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
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4925");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4926");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
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
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4927");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass9 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4928");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4929");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4930");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = correct_java_programs.SIEVE.any(booleanList19);
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
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4931");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList8);
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
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4932");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList10);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList16);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4933");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4934");
        java.util.ArrayList<java.lang.Integer> intList16 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(100, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp(100, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(100, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList30 = correct_java_programs.SIEVE.list_comp(0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList31 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList16);
        org.junit.Assert.assertNotNull(intList16);
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
        org.junit.Assert.assertNotNull(booleanList30);
        org.junit.Assert.assertNotNull(booleanList31);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4935");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
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
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4936");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4937");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(1, intList10);
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
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4938");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(0, intList12);
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
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4939");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4940");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4941");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass17 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4942");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
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
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4943");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4944");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList11);
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
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4945");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
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
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4946");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4947");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4948");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
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
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4949");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4950");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4951");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4952");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList10);
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
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4953");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4954");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(10, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList17);
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
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4955");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4956");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4957");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
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
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4958");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass15 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4959");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4960");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4961");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4962");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4963");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
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
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4964");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList8);
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
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4965");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
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
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4966");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList17);
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
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4967");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4968");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass15 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4969");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
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
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4970");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList9);
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
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4971");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList2);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4972");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList13);
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
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4973");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass10 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4974");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4975");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
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
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4976");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
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
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4977");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4978");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4979");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList11);
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
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4980");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
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
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4981");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
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
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4982");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4983");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4984");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
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
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4985");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList17);
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
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4986");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4987");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList8);
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
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4988");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
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
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4989");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4990");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4991");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
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
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4992");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4993");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList2);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4994");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4995");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
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
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4996");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4997");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass12 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4998");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
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
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test4999");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression9.test5000");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }
}

