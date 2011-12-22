package br.com.dojo.poker;
import java.util.ArrayList;
import java.util.List;

import br.com.dojo.poker.Card;

public class BestHandDetector {

	private static final String HAND_POKER = "Poker";
	private static final String HAND_ROYAL_FLUSH = "Royal Flush";
	private static final String HAND_STRAIGTH_FLUSH = "Straigth Flush";

	public String bestHand(List<Card> hand) {

		String bestHand = "";
		if (isRoyalFlush(hand)) {
			bestHand = HAND_ROYAL_FLUSH;
		} else if (isStraightFlush(hand)) {
			bestHand = HAND_STRAIGTH_FLUSH;
		} else {
			bestHand = HAND_POKER;
		}
		return bestHand;

	}

	private boolean isRoyalFlush(List<Card> hand) {
		List<String> cards = new ArrayList<String>();
		buildRoyalFlushHand(cards);

		String currentNype = hand.get(0).getNype();
		for (Card card : hand) {
			String nype = card.getNype();
			if (!currentNype.equals(nype))
				break;
			if (!cards.contains(card.getNumber()))
				break;

			cards.remove(card.getNumber());
		}
		return cards.isEmpty();
	}

	private boolean isStraightFlush(List<Card> hand) {
		List<String> cards = new ArrayList<String>();

		buildStraightFlushHand(cards);

		String currentNype = hand.get(0).getNype();
		for (Card card : hand) {
			String nype = card.getNype();
			if (!currentNype.equals(nype))
				break;
			if (!cards.contains(card.getNumber()))
				break;

			cards.remove(card.getNumber());
		}
		return cards.isEmpty();
	}

	private void buildStraightFlushHand(List<String> cards) {
		cards.add("9");
		cards.add("10");
		cards.add("J");
		cards.add("Q");
		cards.add("K");
	}

	private void buildRoyalFlushHand(List<String> cards) {
		cards.add("10");
		cards.add("J");
		cards.add("Q");
		cards.add("K");
		cards.add("A");
	}

}
