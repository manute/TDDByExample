package com.example;

import java.util.Hashtable;

class Bank {

	private Hashtable<Pair, Integer> rates = new Hashtable<Pair, Integer>();

	Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}

	void addRate(String from, String to, int rate) {

		rates.put(new Pair(from, to), new Integer(rate));
	}

	int rate(String from, String to) {
		if (from.equals(to)){
			return 1;
		}
		Integer rate = (Integer) rates.get(new Pair(from, to));
		return rate.intValue();

	}

}
