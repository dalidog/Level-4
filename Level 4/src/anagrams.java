import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class anagrams {
	public static void main(String[] args) {
		try {
			File words = new File("src/words.txt");
			Scanner x = new Scanner(words);
			ArrayList<String> getthewords = new ArrayList<String>();
			ArrayList<Character> permanent = new ArrayList<Character>();
			ArrayList<Character> checking = new ArrayList<Character>();
			String userAnswer = JOptionPane.showInputDialog("Give me a word");

			for (int i = 0; i < userAnswer.length(); i++) {
				permanent.add(userAnswer.charAt(i));
			}

			while (x.hasNextLine()) {
				String word = x.nextLine();
				if (word.length() == userAnswer.length()) {
					getthewords.add(word);

				}
			}

			for (int i = getthewords.size() - 1; i >= 0; i--) {
				checking.clear();
				for (int j = 0; j < getthewords.get(i).length(); j++) {
					getthewords.get(i).length();
					checking.add(getthewords.get(i).charAt(j));
				}
				for (int j = 0; j < permanent.size(); j++) {
					for (int k = 0; k < checking.size(); k++) {
						if (permanent.get(j).equals(checking.get(k))) {
							checking.remove(k);
							break;
						}

					}
					
				}
				if (checking.isEmpty() == false) {
					getthewords.remove(i);
				}
			}
		
			System.out.println(getthewords);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
