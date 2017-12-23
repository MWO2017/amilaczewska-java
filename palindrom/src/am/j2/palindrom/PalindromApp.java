package am.j2.palindrom;

public class PalindromApp {

	public static void main(String[] args) {
		Palindrom text1 = new Palindrom("Kajak");
		Palindrom text2 = new Palindrom("kajak !?");
		String txt = "Iwono, ty rabuj okop spokoju barytonowi";
		Palindrom text3 = new Palindrom(txt);
		// bug w przypadku zastosowania znaku - zosta³ naprawiony
		String txt2 = "ale ma palac - oto cala Pamela";
		Palindrom text4 = new Palindrom(txt2);
		Palindrom text5 = new Palindrom("example");
		System.out.println("Is \'"+text1.getTextToCheck() + "\' a palindrom?: " + text1.check());
		System.out.println("Is \'"+text2.getTextToCheck() + "\' a palindrom?: " + text2.check());
		System.out.println("Is \'"+text3.getTextToCheck() + "\' a palindrom?: " + text3.check());
		// zwraca true
		System.out.println("Is \'"+text4.getTextToCheck() + "\' a palindrom?: " + text4.check());
		System.out.println("Is \'"+text5.getTextToCheck() + "\' a palindrom?: " + text5.check());

	}

}
