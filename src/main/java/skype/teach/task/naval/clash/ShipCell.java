package skype.teach.task.naval.clash;

/**
 *
 */
public class ShipCell extends Cell{
    private Ship ship;

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
        setShip();
    }
}
