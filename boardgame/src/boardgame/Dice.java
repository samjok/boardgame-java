package boardgame;

import java.util.Random;

public class Dice {
  private int maxNumber;
  private int result;
  private boolean locked;

	  public Dice(int maxNumber) {
	    if(maxNumber > 6)
	    this.maxNumber = maxNumber;
	    else {
	      this.maxNumber = 6;
	    }
	    this.locked = true;
	  }
	  
	  public Dice() {
	    this(6);
	  }

	  public void drawNumber() {
	    if(this.locked) {
	      Random rand = new Random();
	      int newResult = rand.nextInt(this.maxNumber) + 1;
	      this.result = newResult;
	    }
	    else this.result = 0;
	  }

	  public int getResult() {
	    return this.result;
	  }

	  public void lockDice() {
	    this.locked = false;
	  }

	  public void unlockDice() {
	    this.locked = true;
	  }  
}