package GuessTheMovie;

public class HiderTextLine {
	
	private String alphabetRegex;
	private String elementToHideTitle;
	private String elementToHideReguex;
	
	public HiderTextLine() {
		
		alphabetRegex = "a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|w|x|y|z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z";
		elementToHideTitle = "_";
		elementToHideReguex = "-";
	}
	
	public boolean uploadRegex(String letterAnswer) {
		boolean result = true;
		
		String newRegx = "";
		String auxRegex = "";
		
		if (auxRegex.length() == 0) {
			auxRegex = letterAnswer;
		}else {
			auxRegex = auxRegex + "|" + letterAnswer;
		}
		
		if (letterAnswer.compareTo("") == 0) {
			System.out.println("Wrong letter!\nTry Again");
			newRegx = alphabetRegex;
		}else {
			newRegx = alphabetRegex.replaceAll(auxRegex, elementToHideReguex);
		}
		
		if (alphabetRegex.compareTo(newRegx) == 0) {
			result = false; 
		} else {
			result = true;
		}
		
		alphabetRegex = newRegx;
		
		return result;
	}
	
	public String hideMovieTitle(String movietitle) {
		movietitle = movietitle.replaceAll(alphabetRegex, elementToHideTitle);
		return movietitle;
	}
}
