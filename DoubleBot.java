


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;
    public int twiceTheBeepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        findBeepers();
        pickUpBeepers();
        placeBeepers();
        }
    public void pickUpBeepers() {
        while (nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
    }
    public void findBeepers() {
        while (!nextToABeeper()) {
            move();
        }
    }
    public void placeBeepers() {
        int i;
        for (i = 0; i < beepers;  i++) {
            putBeeper();
        }
        move();
        twiceTheBeepers = beepers * 2;
        for (i = 0; i < twiceTheBeepers; i++) {
            putBeeper();
        }
        move();
    }
    
}
        
        

