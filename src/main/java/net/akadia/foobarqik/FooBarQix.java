package net.akadia.foobarqik;

import java.io.PrintWriter;
import java.util.Map;

import com.google.common.collect.ImmutableSortedMap;

@SuppressWarnings("javadoc")
public class FooBarQix {

	private static Map<Character, String> fbqMap = ImmutableSortedMap.of('3', "Foo", '5', "Bar", '7', "Qix");

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("FooBarQix.txt");

		try {
			for (int i = 1; i <= 1000; i++) {
				pw.println(i + "," + valueOf(i));
			}
		} finally {
			if (null != pw) {
				pw.flush();
				pw.close();
			}
		}
	}

	public static String valueOf(int number) {
		final StringBuilder value = new StringBuilder();

		for (Character key : fbqMap.keySet()) {
			if (number % Character.getNumericValue(key) == 0) {
				value.append(fbqMap.get(key));
			}
		}

		for (char c : String.valueOf(number).toCharArray()) {
			if (fbqMap.containsKey(c)) {
				value.append(fbqMap.get(c));
			}
		}

		if (0 == value.length()) {
			return Integer.toString(number);
		}

		return value.toString();
	}

}
