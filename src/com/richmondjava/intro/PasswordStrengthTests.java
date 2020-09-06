package com.richmondjava.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordStrengthTests {

    @Test
    public void shouldReturnWeakIfLessThanSixCharacters(){
        assertEquals("weak", passwordStrength.getPasswordStrength("hello"));
    }

    @Test
    public void shouldReturnMediumIfBetweenSixAndEightCharactersAndHasACapitalLetter(){
        assertEquals("medium", passwordStrength.getPasswordStrength("passworD"));
    }

    @Test
    public void shouldReturnStrongIfGreaterThanTenCharactersAndIncludesSpecialCharacters(){
        // Special characters are *&%$
        assertEquals("strong", passwordStrength.getPasswordStrength("passworD%$&");
    }
}
