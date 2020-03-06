package boardgame;

// class for playcard
public class Card {
  public final String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
  public final String[] faceCards = {"Jack", "Queen", "King", "Ace"};
		
  private int suit;
  private int value;

  public Card(int suit, int value) {
    if(suit > -1 && suit < 4)
	  this.suit = suit;
	if(value > 1 && value < 15)
	  this.value = value;
  }
		
  public String getSuit() {
    switch(suit) {
    case 0: return suits[0];
    case 1: return suits[1];
    case 2: return suits[2];
    case 3: return suits[3];
    default: return "ERROR";
	}
  }
		
  public int getValue() {
	return value;
  }
		
  public String toString() {
    if(this.value<11)
	  return this.getValue() + " of " + this.getSuit();
	else 
	  return faceCards[this.getValue()-11] + " of " + this.getSuit();
  }
}
