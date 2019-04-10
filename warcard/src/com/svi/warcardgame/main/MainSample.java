package com.svi.warcardgame.main;

import java.io.Closeable;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

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
