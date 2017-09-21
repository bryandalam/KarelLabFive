
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        while (true) {
        checkForBeeper();
    }
    }
    public void checkForBeeper() {
        while (!nextToABeeper()) {
            move();
        }
        if (nextToABeeper()) {
            pickBeeper();
            checkRoom();
        }
    }
    public void checkRoom() {
        faceNorth();
        while (frontIsClear()) {
            move();
        }
        while (nextToABeeper()) {
            pickBeeper();
        }
        faceSouth();
        while(frontIsClear()) {
            move();
        }
        while (nextToABeeper()) {
            pickBeeper();
        }
        rePosition();
    }
    public void rePosition() {
        faceNorth();
        move();
        faceEast();
    }
    public void faceNorth(){
    while (!facingNorth()) {
        turnLeft();
    }
   }
    public void faceSouth() {
    while (!facingSouth()) {
        turnLeft();
    }
   }
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
        
    
   
}

