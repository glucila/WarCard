package com.svi.warcardgame.objects;

public class Tokenizer {
	StringTokenizer st = new StringTokenizer("this is a test");
    while (st.hasMoreTokens()) {
        System.out.println(st.nextToken());
    }
}

/*output
this
is
a
test
*/