package C212.extra;

import java.util.*;

public class E15_8 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		String sentence = "Mary had a little lamb.";

		Scanner in = new Scanner(sentence);	
		while (in.hasNext()) {
			s.push(in.next());
			System.out.println(s);
		}
		String result = "";
		while ( !s.empty()) {
			result = " " + s.pop();
		}
		System.out.println(result);
	}
}