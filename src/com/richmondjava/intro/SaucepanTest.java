package com.richmondjava.intro;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class SaucepanTest {

    Saucepan saucepan;

    @Before
    public void setUp() {
        saucepan = new Saucepan();
    }

    @Test
    public void shouldReturnSaucepanSize() {
        saucepan.setSauceSize(11);
        assertEquals(11, saucepan.getSaucepanSize());
    }
    
}
