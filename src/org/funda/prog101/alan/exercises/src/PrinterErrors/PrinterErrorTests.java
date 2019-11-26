package PrinterErrors;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrinterErrorTests {

	@Test
	public void Print_WhenSendaaabbbbhaijjjm_expected0_14() {
		ErrorPrinter print = new ErrorPrinter();
		String actual = print.printError("aaabbbbhaijjjm");
		String expected = "0/14";
		assertEquals(expected, actual);
	}
	
	@Test
	public void Print_WhenSendaaaxbbbbyyhwawiwjjjwwm_expected8_22() {
		ErrorPrinter print = new ErrorPrinter();
		String actual = print.printError("aaaxbbbbyyhwawiwjjjwwm");
		String expected = "8/22";
		assertEquals(expected, actual);
	}
	
	@Test
	public void Print_WhenSendaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz_expected3_56() {
		ErrorPrinter print = new ErrorPrinter();
		String actual = print.printError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz");
		String expected = "3/56";
		assertEquals(expected, actual);
	}

}
