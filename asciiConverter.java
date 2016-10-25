import java.util.Scanner;

public class asciiConverter{
	
	public String text;
	public int value;
	public int[] asciiArray;
	public char aChar;
	
	public int[] getAscii(){
		
		int asciiValue;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many ASCII values do you want to convert ?");
		int sizeArray = scanner.nextInt();
		asciiArray = new int[sizeArray];
		
		for (int i=0; i<sizeArray; i++){
			scanner = new Scanner(System.in);
			System.out.println("Please enter the next ASCII value: ");
			asciiValue = scanner.nextInt();
			asciiArray[i] = asciiValue;
		}
		
		return asciiArray;
		
	}
	
	public String getText(){
		
		Scanner scanner = new Scanner(System.in);
		text = scanner.nextLine();
		return text;
		
	}
	
	private char toText(){
		
		char equivalent;
		switch (value){
			case 32: equivalent = ' ';
							return equivalent;
			case 33: equivalent = '!';
							return equivalent;
			case 34: equivalent = '\"';
							return equivalent;
			case 35: equivalent = '#';
							return equivalent;
			case 36: equivalent = '$';
							return equivalent;
			case 37: equivalent = '%';
							return equivalent;
			case 38: equivalent = '&';
							return equivalent;
			case 39: equivalent = '\'';
							return equivalent;
			case 40: equivalent = '(';
							return equivalent;
			case 41: equivalent = ')';
							return equivalent;
			case 42: equivalent = '*';
							return equivalent;
			case 43: equivalent = '+';
							return equivalent;
			case 44: equivalent = ',';
							return equivalent;
			case 45: equivalent = '-';
							return equivalent;
			case 46: equivalent = '.';
							return equivalent;
			case 47: equivalent = '/';
							return equivalent;
			case 48: equivalent = '0';
							return equivalent;
			case 49: equivalent = '1';
							return equivalent;
			case 50: equivalent = '2';
							return equivalent;
			case 51: equivalent = '3';
							return equivalent;
			case 52: equivalent = '4';
							return equivalent;
			case 53: equivalent = '5';
							return equivalent;
			case 54: equivalent = '6';
							return equivalent;
			case 55: equivalent = '7';
							return equivalent;
			case 56: equivalent = '8';
							return equivalent;
			case 57: equivalent = '9';
							return equivalent;
			case 58: equivalent = ':';
							return equivalent;
			case 59: equivalent = ';';
							return equivalent;
			case 60: equivalent = '<';
							return equivalent;
			case 61: equivalent = '=';
							return equivalent;
			case 62: equivalent = '>';
							return equivalent;
			case 63: equivalent = '?';
							return equivalent;
			case 64: equivalent = '@';
							return equivalent;
			case 65: equivalent = 'A';
							return equivalent;
			case 66: equivalent = 'B';
							return equivalent;
			case 67: equivalent = 'C';
							return equivalent;
			case 68: equivalent = 'D';
							return equivalent;
			case 69: equivalent = 'E';
							return equivalent;
			case 70: equivalent = 'F';
							return equivalent;
			case 71: equivalent = 'G';
							return equivalent;
			case 72: equivalent = 'H';
							return equivalent;
			case 73: equivalent = 'I';
							return equivalent;
			case 74: equivalent = 'J';
							return equivalent;
			case 75: equivalent = 'K';
							return equivalent;
			case 76: equivalent = 'L';
							return equivalent;
			case 77: equivalent = 'M';
							return equivalent;
			case 78: equivalent = 'N';
							return equivalent;
			case 79: equivalent = 'O';
							return equivalent;
			case 80: equivalent = 'P';
							return equivalent;
			case 81: equivalent = 'Q';
							return equivalent;
			case 82: equivalent = 'R';
							return equivalent;
			case 83: equivalent = 'S';
							return equivalent;
			case 84: equivalent = 'T';
							return equivalent;
			case 85: equivalent = 'U';
							return equivalent;
			case 86: equivalent = 'V';
							return equivalent;
			case 87: equivalent = 'W';
							return equivalent;
			case 88: equivalent = 'X';
							return equivalent;
			case 89: equivalent = 'Y';
							return equivalent;
			case 90: equivalent = 'Z';
							return equivalent;
			case 91: equivalent = '[';
							return equivalent;
			case 92: equivalent = '\\';
							return equivalent;
			case 93: equivalent = ']';
							return equivalent;
			case 94: equivalent = '^';
							return equivalent;
			case 95: equivalent = '_';
							return equivalent;
			case 96: equivalent = '`';
							return equivalent;
			case 97: equivalent = 'a';
							return equivalent;
			case 98: equivalent = 'b';
							return equivalent;
			case 99: equivalent = 'c';
							return equivalent;
			case 100: equivalent = 'd';
							return equivalent;
			case 101: equivalent = 'e';
							return equivalent;
			case 102: equivalent = 'f';
							return equivalent;
			case 103: equivalent = 'g';
							return equivalent;
			case 104: equivalent = 'h';
							return equivalent;
			case 105: equivalent = 'i';
							return equivalent;
			case 106: equivalent = 'j';
							return equivalent;
			case 107: equivalent = 'k';
							return equivalent;
			case 108: equivalent = 'l';
							return equivalent;
			case 109: equivalent = 'm';
							return equivalent;
			case 110: equivalent = 'n';
							return equivalent;
			case 111: equivalent = 'o';
							return equivalent;
			case 112: equivalent = 'p';
							return equivalent;
			case 113: equivalent = 'q';
							return equivalent;
			case 114: equivalent = 'r';
							return equivalent;
			case 115: equivalent = 's';
							return equivalent;
			case 116: equivalent = 't';
							return equivalent;
			case 117: equivalent = 'u';
							return equivalent;
			case 118: equivalent = 'v';
							return equivalent;
			case 119: equivalent = 'w';
							return equivalent;
			case 120: equivalent = 'x';
							return equivalent;
			case 121: equivalent = 'y';
							return equivalent;
			case 122: equivalent = 'z';
							return equivalent;
			case 123: equivalent = '{';
							return equivalent;
			case 124: equivalent = '|';
							return equivalent;
			case 125: equivalent = '}';
							return equivalent;
			case 126: equivalent = '~';
							return equivalent;
			default: equivalent = ' ';
							return equivalent;
			}
			
	}
	
