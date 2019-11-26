package GuessMovie;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {
	
	Game game;

	public GameTest() {

	}
	@Test
	public void Send_SendALetter_ExpectedJustLetterA() {
		game = new Game(3);
		char letterSended = 'a';
		String actual = game.searchLetter(letterSended);
		var expected = "___ _a__ ______";
		assertEquals(expected, actual);
	}
	@Test
	public void Send_SendALetter_Expectedthedarkk_ight() {

		game = new Game(3);
		char letterSended = 'a';
		String actual = "";
		game.searchLetter('e');
		game.searchLetter('t');
		game.searchLetter('d');
		game.searchLetter('k');
		game.searchLetter('g');
		game.searchLetter('h');
		game.searchLetter('i');
		game.searchLetter('r');
		actual = game.searchLetter(letterSended);
		var expected = "the dark k_ight";

		assertEquals(expected, actual);
	}
	
	@Test
	public void Send_SendMALPFSXZUYJLetters_ExpectedGAMEOVER() {
		game = new Game(3);
		
		char letterSended = 'j';
		game.searchLetter('m');
		game.searchLetter('a');
		game.searchLetter('l');
		game.searchLetter('p');
		game.searchLetter('f');
		game.searchLetter('s');
		game.searchLetter('x');
		game.searchLetter('z');
		game.searchLetter('u');
		game.searchLetter('y');
		
		String actual = game.searchLetter(letterSended);
		var expected = "Game Over";
		assertEquals(expected, actual);
	}
	@Test
	public void Send_SendMALPFSXZJLetter_ExpectedJustLetterGAMEOVER() {
		game = new Game(11);

		char letterSended = 'j';
		game.searchLetter('m');
		game.searchLetter('a');
		game.searchLetter('l');
		game.searchLetter('p');
		game.searchLetter('f');
		game.searchLetter('s');
		game.searchLetter('x');
		game.searchLetter('z');

		String actual = game.searchLetter(letterSended);
		var expected = "s_a_ _a_s";
		assertEquals(expected, actual);
	}
	
	@Test
	public void Send_SendSTARWARSWord_ExpectedJustLetterYouWin() {
		game = new Game(11);

		char letterSended = 's';
		game.searchLetter('j');
		game.searchLetter('t');
		game.searchLetter('a');
		game.searchLetter('r');
		game.searchLetter('w');
		game.searchLetter('a');
		game.searchLetter('r');
		
		String actual = game.searchLetter(letterSended);
		var expected = "You Win";
		assertEquals(expected, actual);
	}
	
	@Test
	public void Send_SendSSTTWord_ExpectedST_____S() {
		game = new Game(11);

		char letterSended = 's';
		game.searchLetter('s');
		game.searchLetter('t');
		game.searchLetter('t');
		
		String actual = game.searchLetter(letterSended);
		var expected = "st__ ___s";
		assertEquals(expected, actual);
	}


}
