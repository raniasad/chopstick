package diningphilosophers;

public class ChopStick {

    private static int stickCount = 0;
    private boolean iAmFree = true;
    private final int myNumber;

    public ChopStick() {
        myNumber = ++stickCount;
    }

    // ...
    
    @Override
    public String toString() {
        return "Stick#" + myNumber;
    }
}
