package com.money.coins;

public class Money {
	protected int amount;

	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return amount == money.amount;
	}
}