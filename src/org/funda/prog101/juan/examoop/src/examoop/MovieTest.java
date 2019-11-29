package examoop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovieTest {

	Movie movie1 = new Movie(1, "navidad", ProdutCategory.Comic, ProductStatus.InStoreAvailable, 2.2, 
			2011, MovieState.New);
	@Test
	void testAddNewMovie() {
		
		assertEquals(movie1.id, 1);
		assertEquals(movie1.title, "navidad");
		assertEquals(movie1.category, ProdutCategory.Comic);
		assertEquals(movie1.status, ProductStatus.InStoreAvailable);
		assertEquals(movie1.getYear(), 2011);
	}

	@Test
	void testAddActorToMovie() {
		Actor actor1 = new Actor(22, "Jhon", 18, "male", "saltos");
		
		movie1.addActor(actor1);
		assertEquals(movie1.getActors().get(0).name, "Jhon");	
	}
}
