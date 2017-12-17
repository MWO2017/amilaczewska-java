package am.j2.palindrom;

public class PalindromApp {

	public static void main(String[] args) {
		Palindrom text1 = new Palindrom("Kajak");
		Palindrom text2 = new Palindrom("kajak !?");
		String txt="Iwono, ty rabuj okop spokoju barytonowi";
		Palindrom text3 = new Palindrom(txt);
		System.out.println(text1.getTextToCheck()+" is palindrom?: "+text1.check());
		System.out.println(text2.getTextToCheck()+" is palindrom?: "+text2.check());
		System.out.println(text3.getTextToCheck()+" is palindrom?: "+text3.check());
	}

}
