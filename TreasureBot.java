
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public int beepers;
    
    public void findTreasure() {
        findBeeper();
        followBeeper();
    }
    public void findBeeper(){
        faceNorth();
        while (!nextToABeeper()) {
            move();
        }
    }
    public void followBeeper() {
        while (nextToABeeper()) {
            pickBeeper();
            beepers++;
        }       
        if (beepers == 1) {
            goNorth();
        }
        if (beepers == 2) {
            goEast();
        }
        if (beepers == 3) {
            goSouth();
        }
        if (beepers == 4) {
            goWest();
        }
        if (beepers == 5) {
            turnOff();
        }
        beepers = 0;
    }
    public void goNorth() {
        while (!facingNorth()) {
            turnLeft();
        }
        while (!nextToABeeper()) {
            move();
        }
    }
    public void goEast() {
        while (!facingEast()) {
            turnLeft();
        }
        while (!nextToABeeper()) {
            move();
        }
    }
    public void goSouth() {
        while (!facingSouth()) {
            turnLeft();
        }
        while (!nextToABeeper()) {
            move();
            }
        }
    public void goWest() {
        while (!facingWest()) {
            turnLeft();
        }
        while (!nextToABeeper()) {
            move();
        }
    }
    public void faceNorth(){
        while (!facingNorth()) {
            turnLeft();
        }
    }
    
}

