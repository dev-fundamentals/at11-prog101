package exercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class LaboratoryTest {

	@Test
	public void pollute_PolluteContainer2ToContainer5_ExpectedReplaceRedTo5() {
		char microbios[] = {'A','A','R','R','V','A','R','R','V'}; 
		Laboratory micro = new Laboratory(microbios);
		int containerStart = 2;
		int containerToPollute = 5;
		char[] actual = micro.Pollute(containerStart, containerToPollute);
		char [] expected = {'A','A','R','R','V','R','R','R','V'};
		assertArrayEquals(expected, actual);
		
	}
	@Test
	public void pollute_PolluteContainer0ToContainer1_ExpectedReplaceBlueTo1() {
		char microbios[] = {'A','A','R','R','V','A','R','R','V'}; 
		Laboratory micro = new Laboratory(microbios);
		int containerStart = 0;
		int containerToPollute = 1;
		char[] actual = micro.Pollute(containerStart, containerToPollute);
		char [] expected = {'A','A','A','R','V','A','R','R','V'};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	public void pollute_PolluteContainer7ToContainer8_ExpectedReplaceGreenTo02468() {
		char microbios[] = {'A','A','R','R','V','A','R','R','V'}; 
		Laboratory micro = new Laboratory(microbios);
		int containerStart = 4;
		int containerToPollute = 0;
		char[] actual = micro.Pollute(containerStart, containerToPollute);
		char [] expected = {'V','A','V','R','V','A','V','R','V'};
		assertArrayEquals(expected, actual);
		
	}
	@Test
	public void get_GetString_ExpectedGetstringOfArrayChar() {
		char microbios[] = {'A','A','R','R','V','A','R','R','V'}; 
		Laboratory micro = new Laboratory(microbios);
		int containerStart = 4;
		int containerToPollute = 0;
		micro.Pollute(containerStart, containerToPollute);
		String actual = micro.getString();
		String expected = "VAVRVAVRV";
		assertEquals(expected, actual);
		
	}

}
