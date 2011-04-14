import java.util.ArrayList;
import java.util.List;

public class BestHandDetector {

	private static final String HAND_ROYAL_FLUSH = "Royal Flush";

	public String bestHand(List<Card> hand) {

		String choice = HAND_ROYAL_FLUSH;

		List<String> cards = new ArrayList<String>();
		choice = isRoyalFlush(hand, cards) ? HAND_ROYAL_FLUSH : "";

		return choice;

	}

	private boolean isRoyalFlush(List<Card> hand, List<String> cards) {
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

	private void buildRoyalFlushHand(List<String> cards) {
		cards.add("10");
		cards.add("J");
		cards.add("Q");
		cards.add("K");
		cards.add("A");
	}

}
