package java_programs.depth_first_search;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop_DEPTH_FIRST_SEARCH_Buggy_Regression0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_DEPTH_FIRST_SEARCH_Buggy_Regression0.test1");
        java_programs.DEPTH_FIRST_SEARCH dEPTH_FIRST_SEARCH0 = new java_programs.DEPTH_FIRST_SEARCH();
        java.lang.Class<?> wildcardClass1 = dEPTH_FIRST_SEARCH0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_DEPTH_FIRST_SEARCH_Buggy_Regression0.test2");
        java_programs.Node node0 = null;
        java_programs.Node node1 = null;
        boolean boolean2 = java_programs.DEPTH_FIRST_SEARCH.depth_first_search(node0, node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop_DEPTH_FIRST_SEARCH_Buggy_Regression0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

