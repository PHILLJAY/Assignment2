public class Card {
    public String suit;
    public String value;

    public Card(String x, String y){
        setSuit(x);
        setValue(y);
        //upon creation of the card, set its value and suit
    }

    public void setSuit(String x){
        suit = x;
    }

    //set and get commands for the suit and values
    public String getSuit(){
        return suit;
    }
    public void setValue(String x){
        value = x;
    }
    public String getValue(){
        return value;
    }
}
