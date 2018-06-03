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
			String userAnswer = JOptionPane.showInputDialog("Give me a word");

			while(x.hasNextLine()){
				String word = x.nextLine();
				if (word.length() == userAnswer.length()) {
					getthewords.add(word);
				}
			}
			System.out.println("hi");
			System.out.println(getthewords.size());
			
			for (int i = getthewords.size()-1; i>=0; i--) {
				System.out.println(i);
				for (int j = 0; j < userAnswer.length(); j++) {
					if (getthewords.get(i).contains(Character.toString(userAnswer.charAt(j))) == false) {
						getthewords.remove(getthewords.get(i));
						break;
					}
				}
			}
			System.out.println(getthewords);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
