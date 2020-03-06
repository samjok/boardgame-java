package boardgame;

import java.util.*;

// class for deck
public class CardDeck {
  private static final ArrayList<Card> deck = new ArrayList<>();

  public CardDeck() {
    for(int i=0; i<4; i++) {
      for(int j=2; j<15; j++) {
        deck.add(new Card(i, j));
      }
    }
  }
	
  public Card getCard() {
    int lastIndex = deck.size() - 1;
    Card takenCard = deck.get(lastIndex);
    deck.remove(lastIndex);
    return takenCard;
  }
	
  public void shuffleDeck() {
    Collections.shuffle(deck);
  }
}