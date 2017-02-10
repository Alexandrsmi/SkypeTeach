package skype.teach.task.naval.clash.console;

/**
 * Created by Александр on 20.12.2016.
 */
public interface Cell<T> {
    public boolean isHit();

    public void hit();

    public boolean containsShip();

    public void setShip();

    public void draw(T paint, boolean real);
}
