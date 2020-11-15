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
    }//if at any point you need to change the card value or suit, use these commands to set the values.
    public String getSuit(){
        return suit;
    }//if at anypoint the card value needs to be accessed, use the get commands
    public void setValue(String x){
        value = x;
    }
    public String getValue(){
        return value;
    }
}
