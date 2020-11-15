import java.util.Random;

public class DeckOfCards {
    Card[] deck = new Card[52];//creates an array of objects of type card

    int length = 0;//keeps track of the size of the deck

    public Card[] subDeck;// creates an array for the subdeck, length not yet defined

    public void DeckOfCards(){//constructor class, used when the object is created

        for(int i = 0; i < 4; i++){//keeps track of the suits, repeating 4 times

            for(int u = 1; u < 14; u++){//loops 13 times, the same number as there are in each suit

                if(i == 0){//runs if we are using the first suit, when i = 0

                    switch (u){//this switch detects when the value of u is above 10, indicating a face card
                        case 11:
                            this.deck[length] = new Card("hearts", "jack");//depending on the number, this adds a face card to the deck in the current suit
                            break;
                        case 12:
                            this.deck[length] = new Card("hearts", "queen");
                            break;
                        case 13:
                            this.deck[length] = new Card("hearts", "king");
                            break;
                        default:
                            this.deck[length] = new Card("hearts", Integer.toString(u));//if not a face card, create a new card with the current suit and
                            //using the current loop number
                    }

                }
                else if(i == 1){
                    switch (u){
                        case 11:
                            this.deck[length] = new Card("diamonds", "jack");
                            break;
                        case 12:
                            this.deck[length] = new Card("diamonds", "queen");
                            break;
                        case 13:
                            this.deck[length] = new Card("diamonds", "king");
                            break;
                        default:
                            this.deck[length] = new Card("diamonds", Integer.toString(u));
                    }
                }
                else if(i == 2){
                    switch (u){
                        case 11:
                            this.deck[length] = new Card("spades", "jack");
                            break;
                        case 12:
                            this.deck[length] = new Card("spades", "queen");
                            break;
                        case 13:
                            this.deck[length] = new Card("spades", "king");
                            break;
                        default:
                            this.deck[length] = new Card("spades", Integer.toString(u));
                    }
                }
                else{
                    switch (u){
                        case 11:
                            this.deck[length] = new Card("clubs", "jack");
                            break;
                        case 12:
                            this.deck[length] = new Card("clubs", "queen");
                            break;
                        case 13:
                            this.deck[length] = new Card("clubs", "king");
                            break;
                        default:
                            this.deck[length] = new Card("clubs", Integer.toString(u));
                    }
                }
                length++;//adds one to the length as a new card has been added
            }

        }
    }

    public void sub(int n){
        subDeck = new Card[n];//sets the length of the array to the inputted value

        //gets the first values up to n from the shuffled array
        if (n >= 0) System.arraycopy(deck, 0, subDeck, 0, n);
        length -= n;//subtracts from the size of the deck array


    }
    public void shuffle(){
        Random rnd = new Random();//creates a new random object
        for (int i = deck.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1); //creates a random number between 0 and the deck length
            // Simple swap
            Card a = deck[index];
            deck[index] = deck[i];
            deck[i] = a;
            //swapping allows for each element to be randomized while also keeping the correct number of cards
        }
    }

    public void ShowDeck(){
        for(int i = 0; i < 52; i++){
            System.out.println(this.deck[i].getSuit() + ": " + this.deck[i].getValue());
        }//progressivly prints each card in the deck
    }
    public void showSub(){
        System.out.println("Your hand is :");
        for (Card card : subDeck) {
            System.out.println(card.getSuit() + ": " + card.getValue());
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }
        }
        System.out.println("\n \n \n ");
        //Progressively prints out each card in the hand as it is dealt
    }

    public int handScore(){
        int x = 0;

        for (Card card : subDeck) {//gathers the total of the deck
            if (card.getValue().equals("king") || card.getValue().equals("queen") || card.getValue().equals("jack")) {//if a card is a face card, add 10
                x += 10;
            } else {
                x += Integer.parseInt(card.getValue());//if its not a face card, add the value as an integer
            }
        }
        return x;
    }

    public void printSuitHist(){
        int h =0;
        int d = 0;
        int s = 0;
        int c = 0;
        for (Card card : subDeck) {//gathers the total number each suit from the subdeck and totals it
            switch (card.getSuit()) {
                case "hearts" -> h++;
                case "diamonds" -> d++;
                case "spades" -> s++;
                default -> c++;
            }
        }//prints out the number of each suit
        System.out.println("Histogram: "); //
        System.out.println("Number of Hearts: " + h);
        System.out.println("Number of Diamonds: " + d);
        System.out.println("Number of Spades: " + s);
        System.out.println("Number of Clubs: " + c);
    }

    public boolean hasFlush() {
        int h = 0;
        int d = 0;
        int s = 0;
        int c = 0;
        for (Card card : subDeck) {
            switch (card.getSuit()) {
                case "hearts" -> h++;
                case "diamonds" -> d++;
                case "spades" -> s++;
                default -> c++;
            }
        }

        //if any of the suits return a value of the length of the subdeck
        //then return true
        //if just one card is not of the smae suit, return false
        return h == subDeck.length || d == subDeck.length || s == subDeck.length || c == subDeck.length;
    }
    public int getCardsLeft(){
        return length;
    }
}
