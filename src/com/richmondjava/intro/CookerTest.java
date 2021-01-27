package com.richmondjava.intro;
import com.richmondjava.intro.Cooker;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CookerTest {
    
    Cooker cooker;
    Saucepan[] saucepan;

    @Before
    public void setUp(){
        saucepan = new Saucepan[4];
        cooker = new Cooker(saucepan);
    }

    @Test
    public void shouldReturnTheSizeOfTheCooker() {
        cooker.setCookerSize(25);
        assertEquals(25, cooker.getCookerSize());
    }

    @Test
    public void shouldReturnTheNumberOfSaucepans() {
        assertEquals(4, cooker.getNumberOfSaucepansOnACooker());
    }
}
