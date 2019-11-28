package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


class StoreTest {

	@Test
	void getAviableDisks_havingADamagedProductInLIstOf2_1() {
		ArrayList<String> actorsMovie1 = new ArrayList<String>();
		actorsMovie1.add("Adam West");
		actorsMovie1.add("Sara Stone");
		
		ArrayList<String> actorsMovie2 = new ArrayList<String>();
		actorsMovie2.add("Miley Cirus");
		actorsMovie2.add("Sara Stone");
		
		Movie movie1 = new Movie("Batman", "action", 9.99, actorsMovie1);
		Movie movie2 = new Movie("Break Ball", "action", 0.99, actorsMovie2);
		movie2.state.damaged();
		
		Store store = new Store();
		store.addProduct(movie1);
		store.addProduct(movie2);
		
		ArrayList<Product> actuallistResult = store.getAviableProducts();
		
		String actualResult = "" + actuallistResult.size();
		String expectedResult = "1";
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void sellProduct_sellAGameStarCraftOfAList5withStateAviableStore_4() {
		ArrayList<String> actorsMovie1 = new ArrayList<String>();
		actorsMovie1.add("Adam West");
		actorsMovie1.add("Sara Stone");
		
		ArrayList<String> actorsMovie2 = new ArrayList<String>();
		actorsMovie2.add("Miley Cirus");
		actorsMovie2.add("Sara Stone");
		
		Game game1 = new Game("Start Craft", "Strategy", 24.5, "Windows 10");
		Game game2 = new Game("Mario", "Strategy", 24.5, "Windows 10");
		Game game3 = new Game("Boberman", "Strategy", 24.5, "Windows 10");
		
		Movie movie1 = new Movie("Break Ball", "action", 0.99, actorsMovie2);
		Movie movie2 = new Movie("Wason", "action", 0.99, actorsMovie2);
		
		Store store = new Store();
		store.addProduct(game1);
		store.addProduct(game2);
		store.addProduct(game3);
		store.addProduct(movie1);
		store.addProduct(movie2);
		
		store.sellProduct("Start Craft");
		
		String actualResult = "" + store.getAviableProducts().size();
		String expectedResult = "4";
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void searchMovie_serachWithTitleBatman_The_movie_is_Batman() {
		ArrayList<String> actorsMovie1 = new ArrayList<String>();
		actorsMovie1.add("Adam West");
		actorsMovie1.add("Sara Stone");
		
		ArrayList<String> actorsMovie2 = new ArrayList<String>();
		actorsMovie2.add("Miley Cirus");
		actorsMovie2.add("Sara Stone");
		
		Movie movie1 = new Movie("Batman", "action", 9.99, actorsMovie1);
		Movie movie2 = new Movie("Break Ball", "action", 0.99, actorsMovie2);
		
		Store store = new Store();
		store.addProduct(movie1);
		store.addProduct(movie2);
		
		Movie actualMovieResult = (Movie) store.searchProductAviable("Batman");
		
		String expectedResult  = "The movie is: Batman";
		String actualResult  = actualMovieResult.printTitle();
		
		assertEquals(expectedResult, actualResult);
	}

}
