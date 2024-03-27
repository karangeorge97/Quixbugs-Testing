package java_programs.pascal;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop_PASCAL_Buggy_Regression0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test01");
        java_programs.PASCAL pASCAL0 = new java_programs.PASCAL();
        java.lang.Class<?> wildcardClass1 = pASCAL0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test02");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test03");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = intListList1.getClass();
        org.junit.Assert.assertNotNull(intListList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test05");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test06");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = intListList1.getClass();
        org.junit.Assert.assertNotNull(intListList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test07");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test08");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test09");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test10");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = intListList1.getClass();
        org.junit.Assert.assertNotNull(intListList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test11");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal(0);
        java.lang.Class<?> wildcardClass2 = intListList1.getClass();
        org.junit.Assert.assertNotNull(intListList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test12");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test13");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test14");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test15");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = intListList1.getClass();
        org.junit.Assert.assertNotNull(intListList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test16");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test17");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = intListList1.getClass();
        org.junit.Assert.assertNotNull(intListList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test18");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((-1));
        java.lang.Class<?> wildcardClass2 = intListList1.getClass();
        org.junit.Assert.assertNotNull(intListList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test19");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test20");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal(1);
        java.lang.Class<?> wildcardClass2 = intListList1.getClass();
        org.junit.Assert.assertNotNull(intListList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_PASCAL_Buggy_Regression0.test21");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList1 = java_programs.PASCAL.pascal((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = intListList1.getClass();
        org.junit.Assert.assertNotNull(intListList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

