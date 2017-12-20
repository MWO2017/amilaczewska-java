package am.j2.palindrom;

public class PalindromApp {

	public static void main(String[] args) {
		Palindrom text1 = new Palindrom("Kajak");
		Palindrom text2 = new Palindrom("kajak !?");
		String txt = "Iwono, ty rabuj okop spokoju barytonowi";
		Palindrom text3 = new Palindrom(txt);
		// bug w przypadku zastosowania znaku -
		String txt2 = "ale ma palac - oto cala Pamela";
		Palindrom text4 = new Palindrom(txt2);
		System.out.println(text1.getTextToCheck() + " is palindrom?: " + text1.check());
		System.out.println(text2.getTextToCheck() + " is palindrom?: " + text2.check());
		System.out.println(text3.getTextToCheck() + " is palindrom?: " + text3.check());
		// zwraca false
		System.out.println(text4.getTextToCheck() + " is palindrom?: " + text4.check());
	}

}
