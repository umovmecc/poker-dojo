import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.dojo.poker.BestHandDetector;
import br.com.dojo.poker.Card;
import fixture.CardFixture;

public class HandPokerDetectorTest {

	private BestHandDetector detector;
	private List<Card> hand;

	@Before
	public void setUp() throws Exception {
		this.detector = new BestHandDetector();
		hand = new ArrayList<Card>();
	}

	@Test
	public void shouldDetectARoyalFlush() {

		final Card firstCard = new Card("Copa", "10");
		final Card secondCard = new Card("Copa", "J");
		final Card thirdCard = new Card("Copa", "Q");
		final Card fourthCard = new Card("Copa", "K");
		final Card fifthCard = new Card("Copa", "A");

		hand.add(firstCard);
		hand.add(secondCard);
		hand.add(thirdCard);
		hand.add(fourthCard);
		hand.add(fifthCard);

		String bestHand = detector.bestHand(hand);

		assertEquals("Deveria retornar Royal Flush", "Royal Flush", bestHand);
	}

	@Test
	public void shouldDetectStraightFlushInitializingWithThree() {
		CardFixture.get().withStraightFlushHandStartingWithOne().build();
	}

	@Test
	public void shouldDetectStraightFlush() {
		final Card firstCard = new Card("Copa", "9");
		final Card secondCard = new Card("Copa", "10");
		final Card thirdCard = new Card("Copa", "J");
		final Card fourthCard = new Card("Copa", "Q");
		final Card fifthCard = new Card("Copa", "K");

		hand.add(firstCard);
		hand.add(secondCard);
		hand.add(thirdCard);
		hand.add(fourthCard);
		hand.add(fifthCard);

		String bestHand = detector.bestHand(hand);

		assertEquals("Deveria retornar Straigth Flush", "Straigth Flush", bestHand);
	}

	@Test
	public void shouldDetectPoker() {
		final Card firstCard = new Card("Copa", "A");
		final Card secondCard = new Card("Paus", "A");
		final Card thirdCard = new Card("Espada", "A");
		final Card fourthCard = new Card("Ouro", "A");
		final Card fifthCard = new Card("Copa", "2");

		hand.add(firstCard);
		hand.add(secondCard);
		hand.add(thirdCard);
		hand.add(fourthCard);
		hand.add(fifthCard);

		String bestHand = detector.bestHand(hand);

		assertEquals("Deveria retornar Poker", "Poker", bestHand);
	}

}
