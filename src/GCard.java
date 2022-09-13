import acm.graphics.GCompound;
import acm.graphics.GImage;
import acm.graphics.GRect;
import java.awt.Color;

public class GCard extends GCompound{

    private Card card;
    private GRect back;

    public GCard(Card card){
        this.card = card;

        //Make string for location of card picture
        String imageFileName = "cardgifs/" + card.getSuit().toString().substring(0,1).toLowerCase() +
                            (card.getFace().ordinal()+2) + ".gif";
        //Instantiate a GImage using String
        GImage image = new GImage(imageFileName);
        //Add the image to the compound
        add(image,1,1);
        //Make a GRect for borders of the card
        GRect border = new GRect(109,152);
        //Make a  GRect from thr back of the card
        add(border);
        //Add the back of the compound
        GRect back = new GRect(107,150);
        back.setFillColor(Color.cyan);
        back.setFilled(true);
        add(back,1,1);
        //Make the visibility of the card back depend on faceUp
        back.setVisible(!card.isFaceUp());
        //scale down the card (too big)
        this.scale(.75);
    }

    public boolean getFaceUp(boolean faceUp){
        return  card.isFaceUp();
    }

    public void setFaceUp(boolean faceUp){
        card.setFaceUp(faceUp);
        //back.setVisible();
    }

    public void flip(){card.flip();}

    public int getValue(){
        return card.getValue();
    }
}
