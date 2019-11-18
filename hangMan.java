
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//import java.io.OutputStream;


public class hangMan{
	private String s1 = "bagel";
	private int badGuess = 0;
	private int goodGuess = 0;
	private String input;
	private String d = "";
	private int ind = 0;
	private char[] charArr;
	private char c;
	
	hangMan(){
		System.out.println(" +----+\r\n" + 
				" |    |\r\n" + 
				"      |\r\n" + 
				"      |\r\n" + 
				"      |\r\n" + 
				"      |\r\n" + 
				"=========");
	}
	
	boolean charChecker(String a) {
		if (s1.contains(a)) {
			return true;
		}
		return false;
		
	}
	
	String dashGenerator() {
		for (int i=0; i<s1.length(); i++) {
			d = d + "_ ";
		}
		charArr = d.toCharArray();
		System.out.println(d);
		return d;
		
	}
	
	void levelPrinter() {
		Scanner in = new Scanner(System.in);
		HashSet<String> hs = new HashSet<>();
		while(badGuess<=5 && goodGuess!=s1.length()) {
			
			System.out.println("\nGuess a letter: ");
			input = in.next();
			if (charChecker(input)) {
				c = input.charAt(0);
				ind = s1.indexOf(input);
				if (ind>0) {
					charArr[s1.indexOf(input)*2] = c;
				}
				else charArr[s1.indexOf(input)] = c;
				System.out.println(charArr);
				goodGuess++;
			}
			else {
				if (hs.contains(input)) System.out.println("You've already tried that letter");
				hs.add(input);
				
				Iterator<String> i = hs.iterator();
				System.out.println("Letters you've tried: ");
				while(i.hasNext()) {
					System.out.print(i.next() + " ");
				}
				badGuess++;
				if (badGuess==1) Level2();
				if (badGuess==2) Level3();
				if (badGuess==3) Level4();
				if (badGuess==4) Level5();
				if(badGuess==5) Level6();
				if (badGuess==6) {
					Level7();
					End();			
					}
				System.out.println(charArr);
				
			}
	
				
			
		}
		
		if (goodGuess == s1.length()) System.out.println("You won");
		
	}
	
	
	
	void Level1() {
		System.out.println(" \n+----+\r\n" + 
				" |    |\r\n" + 
				"      |\r\n" + 
				"      |\r\n" + 
				"      |\r\n" + 
				"      |\r\n" + 
				"=========");
	}
	void Level2() {
		System.out.println(" \n+---+\r\n" + 
				"  |   |\r\n" + 
				"  O   |\r\n" + 
				"      |\r\n" + 
				"      |\r\n" + 
				"      |\r\n" + 
				"=========");
	}
	void Level3() {
		System.out.println(" \n+---+\r\n" + 
				"  |   |\r\n" + 
				"  O   |\r\n" + 
				"  |   |\r\n" + 
				"      |\r\n" + 
				"      |\r\n" + 
				"=========");
	}
	void Level4() {
		System.out.println("  \n+---+\r\n" + 
				"  |   |\r\n" + 
				"  O   |\r\n" + 
				" /|   |\r\n" + 
				"      |\r\n" + 
				"      |\r\n" + 
				"=========");
	}
	void Level5() {
		System.out.println("\r\n" + 
				"  +---+\r\n" + 
				"  |   |\r\n" + 
				"  O   |\r\n" + 
				" /|\\  |\r\n" + 
				"      |\r\n" + 
				"      |\r\n" + 
				"=========\r\n" + 
				"");
	}
	void Level6() {
		System.out.println(" \n+---+\r\n" + 
				"  |   |\r\n" + 
				"  O   |\r\n" + 
				" /|\\  |\r\n" + 
				" /    |\r\n" + 
				"      |\r\n" + 
				"=========");
	}
	void Level7() {
		System.out.println("\r\n" + 
				"  +---+\r\n" + 
				"  |   |\r\n" + 
				"  O   |\r\n" + 
				" /|\\  |\r\n" + 
				" / \\  |\r\n" + 
				"      |\r\n" + 
				"=========");
	}
	static void End() {
		System.out.println(" |_______________``\\\r\n" + 
				"    [/]           [  ]\r\n" + 
				"    [\\]           | ||\r\n" + 
				"    [/]           |  |\r\n" + 
				"    [\\]           |  |\r\n" + 
				"    [/]           || |\r\n" + 
				"   [---]          |  |\r\n" + 
				"   [---]          |@ |\r\n" + 
				"   [---]          |  |\r\n" + 
				"  oOOOOOo         |  |\r\n" + 
				" oOO___OOo        | @|\r\n" + 
				"oO/|||||\\Oo       |  |\r\n" + 
				"OO/|||||\\OOo      |  |\r\n" + 
				"*O\\ x x /OO*      |  |\r\n" + 
				"/*|  c  |O*\\      |  |\r\n" + 
				"   \\_O_/    \\     |  |\r\n" + 
				"    \\#/     |     |  |\r\n" + 
				" |       |  |     | ||\r\n" + 
				" |       |  |_____| ||__\r\n" + 
				"_/_______\\__|  \\  ||||  \\\r\n" + 
				"/         \\_|\\  _ | ||\\  \\\r\n" + 
				"|    V    |\\  \\//\\  \\  \\  \\\r\n" + 
				"|    |    | __//  \\  \\  \\  \\\r\n" + 
				"|    |    |\\|//|\\  \\  \\  \\  \\\r\n" + 
				"------------\\--- \\  \\  \\  \\  \\\r\n" + 
				"\\  \\  \\  \\  \\  \\  \\  \\  \\  \\  \\\r\n" + 
				"_\\__\\__\\__\\__\\__\\__\\__\\__\\__\\__\\\r\n" + 
				"__|__|__|__|__|__|__|__|__|__|__|\r\n" + 
				"|___| |___|\r\n" + 
				"|###/ \\###|\r\n" + 
				"\\##/   \\##/\r\n" + 
				" ``     `` \r\n" + 
				"\r\n" + 
				"");
	}
	
	public static void main(String[] args) {
		hangMan h = new hangMan();
		h.dashGenerator();
		h.levelPrinter();
		
		
	}	
}

