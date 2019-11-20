package Assignment2Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquarelotronTest {

	@Test
	public void testUpsideDownFlipWhenSquarelotronsSizeIs4AndRing1() {
		int sizeOfSquarelotron = 4;
		Squarelotron squarelotron = new Squarelotron(sizeOfSquarelotron);
		Squarelotron expected = squarelotron.upsideDownFlip(1);
		
		assertEquals(expected.squarelotron[0][0], 13);
		assertEquals(expected.squarelotron[0][1], 14);
		assertEquals(expected.squarelotron[0][2], 15);
		assertEquals(expected.squarelotron[0][3], 16);
	}
	
	@Test
	public void testUpsideDownFlipWhenSquarelotronsSizeIs5AndRing2() {
		int sizeOfSquarelotron = 5;
		Squarelotron squarelotron = new Squarelotron(sizeOfSquarelotron);
		Squarelotron expected = squarelotron.upsideDownFlip(2);
		
		assertEquals(expected.squarelotron[1][1], 17);
		assertEquals(expected.squarelotron[1][2], 18);
		assertEquals(expected.squarelotron[1][3], 19);
	}
	
	@Test
	public void testMainDiagonalFlipWhenSquarelotronsSizeIs4AndRing1() {
		int size = 4;
		Squarelotron squarelotron = new Squarelotron(size);
		Squarelotron expected = squarelotron.mainDiagonalFlip(1);
		
		assertEquals(expected.squarelotron[0][0], 1);
		assertEquals(expected.squarelotron[0][1], 5);
		assertEquals(expected.squarelotron[0][2], 9);
		assertEquals(expected.squarelotron[0][3], 13);
	}
	
	@Test
	public void testMainDiagonalFlipWhenSquarelotronsSizeIs5AndRing2() {
		int size = 5;
		Squarelotron squarelotron = new Squarelotron(size);
		Squarelotron expected = squarelotron.mainDiagonalFlip(2);
		
		assertEquals(expected.squarelotron[1][1], 7);
		assertEquals(expected.squarelotron[1][2], 12);
		assertEquals(expected.squarelotron[1][3], 17);
	}
	
	@Test
	public void testRotateRightWhenSizeIs4AndNumberRotatesIs1() {
		int size = 4;
		Squarelotron squarelotron = new Squarelotron(size);
		squarelotron.rotateRight(1);
		
		assertEquals(squarelotron.squarelotron[0][0], 13);
		assertEquals(squarelotron.squarelotron[0][1], 9);
		assertEquals(squarelotron.squarelotron[0][2], 5);
		assertEquals(squarelotron.squarelotron[0][3], 1);
	}
	
	@Test
	public void testRotateRightWhenSizeIs5AndNumberRotatesIs2() {
		int size = 5;
		Squarelotron squarelotron = new Squarelotron(size);
		squarelotron.rotateRight(2);
		
		assertEquals(squarelotron.squarelotron[0][0], 25);
		assertEquals(squarelotron.squarelotron[0][1], 24);
		assertEquals(squarelotron.squarelotron[0][2], 23);
		assertEquals(squarelotron.squarelotron[0][3], 22);
		assertEquals(squarelotron.squarelotron[0][4], 21);
	}
	
	@Test
	public void testRotateRightWhenSizeIs3AndNumberRotatesIs0() {
		int size = 3;
		Squarelotron squarelotron = new Squarelotron(size);
		squarelotron.rotateRight(0);
		
		assertEquals(squarelotron.squarelotron[0][0], 1);
		assertEquals(squarelotron.squarelotron[0][1], 2);
		assertEquals(squarelotron.squarelotron[0][2], 3);
	}
	
	@Test
	public void testRotateRightWhenSizeIs3AndNumberRotatesIs_2() {
		int size = 3;
		Squarelotron squarelotron = new Squarelotron(size);
		squarelotron.rotateRight(-2);
		
		assertEquals(squarelotron.squarelotron[0][0], 9);
		assertEquals(squarelotron.squarelotron[0][1], 8);
		assertEquals(squarelotron.squarelotron[0][2], 7);
	}
}
