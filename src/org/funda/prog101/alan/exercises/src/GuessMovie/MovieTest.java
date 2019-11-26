package GuessMovie;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MovieTest {
	protected Movie movieList;
	public MovieTest(){
		movieList = new Movie();
	}
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void Select_SelectAMovie_ExpectedCorrect() {
		
		int numberLine = 3;
		String actual = movieList.selectMovie(numberLine);
		String expected = "the dark knight";
		assertEquals(expected, actual);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void Select_SelectAMovie_ExpectedException()   {
		
		int numberLine = 30;
		movieList.selectMovie(numberLine);
		thrown.expect(IndexOutOfBoundsException.class);
		
	}

}
