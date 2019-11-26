package digitalroot;

import static org.junit.Assert.*;

import org.junit.Test;

public class DRootTest {

	@Test
	public void DRoot_WhenSend16_Expected7() {
		DRoot root = new DRoot();;
		int send = 16;
		int actual = root.digitalRoot(send);
		int expected = 7;
		assertEquals(expected, actual);
	}
	
	@Test
	public void DRoot_WhenSend223_Expected7() {
		DRoot root = new DRoot();;
		int send = 223;
		int actual = root.digitalRoot(send);
		int expected = 7;
		assertEquals(expected, actual);
	}
	
	@Test
	public void DRoot_WhenSend2253_Expected7() {
		DRoot root = new DRoot();;
		int send = 2253;
		int actual = root.digitalRoot(send);
		int expected = 12;
		assertEquals(expected, actual);
	}

}
