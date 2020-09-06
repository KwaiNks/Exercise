package com.richmondjava.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {

    @Test
    public void shouldReturnTrueIfTwoWordsAreAnagrams(){
        assertTrue(Anagram.isAnagram("note", "tone"));
    }

    @Test
    public void shouldReturnFalseIfTwoWordsAreNotAnagrams(){
        assertFalse(Anagram.isAnagram("daniel", "richmond"));
    }

    @Test
    public void shouldReturnFalseIfTwoWordsAreDifferentLengths(){
        assertFalse(Anagram.isAnagram("not", "tone"));
    }

    @Test
    public void shouldReturnFalseIfOneWordIsNull(){
        assertFalse(Anagram.isAnagram(null, "tone"));
    }

    @Test
    public void shouldReturnFalseIfBothWordsAreNull(){
        assertFalse(Anagram.isAnagram(null, null));
    }
}
