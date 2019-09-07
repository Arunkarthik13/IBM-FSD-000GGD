package collection.list.ex;

public class Card {
   private Suit suit;
   private Rank rank;
   
public Card() {
	super();
}

public Card(Suit suit, Rank rank) {
	super();
	this.suit = suit;
	this.rank = rank;
}

public Suit getSuit() {
	return suit;
}

public Rank getRank() {
	return rank;
}

public void setSuit(Suit suit) {
	this.suit = suit;
}

public void setRank(Rank rank) {
	this.rank = rank;
}

@Override
public String toString() {
	return "Card [suit=" + suit + ", rank=" + rank + "]\n";
}

   
}
