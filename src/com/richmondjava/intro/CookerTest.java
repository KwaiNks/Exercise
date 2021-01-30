package com.richmondjava.intro;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CookerTest {
    
    Cooker cooker;

    @Before
    public void setUp(){
        cooker = new Cooker(4);
    }

    @Test
    public void shouldReturnTheSizeOfTheCooker() {
        cooker.setCookerSize(25);
        assertEquals(25, cooker.getCookerSize());
    }

    @Test
    public void shouldReturnTheNumberOfSaucepans() {
        assertEquals(4, cooker.getNumberOfSaucepans());
    }
}
