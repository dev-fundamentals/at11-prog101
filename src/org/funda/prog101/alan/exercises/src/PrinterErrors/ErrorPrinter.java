package PrinterErrors;

public class ErrorPrinter {

	public String printError(String colors) {
		// TODO Auto-generated method stub
		char[] colorsChar = colors.toCharArray();
		int countErrors = 0;
		int colorsCharLength = colorsChar.length;
		String errorsPrinters;
		
		for (int i = 0; i < colorsCharLength; i++) {
			if (colorsChar[i] > 'm') {
				countErrors++;
			}
		}
		
		errorsPrinters = countErrors  + "/" + colorsCharLength;
		return errorsPrinters;
		//colors.repla
		//String pruebacolor = colors.replaceAll("[a-m]", "");
		//return pruebacolor + "/"+ colors.length();
		
	}

}
