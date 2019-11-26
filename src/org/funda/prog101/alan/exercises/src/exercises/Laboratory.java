package exercises;

public class Laboratory {
	
	private char microbios [];

	public Laboratory(char[] microbios) {
		this.microbios = microbios; 
	}

	public char [] Pollute(int containerStart, int containerToPollute) {
		char containerMicroStart = microbios[containerStart]; 
		switch (containerMicroStart) {
			case 'A':
				if (microbios[containerToPollute] == 'A') {
					microbios[containerToPollute + 1]= 'A';
				}
				break;
			case 'R':
				microbios[containerToPollute] = 'R';
						
				break;
			case 'V':
				for (int i = containerToPollute ; i < microbios.length; i +=2) {
					microbios[i] = 'V';
				}
			}
			return microbios; 
		
	}

	public String getString() {
		String stringMicrobios;
		stringMicrobios = String.valueOf(microbios);
		return stringMicrobios;
	}
	
	
	

}
