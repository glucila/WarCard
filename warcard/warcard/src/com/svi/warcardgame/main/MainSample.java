package com.svi.warcardgame.main;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.svi.warcardgame.objects.Cards;
import com.svi.warcardgame.values.CardRank;
import com.svi.warcardgame.values.Suits;

public class MainSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		StreamTokenizer streamTokenizer = new StreamTokenizer(
//		        new StringReader("Mary had 1 little lamb..."));
//
//		while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
//			System.out.println("streamTokenizer.sval " + streamTokenizer.sval);
////		    if(streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
////		        System.out.println("TT_WORD " + streamTokenizer.sval);
////		    } else if(streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
////		        System.out.println("TT_NUMBER " + streamTokenizer.nval);
////		    } else if(streamTokenizer.ttype == StreamTokenizer.TT_EOL) {
////		        System.out.println();
////		    }
//
//		}
//		((Closeable) streamTokenizer).close();
		
		String cardString = "D-A";
		
		String[] cardParts = cardString.split("-");
	}

}
// initial deck 
public static ArrayList<Cards> inputStream() {
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

public static ArrayList <Cards> stringTokenizer() {
	
	ArrayList <Cards> initialDeck = new ArrayList <Cards>();
	String temporaryDeck = new String ();
	StringTokenizer tokenizer = new StringTokenizer (temporaryDeck, ",");
	while (tokenizer.hasMoreTokens()) {
		String tempToken = tokenizer.nextToken();
		String[] tempStrArray = tempToken.split("-");
		CardRank rank = getRank(tempStrArray[1]); 
		Suits suit = getSuit(tempStrArray[0]); 
		if (rank != null && suit != null) {
			Cards card = new Cards(rank.getCardRankValue(),rank.getCardRankName(),suit.getsuitValue(),suit.getsuitName());
			initialDeck.add(card);
		}
	}
	System.out.println("Initial Deck: ");
	System.out.println(initialDeck);

	return initialDeck;
}

