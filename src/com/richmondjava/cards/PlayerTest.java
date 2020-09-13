package com.richmondjava.cards;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	Player player;
	Card cards;
	
	@Before
	public void setUp() throws Exception {
		
		player = new Player("Richmond",cards);
	}
	
	@Test
	public void shouldReturnPlayerName() {
		assertTrue("Richmond".equals(player.getName()));
	}
}
