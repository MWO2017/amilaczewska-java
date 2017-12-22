package am.j2.palindrom;

public class Palindrom {
	private String textToCheck;
	
	public Palindrom(String textToCheck) {
		this.textToCheck = textToCheck;
	}

	public String getTextToCheck() {
		return textToCheck;
	}

	public void setTextToCheck(String textToCheck) {
		this.textToCheck = textToCheck;
	}

	public boolean check(){
		boolean isPalindrom=true;
		// jesli wystepuje '-' wtedy sprawdzanie bedzie niepoprawne
		String textToCheckCut=this.textToCheck.replaceAll("[\\s,./\"\':;?!]", "").toLowerCase();
		int textLength = textToCheckCut.length();
		for (int i=0; i<textLength/2; i++) {
			if (textToCheckCut.charAt(i)!=textToCheckCut.charAt(textLength-1-i)) {
				isPalindrom=false;
				return isPalindrom;
			}
		}
		return isPalindrom;
	}
}
