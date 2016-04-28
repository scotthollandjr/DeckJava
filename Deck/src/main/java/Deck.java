import java.util.ArrayList;
import java.util.Arrays;

public class Deck {
  private String[] suitArr = {"Diamonds", "Clubs", "Hearts", "Spades"};
  private String[] valArr = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

  private ArrayList<Card> mCards;
  private ArrayList<String> mCardName;

  public Deck() {
    mCards = new ArrayList<Card>();
    for (String value : valArr) {
      for (String suit : suitArr) {
        Card newCard = new Card(value, suit);
        mCards.add(newCard);
      }
    }
  }

  public ArrayList<Card> getCards() {
    return mCards;
  }

  public ArrayList<String> getNames() {
    mCardName = new ArrayList<String>();
    for (Card card : mCards){
      mCardName.add(card.findName());
    }
    return mCardName;
  }

  public int deckSize(){
  ArrayList<Card> newDeck = new ArrayList<Card>();
    for (String suit : suitArr) {
      for (String value : valArr) {
        Card newCard = new Card(suit, value);
        newDeck.add(newCard);
      }
    }
    return newDeck.size();
  }
}
