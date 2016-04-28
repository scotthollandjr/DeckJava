import java.util.ArrayList;
import java.util.Arrays;

public class Card {

  private String mVal;
  private String mSuit;
  private String mName;

  public Card(String val, String suit) {
    mVal = val;
    mSuit = suit;
    mName = val + " of " + suit;
  }

  public String findSuit() {
    return mSuit;
  }

  public String findValue() {
    return mVal;
  }

  public String findName() {
    return mName;
  }

}
