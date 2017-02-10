package skype.teach.task.naval.clash;

/**
 *
 */
public class Cell<T> {
    private boolean hit;
    private boolean ship;


    public boolean isHit() {
        return hit;
    }

    public void hit() {
        this.hit = true;
    }

    public boolean containsShip() {
        return ship;
    }

    public void setShip() {
        this.ship = true;
    }

    public void draw(T paint, boolean real) {

    }
}
