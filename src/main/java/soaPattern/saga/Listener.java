package soaPattern.saga;


public abstract class Listener<E extends Event> {

    public abstract void update(E event);
}
