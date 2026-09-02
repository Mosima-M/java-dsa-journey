package dsa.recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    // ─── Problem 63: Factorial ────────────────────────────────────────────────

    @Test void factorial_zero()         { assertEquals(1,   Factorial.factorial(0)); }
    @Test void factorial_one()          { assertEquals(1,   Factorial.factorial(1)); }
    @Test void factorial_five()         { assertEquals(120, Factorial.factorial(5)); }
    @Test void factorial_ten()          { assertEquals(3628800, Factorial.factorial(10)); }

    // ─── Problem 64: Fibonacci ────────────────────────────────────────────────

    @Test void fibonacci_zero()         { assertEquals(0,  Fibonacci.fibonacci(0)); }
    @Test void fibonacci_one()          { assertEquals(1,  Fibonacci.fibonacci(1)); }
    @Test void fibonacci_five()         { assertEquals(5,  Fibonacci.fibonacci(5)); }
    @Test void fibonacci_ten()          { assertEquals(55, Fibonacci.fibonacci(10)); }

    // ─── Problem 65: Sum 1 to N ──────────────────────────────────────────────

    @Test void sumToN_one()             { assertEquals(1,  SumToN.sum(1)); }
    @Test void sumToN_five()            { assertEquals(15, SumToN.sum(5)); }
    @Test void sumToN_ten()             { assertEquals(55, SumToN.sum(10)); }

    // ─── Problem 66: Reverse string recursively ───────────────────────────────

    @Test void reverseRecursive_basic()     { assertEquals("olleh",   ReverseStringRecursive.reverse("hello")); }
    @Test void reverseRecursive_single()    { assertEquals("a",       ReverseStringRecursive.reverse("a")); }
    @Test void reverseRecursive_empty()     { assertEquals("",        ReverseStringRecursive.reverse("")); }
    @Test void reverseRecursive_palindrome(){ assertEquals("racecar", ReverseStringRecursive.reverse("racecar")); }

    // ─── Problem 67: Binary search recursively ────────────────────────────────

    @Test void binarySearchRecursive_found()        { assertEquals(2,  BinarySearchRecursive.search(new int[]{1,2,3,4,5}, 3)); }
    @Test void binarySearchRecursive_notFound()     { assertEquals(-1, BinarySearchRecursive.search(new int[]{1,2,3,4,5}, 9)); }
    @Test void binarySearchRecursive_firstElement() { assertEquals(0,  BinarySearchRecursive.search(new int[]{1,2,3,4,5}, 1)); }
    @Test void binarySearchRecursive_lastElement()  { assertEquals(4,  BinarySearchRecursive.search(new int[]{1,2,3,4,5}, 5)); }

    // ─── Problem 68: Max element recursively ─────────────────────────────────

    @Test void maxRecursive_basic()         { assertEquals(9,  MaxRecursive.max(new int[]{3,1,9,2})); }
    @Test void maxRecursive_singleElement() { assertEquals(5,  MaxRecursive.max(new int[]{5})); }
    @Test void maxRecursive_allNegative()   { assertEquals(-1, MaxRecursive.max(new int[]{-5,-1,-3})); }
}
