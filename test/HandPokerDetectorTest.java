import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HandPokerDetectorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void shouldDetectARoyalFlush() {

		final List<Card> hand = new ArrayList<Card>();

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

		BestHandDetector detector = new BestHandDetector();
		String bestHand = detector.bestHand(hand);

		Assert.assertEquals("Deveria retornar Royal Flush", "Royal Flush", bestHand);

	}
}
