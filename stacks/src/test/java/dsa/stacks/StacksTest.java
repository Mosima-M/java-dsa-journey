package dsa.stacks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StacksTest {

    // ─── Problems 81-85: Stack using array ───────────────────────────────────

    @Test void stack_isEmptyOnCreation() {
        ArrayStack s = new ArrayStack(5);
        assertTrue(s.isEmpty());
    }

    @Test void stack_pushAndPeek() {
        ArrayStack s = new ArrayStack(5);
        s.push(10);
        assertEquals(10, s.peek());
    }

    @Test void stack_pushAndPop() {
        ArrayStack s = new ArrayStack(5);
        s.push(10);
        assertEquals(10, s.pop());
        assertTrue(s.isEmpty());
    }

    @Test void stack_lifoOrder() {
        ArrayStack s = new ArrayStack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals(3, s.pop());
        assertEquals(2, s.pop());
        assertEquals(1, s.pop());
    }

    @Test void stack_sizeTracked() {
        ArrayStack s = new ArrayStack(5);
        s.push(1);
        s.push(2);
        assertEquals(2, s.size());
        s.pop();
        assertEquals(1, s.size());
    }

    // ─── Problem 86: Balanced parentheses ────────────────────────────────────

    @Test void balanced_emptyString()       { assertTrue(BalancedParentheses.isBalanced("")); }
    @Test void balanced_singlePair()        { assertTrue(BalancedParentheses.isBalanced("()")); }
    @Test void balanced_nested()            { assertTrue(BalancedParentheses.isBalanced("(())")); }
    @Test void balanced_mixed()             { assertTrue(BalancedParentheses.isBalanced("()[]{}")); }
    @Test void balanced_unmatched()         { assertFalse(BalancedParentheses.isBalanced("(]")); }
    @Test void balanced_unclosed()          { assertFalse(BalancedParentheses.isBalanced("(()")); }
    @Test void balanced_wrongOrder()        { assertFalse(BalancedParentheses.isBalanced(")(")); }

    // ─── Problem 88: Reverse string using stack ───────────────────────────────

    @Test void reverseWithStack_basic()     { assertEquals("olleh",   ReverseWithStack.reverse("hello")); }
    @Test void reverseWithStack_single()    { assertEquals("a",       ReverseWithStack.reverse("a")); }
    @Test void reverseWithStack_empty()     { assertEquals("",        ReverseWithStack.reverse("")); }
}
