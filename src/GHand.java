import acm.graphics.GCompound;

public class GHand extends GCompound {

    // the hand DATA to display
    private Hand hand;
    //the GCards you will us to display them
    private GCard[] gcards;

    public  GHand(Hand hand){
        this.hand = hand;

        gcards = new GCard[7];

        for (int i = 0; i < hand.getCount(); i++) {
            Card card = hand.getCard(i);
            GCard gcard = new GCard(card);

            //add the gcard to the compound
            add(gcard,  i * (gcard.getWidth() + gcard.getWidth()/4), 0);

            // put the GCard in the array
            gcards[i] = gcard;
        }
    }

    // get the total value of the hand

    private int getCard(){
        return hand.getTotal();
    }

    // flip first card over(dealer only)

    private void flipCard(int index){

        gcards[index].flip();
    }
    // draw a card from the deck  (this is a hit)
    public void hit(){
        hand.hit();
        // make a new GCard using the card our hand just drew
        Card temp = hand.getCard(hand.getCount() - 1);
        GCard gcard = new GCard(temp);
        //put that GCard in gcards
        System.out.println(("Hand vount is now:" + hand.getCount()));
        gcards[hand.getCount()-1] = gcard;

        // add the new GCard to the compound

        add(gcard, (hand.getCount() - 1) * (gcard.getWidth() * 1.25), 0);
    }
}
