import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DeckTest {

  @Test public void decktest_returnDeck_true(){
    int counting = 0;
    Deck testDeck = new Deck();
    ArrayList<Card> doubleDeck = new ArrayList<Card>();
    doubleDeck = testDeck.getCards();
    ArrayList<Object> expected = new ArrayList<Object>();
    while (counting < 52) {
      expected.add("card");
      counting++;
    }
    System.out.println(testDeck);
    assertEquals(expected.size(), doubleDeck.size());
  }

  @Test public void decktest_containsCards_String() {
    Deck testDeck = new Deck();
    ArrayList<String> stringDeck = testDeck.getNames();
    String expected = "Ace of Spades";
    System.out.println(stringDeck);
    assertTrue(stringDeck.contains(expected));
  }

  
}