	private int toAscii(){
		
		int equivalent;
		switch (aChar){
			case ' ': equivalent = 32;
							return equivalent;
			case '!': equivalent = 33;
							return equivalent;
			case '\"': equivalent = 34;
							return equivalent;
			case '#': equivalent = 35;
							return equivalent;
			case '$': equivalent = 36;
							return equivalent;
			case '%': equivalent = 37;
							return equivalent;
			case '&': equivalent = 38;
							return equivalent;
			case '\'': equivalent = 39;
							return equivalent;
			case '(': equivalent = 40;
							return equivalent;
			case ')': equivalent = 41;
							return equivalent;
			case '*': equivalent = 42;
							return equivalent;
			case '+': equivalent = 43;
							return equivalent;
			case ',': equivalent = 44;
							return equivalent;
			case '-': equivalent = 45;
							return equivalent;
			case '.': equivalent = 46;
							return equivalent;
			case '/': equivalent = 47;
							return equivalent;
			case '0': equivalent = 48;
							return equivalent;
			case '1': equivalent = 49;
							return equivalent;
			case '2': equivalent = 50;
							return equivalent;
			case '3': equivalent = 51;
							return equivalent;
			case '4': equivalent = 52;
							return equivalent;
			case '5': equivalent = 53;
							return equivalent;
			case '6': equivalent = 54;
							return equivalent;
			case '7': equivalent = 55;
							return equivalent;
			case '8': equivalent = 56;
							return equivalent;
			case '9': equivalent = 57;
							return equivalent;
			case ':': equivalent = 58;
							return equivalent;
			case ';': equivalent = 59;
							return equivalent;
			case '<': equivalent = 60;
							return equivalent;
			case '=': equivalent = 61;
							return equivalent;
			case '>': equivalent = 62;
							return equivalent;
			case '?': equivalent = 63;
							return equivalent;
			case '@': equivalent = 64;
							return equivalent;
			case 'A': equivalent = 65;
							return equivalent;
			case 'B': equivalent = 66;
							return equivalent;
			case 'C': equivalent = 67;
							return equivalent;
			case 'D': equivalent = 68;
							return equivalent;
			case 'E': equivalent = 69;
							return equivalent;
			case 'F': equivalent = 70;
							return equivalent;
			case 'G': equivalent = 71;
							return equivalent;
			case 'H': equivalent = 72;
							return equivalent;
			case 'I': equivalent = 73;
							return equivalent;
			case 'J': equivalent = 74;
							return equivalent;
			case 'K': equivalent = 75;
							return equivalent;
			case 'L': equivalent = 76;
							return equivalent;
			case 'M': equivalent = 77;
							return equivalent;
			case 'N': equivalent = 78;
							return equivalent;
			case 'O': equivalent = 79;
							return equivalent;
			case 'P': equivalent = 80;
							return equivalent;
			case 'Q': equivalent = 81;
							return equivalent;
			case 'R': equivalent = 82;
							return equivalent;
			case 'S': equivalent = 83;
							return equivalent;
			case 'T': equivalent = 84;
							return equivalent;
			case 'U': equivalent = 85;
							return equivalent;
			case 'V': equivalent = 86;
							return equivalent;
			case 'W': equivalent = 87;
							return equivalent;
			case 'X': equivalent = 88;
							return equivalent;
			case 'Y': equivalent = 89;
							return equivalent;
			case 'Z': equivalent = 90;
							return equivalent;
			case '[': equivalent = 91;
							return equivalent;
			case '\\': equivalent = 92;
							return equivalent;
			case ']': equivalent = 93;
							return equivalent;
			case '^': equivalent = 94;
							return equivalent;
			case '_': equivalent = 95;
							return equivalent;
			case '`': equivalent = 96;
							return equivalent;
			case 'a': equivalent = 97;
							return equivalent;
			case 'b': equivalent = 98;
							return equivalent;
			case 'c': equivalent = 99;
							return equivalent;
			case 'd': equivalent = 100;
							return equivalent;
			case 'e': equivalent = 101;
							return equivalent;
			case 'f': equivalent = 102;
							return equivalent;
			case 'g': equivalent = 103;
							return equivalent;
			case 'h': equivalent = 104;
							return equivalent;
			case 'i': equivalent = 105;
							return equivalent;
			case 'j': equivalent = 106;
							return equivalent;
			case 'k': equivalent = 107;
							return equivalent;
			case 'l': equivalent = 108;
							return equivalent;
			case 'm': equivalent = 109;
							return equivalent;
			case 'n': equivalent = 110;
							return equivalent;
			case 'o': equivalent = 111;
							return equivalent;
			case 'p': equivalent = 112;
							return equivalent;
			case 'q': equivalent = 113;
							return equivalent;
			case 'r': equivalent = 114;
							return equivalent;
			case 's': equivalent = 115;
							return equivalent;
			case 't': equivalent = 116;
							return equivalent;
			case 'u': equivalent = 117;
							return equivalent;
			case 'v': equivalent = 118;
							return equivalent;
			case 'w': equivalent = 119;
							return equivalent;
			case 'x': equivalent = 120;
							return equivalent;
			case 'y': equivalent = 121;
							return equivalent;
			case 'z': equivalent = 122;
							return equivalent;
			case '{': equivalent = 123;
							return equivalent;
			case '|': equivalent = 124;
							return equivalent;
			case '}': equivalent = 125;
							return equivalent;
			case '~': equivalent = 126;
							return equivalent;
			default: equivalent = 0;
							return equivalent;
			}
		
	}

	public String convertAtoT(){
		
		int lengthofArray = asciiArray.length;
		char[] wordInChar = new char[lengthofArray];
		for (int i=0; i<lengthofArray; i++){
			value = asciiArray[i];
			wordInChar[i] = toText();
		}
		String wordInStr = new String(wordInChar);
		return wordInStr;
	}
	
	public int[] convertTtoA(){
		
		char[] charArray = text.toCharArray();
		asciiArray = new int[charArray.length];
		for (int i=0; i<charArray.length; i++){
			aChar = charArray[i];
			asciiArray[i] = toAscii();
		}
		return asciiArray;
		
	}
	
}
