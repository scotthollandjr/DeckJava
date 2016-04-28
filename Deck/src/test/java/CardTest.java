import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;


public class CardTest {

  @Test public void cardInstantiates_true() {
    Card testCard = new Card("Ace", "Spades");
    assertEquals(true, testCard instanceof Card);
  }

  @Test public void cardSuitReturn_String() {
    Card testCard = new Card("Ace", "Spades");
    assertEquals("Spades", testCard.findSuit());
  }

  @Test public void cardValReturn_String() {
    Card testCard = new Card("Ace", "Spades");
    assertEquals("Ace", testCard.findValue());
  }

  @Test public void cardNameReturn_String() {
    Card testCard = new Card("Ace", "Spades");
    assertEquals("Ace of Spades", testCard.findName());
  }
}
