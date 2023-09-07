package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsTrue1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void onlyBracketsReturnsTrue2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void onlyBracketsReturnsTrue3() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void onlyBracketsReturnsTrue4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void onlyBracketsReturnsTrue5() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void onlyBracketsReturnsTrue6() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyBracketsReturnsFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]["));
    }

    @Test
    public void onlyBracketsReturnsFalse3() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][LaunchCode"));
    }
    @Test
    public void onlyBracketsReturnsFalse4() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void onlyBracketsReturnsFalse5() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]"));
    }

    @Test
    public void onlyBracketsReturnsFalse6() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }
}