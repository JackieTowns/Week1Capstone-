import java.util.Scanner;

public class PigLatinTranslator4 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Pig Latin Translator!!");



		String userInput = "y";
		String yourLine;

		
		do { 
			System.out.println("Enter line to be translated: ");
			yourLine = scnr.nextLine();

			String [] splitWords;
			String lowerConvert = yourLine.toLowerCase();
			splitWords = lowerConvert.split(" ");

			String yourNewWordVow = "";
			String yourNewWordCon = "";

			for (String finalWord : splitWords) {
				
				if (finalWord.startsWith("a")  || finalWord.startsWith("e") || finalWord.startsWith("i")
						|| finalWord.startsWith("o") || finalWord.startsWith("u")) {

					yourNewWordVow = finalWord + "way";
					// System.out.println(finalWord + "way");
				} else {
					// System.out.println(finalWord.substring(1) + finalWord.substring(0, 1) +
					// "ay");
					//if (finalWord.length() > 0)
						yourNewWordCon = (finalWord.substring(1) + finalWord.substring(0, 1) + "ay");
				}

				String newSentence = yourNewWordVow + " " + yourNewWordCon;
				System.out.print(newSentence);
			}

			System.out.println();
			System.out.println();
			System.out.println("Translate another line? (y/n): ");

			userInput = scnr.nextLine();

		} while (userInput.equals("y"));

		System.out.println("I'm done talking in Pig Latin now, thank you.");

		scnr.close();
	}
}

			



