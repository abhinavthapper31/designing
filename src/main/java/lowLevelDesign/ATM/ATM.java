package lowLevelDesign.ATM;

import lowLevelDesign.ATM.states.IdleState;
import lowLevelDesign.ATM.states.State;

public class ATM {
    private State state;
    private int twoThousandNotes;
    private int fiveHundredNotes;
    private int oneHundredNotes;
    private int atmBalance;

    public ATM() {
        twoThousandNotes = 2;
        fiveHundredNotes = 3;
        oneHundredNotes = 10;
        state = new IdleState();
        this.atmBalance = twoThousandNotes * 2000 + fiveHundredNotes * 500 + oneHundredNotes * 100;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getTwoThousandNotes() {
        return twoThousandNotes;
    }

    public void setTwoThousandNotes(int twoThousandNotes) {
        this.twoThousandNotes = twoThousandNotes;
    }

    public int getFiveHundredNotes() {
        return fiveHundredNotes;
    }

    public void setFiveHundredNotes(int fiveHundredNotes) {
        this.fiveHundredNotes = fiveHundredNotes;
    }

    public int getOneHundredNotes() {
        return oneHundredNotes;
    }

    public void setOneHundredNotes(int oneHundredNotes) {
        this.oneHundredNotes = oneHundredNotes;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public boolean authenticateCardPin(Card card, int pin) {
        // call card auth class.
        // for now add auth logic in card
        return card.authenticatepin(pin);
    }

    public void printCurrentATMStatus() {
        System.out.println("Balance: " + atmBalance);
        System.out.println("2kNotes: " + twoThousandNotes);
        System.out.println("500Notes: " + fiveHundredNotes);
        System.out.println("100Notes: " + oneHundredNotes);

    }

    public void deductOneHundredNotes(int consumedNotes) {
        this.oneHundredNotes = this.oneHundredNotes - consumedNotes;
    }


    public void deductTwoThousandNotes(int consumedNotes) {
        this.twoThousandNotes = this.twoThousandNotes - consumedNotes;
    }

    public void deductFiveHundredNotes(int consumedNotes) {
        this.fiveHundredNotes = this.fiveHundredNotes - consumedNotes;
    }

    public void updateBalance() {
        this.atmBalance = twoThousandNotes * 2000 + fiveHundredNotes * 500 + oneHundredNotes * 100;
    }
}
