package skype.teach.task.naval.clash;

/**
 *
 */
public class Ship {
    private final int size;
    private int hitDecks;

    public Ship(int size) {
        this.size = size;
    }

    public boolean isKilled(){
        return hitDecks == size;
    }

    public int getSize() {
        return size;
    }

    public int getHitDecks() {
        return hitDecks;
    }

    public boolean isHit(){
        return hitDecks > 0;

    }
}
