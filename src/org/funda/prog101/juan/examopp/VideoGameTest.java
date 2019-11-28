package examopp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VideoGameTest {

	@Test
	void testAddNewVideGame() {
		VideoGame videoGame1 = new VideoGame(2, "mariobross", 
				ProdutCategory.Accion, ProductStatus.InStoreDamaget, 5.2, "2.2");
		assertEquals(videoGame1.id, 2);
		assertEquals(videoGame1.title, "mariobross");
		assertEquals(videoGame1.category, ProdutCategory.Accion);
		assertEquals(videoGame1.status, ProductStatus.InStoreDamaget);
		assertEquals(videoGame1.getVersion(), "2.2");
	}
}