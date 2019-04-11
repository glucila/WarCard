package com.svi.warcardgame.objects;

import java.io.File;
import java.util.Scanner;

public class InputStream {
	//opening file
			Scanner scanner = null;
			String temporaryDeck = null;
			try {
				scanner = new Scanner(new File("input.txt"));
				//	StreamTokenizer streamTokenizer = new StreamTokenizer ();

				while (scanner.hasNextLine()) {
					temporaryDeck = scanner.nextLine();
				}
			} catch (Exception e) {
				System.out.println("There is no file in that name. Please input a valid file");
			} finally {
				scanner.close();
			}
			return null;
			
		}
}