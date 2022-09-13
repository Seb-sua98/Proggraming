import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Blackjack extends GraphicsProgram {

    //data aout the game
    private int wager = 0;
    private int balance = 10000;
    private int bank = 10000;


    //labels to display info to the player
    private GLabel bankLabel;
    private GLabel wagerLabel;
    private GLabel balanceLabel;
    private GLabel blackJack;

    // objects we are playing with
    private Deck deck;
    private GHand player;
    private GHand dealer;

    //buttons for controls
    private JButton wagerButton;
    private JButton playButton;
    private JButton hitButton;
    private JButton stayButton;
    private JButton quitButton;
    @Override
    public void init(){
        this.setBackground(Color.cyan);

        deck = new Deck();

        //set buttons

        wagerButton = new JButton("Wager");
        playButton = new JButton("Play");
        hitButton = new JButton("Hit");
        stayButton = new JButton("Stay");
        quitButton = new JButton("Quit");

        //add buttons on screen
        add(wagerButton, SOUTH);
        add(playButton, SOUTH);
        add(hitButton, SOUTH);
        add(stayButton, SOUTH);
        add(quitButton, SOUTH);

        // handle initial button visibility


        addActionListeners();

        // set up your GLabels
    }

    public void actionPerformed(ActionEvent ae){
        switch (ae.getActionCommand()){
            case "Wager":
                // TODO
                break;
            case "Play":
                // TODO
                break;
            case "Hit":
                // TODO
                break;
            case "Stay":
                //TODO
                break;
            case "Quit":
                //TODO
                break;

            default:
                System.out.println("bruh");

        }
    }

    private void quitGame(){

    }

    @Override
    public void run(){
        GHand hand = new GHand(new Hand(deck, true));
        add(hand, 100, 100);
        hand.hit();
    }

    public static void main(String[] args) {
        new Blackjack().start();
    }
}
