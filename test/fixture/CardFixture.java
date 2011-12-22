package fixture;

import java.util.ArrayList;
import java.util.List;

import br.com.dojo.poker.Card;

public class CardFixture {

	private static CardFixture fixture = new CardFixture();
	private List<Card> hand = new ArrayList<Card>();

	public static CardFixture get() {
		return fixture;
	}

	public CardFixture withStraightFlushHandStartingWithOne() {
		hand.add(new Card("Copa", "10"));
		hand.add(new Card("Copa", "J"));
		hand.add(new Card("Copa", "Q"));
		hand.add(new Card("Copa", "K"));
		hand.add(new Card("Copa", "A"));
		return this;
	}

	public List<Card> build() {
		return this.hand;
	}

}
