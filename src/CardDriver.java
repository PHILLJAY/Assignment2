public class CardDriver {
    public static void main(String[] args){
        DeckOfCards x = new DeckOfCards();//create a new deck of cards
        x.DeckOfCards();//use the deck of cards constructor
        x.shuffle();//shuffle the deck
        x.sub(5);//create a sub deck of 5
        x.showSub();//display the subdeck
        System.out.println("Your hand score is: " + x.handScore());//print the handscore
        x.printSuitHist();//displays the histogram
        System.out.println("This hand is a flush: " + x.hasFlush());//display if the user has a flush
    }
}
