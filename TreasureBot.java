
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        while (true) {
        followBeeper();
    }
    }
    public void findBeeper(){
        while (!nextToABeeper()) {
            move();
        }
    }
    public void followBeeper() {
        int beeperNum = 0;
        while (nextToABeeper()) {
            pickBeeper();
            beeperNum++;
        }
        count(beeperNum);
    }
    public void count(int beeperNumber) {
        if (beeperNumber == 1) {
            moveNorth();
        }
        if (beeperNumber == 2) {
            moveEast();
        }
        if (beeperNumber == 3) {
            moveSouth();
        }
        if (beeperNumber == 4) {
            moveWest();
        }
        if (beeperNumber == 5) {
            turnOff();
        }
    }
    public void moveNorth() {
        while (!facingNorth()) {
            turnLeft();
        }
        while (!nextToABeeper()) {
            move();
        }
    }
    public void moveEast() {
        while (!facingEast()) {
            turnLeft();
        }
        while (!nextToABeeper()) {
            move();
        }
    }
    public void moveSouth() {
        while (!facingSouth()) {
            turnLeft();
        }
        while (!nextToABeeper()) {
            move();
        }
        }
    public void moveWest() {
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

