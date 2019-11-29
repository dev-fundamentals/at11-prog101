package examoop;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TvShowTest {

	
	@Test
	void testAddNewMovie() {
		TvShow tvShow1 = new TvShow(2, "friends", ProdutCategory.Comic, 
				ProductStatus.InStoreAvailable, 4.2, LocalDate.of(2001, 11, 02));
		assertEquals(tvShow1.id, 2);
		assertEquals(tvShow1.title, "friends");
		assertEquals(tvShow1.category, ProdutCategory.Comic);
		assertEquals(tvShow1.status, "InStoreAvailable");
		assertEquals(tvShow1.getLocalDate(), LocalDate.of(2001, 11, 02));
	}

}
