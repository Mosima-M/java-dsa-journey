package dsa.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringsTest {

    // ─── Problem 41: Reverse a string ────────────────────────────────────────

    @Test void reverse_basic()          { assertEquals("olleh",  ReverseString.reverse("hello")); }
    @Test void reverse_singleChar()     { assertEquals("a",      ReverseString.reverse("a")); }
    @Test void reverse_palindrome()     { assertEquals("racecar", ReverseString.reverse("racecar")); }
    @Test void reverse_withSpaces()     { assertEquals("dlrow olleh", ReverseString.reverse("hello world")); }

    // ─── Problem 42: Count vowels ─────────────────────────────────────────────

    @Test void countVowels_basic()      { assertEquals(2, CountVowels.countVowels("hello")); }
    @Test void countVowels_noVowels()   { assertEquals(0, CountVowels.countVowels("gym")); }
    @Test void countVowels_allVowels()  { assertEquals(5, CountVowels.countVowels("aeiou")); }
    @Test void countVowels_uppercase()  { assertEquals(3, CountVowels.countVowels("AUDIO")); }

    // ─── Problem 43: Count consonants ────────────────────────────────────────

    @Test void countConsonants_basic()  { assertEquals(3, CountConsonants.countConsonants("hello")); }
    @Test void countConsonants_none()   { assertEquals(0, CountConsonants.countConsonants("aeiou")); }

    // ─── Problem 44: Is palindrome ────────────────────────────────────────────

    @Test void isPalindrome_true()          { assertTrue(IsPalindrome.isPalindrome("racecar")); }
    @Test void isPalindrome_false()         { assertFalse(IsPalindrome.isPalindrome("hello")); }
    @Test void isPalindrome_singleChar()    { assertTrue(IsPalindrome.isPalindrome("a")); }
    @Test void isPalindrome_even()          { assertTrue(IsPalindrome.isPalindrome("abba")); }

    // ─── Problem 45: Count occurrences of a character ────────────────────────

    @Test void countChar_basic()        { assertEquals(3, CountChar.count("mississippi", 's')); }
    @Test void countChar_notFound()     { assertEquals(0, CountChar.count("hello", 'z')); }
    @Test void countChar_allMatch()     { assertEquals(3, CountChar.count("aaa", 'a')); }

    // ─── Problem 46: Remove spaces ───────────────────────────────────────────

    @Test void removeSpaces_basic()     { assertEquals("helloworld", RemoveSpaces.removeSpaces("hello world")); }
    @Test void removeSpaces_noSpaces()  { assertEquals("hello",      RemoveSpaces.removeSpaces("hello")); }
    @Test void removeSpaces_allSpaces() { assertEquals("",           RemoveSpaces.removeSpaces("   ")); }

    // ─── Problem 47: First non-repeating character ───────────────────────────

    @Test void firstNonRepeating_basic()        { assertEquals('h', FirstNonRepeating.firstNonRepeating("hello")); }
    @Test void firstNonRepeating_allRepeating() { assertEquals('d', FirstNonRepeating.firstNonRepeating("aabbcd")); }
    @Test void firstNonRepeating_singleChar()   { assertEquals('a', FirstNonRepeating.firstNonRepeating("a")); }

    // ─── Problem 48: Are anagrams ────────────────────────────────────────────

    @Test void areAnagrams_true()           { assertTrue(AreAnagrams.areAnagrams("listen", "silent")); }
    @Test void areAnagrams_false()          { assertFalse(AreAnagrams.areAnagrams("hello", "world")); }
    @Test void areAnagrams_differentLen()   { assertFalse(AreAnagrams.areAnagrams("abc", "ab")); }
    @Test void areAnagrams_sameWord()       { assertTrue(AreAnagrams.areAnagrams("abc", "abc")); }

    // ─── Problem 49: Reverse words ───────────────────────────────────────────

    @Test void reverseWords_basic()         { assertEquals("world hello",     ReverseWords.reverseWords("hello world")); }
    @Test void reverseWords_threeWords()    { assertEquals("Java learn I",    ReverseWords.reverseWords("I learn Java")); }
    @Test void reverseWords_singleWord()    { assertEquals("hello",           ReverseWords.reverseWords("hello")); }

    // ─── Problem 50: Most frequent character ─────────────────────────────────

    @Test void mostFrequent_basic()         { assertEquals('s', MostFrequentChar.mostFrequent("mississippi")); }
    @Test void mostFrequent_singleChar()    { assertEquals('a', MostFrequentChar.mostFrequent("a")); }
    @Test void mostFrequent_tie()           { assertEquals('a', MostFrequentChar.mostFrequent("aabb")); } // first one wins
}
