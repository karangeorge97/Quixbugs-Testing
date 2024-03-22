package correct_java_programs.sieve;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop_SIEVE_Regression10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5001");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) ' ', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass12 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5002");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5003");
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
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList15);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList15);
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
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5004");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((-1), intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        boolean boolean26 = correct_java_programs.SIEVE.all(booleanList25);
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
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5005");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
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
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5006");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
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
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5007");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
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
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5008");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = correct_java_programs.SIEVE.all(booleanList19);
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
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5009");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
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
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5010");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(100, intList6);
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
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5011");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
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
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5012");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(1, intList10);
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
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5013");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList8);
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
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5014");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) ' ', intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5015");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = correct_java_programs.SIEVE.all(booleanList19);
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
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5016");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
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
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5017");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5018");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
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
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5019");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(1, intList12);
        boolean boolean24 = correct_java_programs.SIEVE.all(booleanList23);
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
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5020");
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
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        boolean boolean26 = correct_java_programs.SIEVE.all(booleanList25);
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
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5021");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
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
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5022");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
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
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5023");
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) '#', intList12);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5024");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
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
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5025");
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
        java.util.ArrayList<java.lang.Boolean> booleanList33 = correct_java_programs.SIEVE.list_comp(1, intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList34 = correct_java_programs.SIEVE.list_comp((-1), intList18);
        java.util.ArrayList<java.lang.Boolean> booleanList35 = correct_java_programs.SIEVE.list_comp(0, intList18);
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
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5026");
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
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5027");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
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
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5028");
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
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5029");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
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
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5030");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
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
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5031");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
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
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5032");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList13);
        java.lang.Class<?> wildcardClass20 = booleanList13.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5033");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
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
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5034");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp(1, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5035");
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
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp((int) 'a', intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList30 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList31 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList32 = correct_java_programs.SIEVE.list_comp(100, intList17);
        java.util.ArrayList<java.lang.Boolean> booleanList33 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList17);
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
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5036");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
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
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5037");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5038");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
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
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5039");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5040");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
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
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5041");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
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
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5042");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) '#', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5043");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5044");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5045");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
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
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5046");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
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
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5047");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = correct_java_programs.SIEVE.any(booleanList19);
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
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5048");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) '4', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
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
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5049");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5050");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
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
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5051");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
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
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5052");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
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
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5053");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList11);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = correct_java_programs.SIEVE.any(booleanList19);
        boolean boolean22 = correct_java_programs.SIEVE.all(booleanList19);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5054");
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
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList5);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5055");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((-1), intList9);
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
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5056");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList8);
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
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5057");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
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
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5058");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((-1), intList11);
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
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5059");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5060");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5061");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList2);
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
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5062");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
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
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5063");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
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
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5064");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
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
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5065");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5066");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(10, intList7);
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
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5067");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
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
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5068");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        java.util.ArrayList<java.lang.Boolean> booleanList3 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5069");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList6);
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
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5070");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5071");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5072");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
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
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5073");
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
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        boolean boolean22 = correct_java_programs.SIEVE.any(booleanList21);
        boolean boolean23 = correct_java_programs.SIEVE.any(booleanList21);
        boolean boolean24 = correct_java_programs.SIEVE.all(booleanList21);
        java.lang.Class<?> wildcardClass25 = booleanList21.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5074");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
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
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5075");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
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
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5076");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
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
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5077");
        java.util.ArrayList<java.lang.Integer> intList16 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) ' ', intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(10, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) 'a', intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp(0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(10, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList29 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList30 = correct_java_programs.SIEVE.list_comp((int) 'a', intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList31 = correct_java_programs.SIEVE.list_comp(10, intList16);
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
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5078");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList15);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5079");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5080");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5081");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
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
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5082");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
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
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5083");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
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
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5084");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
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
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5085");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
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
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5086");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
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
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5087");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5088");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
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
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5089");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList13);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5090");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass20 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5091");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
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
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5092");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass15 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5093");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5094");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
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
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5095");
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
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        boolean boolean24 = correct_java_programs.SIEVE.all(booleanList23);
        boolean boolean25 = correct_java_programs.SIEVE.all(booleanList23);
        boolean boolean26 = correct_java_programs.SIEVE.all(booleanList23);
        boolean boolean27 = correct_java_programs.SIEVE.all(booleanList23);
        boolean boolean28 = correct_java_programs.SIEVE.all(booleanList23);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5096");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
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
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5097");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) '#', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList5);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5098");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5099");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList2);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5100");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
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
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5101");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5102");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
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
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5103");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
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
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5104");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(1, intList4);
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
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5105");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5106");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.lang.Class<?> wildcardClass19 = booleanList18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5107");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
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
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5108");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList6);
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
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5109");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
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
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5110");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList8);
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
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5111");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((-1), intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5112");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5113");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
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
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5114");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
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
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5115");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
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
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5116");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
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
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5117");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList2);
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
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5118");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList15);
        java.lang.Class<?> wildcardClass19 = booleanList15.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5119");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5120");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList14);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5121");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
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
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5122");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5123");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList16);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList16);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList16);
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
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5124");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5125");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList13);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5126");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(100, intList11);
        boolean boolean22 = correct_java_programs.SIEVE.all(booleanList21);
        java.lang.Class<?> wildcardClass23 = booleanList21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5127");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
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
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5128");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass8 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5129");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
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
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5130");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(10, intList8);
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
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5131");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
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
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5132");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) '4', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5133");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList16);
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
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5134");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList8);
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
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5135");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList9);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5136");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5137");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
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
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5138");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(10, intList4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5139");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
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
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5140");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5141");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
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
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5142");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5143");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass13 = booleanList2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5144");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean21 = correct_java_programs.SIEVE.any(booleanList17);
        java.lang.Class<?> wildcardClass22 = booleanList17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5145");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
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
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5146");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5147");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
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
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5148");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((-1), intList10);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5149");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
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
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5150");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
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
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5151");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
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
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5152");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(1, intList9);
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
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5153");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5154");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
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
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5155");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
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
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5156");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5157");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
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
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5158");
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
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList7);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5159");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList14);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList14);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList14);
        java.lang.Class<?> wildcardClass18 = booleanList14.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5160");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
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
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5161");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
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
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5162");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList13);
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
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5163");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5164");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(1, intList4);
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
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5165");
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
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        boolean boolean22 = correct_java_programs.SIEVE.any(booleanList21);
        boolean boolean23 = correct_java_programs.SIEVE.any(booleanList21);
        boolean boolean24 = correct_java_programs.SIEVE.all(booleanList21);
        boolean boolean25 = correct_java_programs.SIEVE.any(booleanList21);
        boolean boolean26 = correct_java_programs.SIEVE.any(booleanList21);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5166");
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
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        boolean boolean26 = correct_java_programs.SIEVE.all(booleanList25);
        boolean boolean27 = correct_java_programs.SIEVE.any(booleanList25);
        boolean boolean28 = correct_java_programs.SIEVE.all(booleanList25);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5167");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
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
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5168");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.lang.Class<?> wildcardClass15 = booleanList14.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5169");
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
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList13);
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
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5170");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5171");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5172");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((-1), intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5173");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) 'a', intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(0, intList16);
        java.util.ArrayList<java.lang.Boolean> booleanList28 = correct_java_programs.SIEVE.list_comp((int) '4', intList16);
        boolean boolean29 = correct_java_programs.SIEVE.any(booleanList28);
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
        org.junit.Assert.assertNotNull(booleanList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5174");
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
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
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
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5175");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(0, intList12);
        boolean boolean24 = correct_java_programs.SIEVE.all(booleanList23);
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
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5176");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList9);
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
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5177");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
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
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5178");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
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
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5179");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5180");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
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
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5181");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
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
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5182");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
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
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5183");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
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
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5184");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) ' ', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp(10, intList3);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5185");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(10, intList10);
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
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5186");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) ' ', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp(0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
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
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5187");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
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
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5188");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
        boolean boolean21 = correct_java_programs.SIEVE.all(booleanList19);
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
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5189");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5190");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5191");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5192");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5193");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5194");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
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
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5195");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(10, intList10);
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
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5196");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5197");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
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
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5198");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList10);
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
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5199");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5200");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
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
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5201");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList7);
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
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5202");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList9);
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
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5203");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
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
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5204");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5205");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass14 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5206");
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
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5207");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        java.lang.Class<?> wildcardClass16 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5208");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5209");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
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
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5210");
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
        java.lang.Class<?> wildcardClass15 = booleanList7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5211");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5212");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
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
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5213");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList9);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList14);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5214");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList11);
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
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5215");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
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
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5216");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5217");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5218");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList14);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList14);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5219");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5220");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(10, intList7);
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
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5221");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(10, intList7);
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
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5222");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
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
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5223");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5224");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(0, intList13);
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
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5225");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
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
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5226");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
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
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5227");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
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
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5228");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
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
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5229");
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
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass13 = booleanList2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5230");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5231");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList15);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5232");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5233");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
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
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5234");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
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
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5235");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5236");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_SIEVE_Regression10.test5237");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(0, intList12);
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
}

