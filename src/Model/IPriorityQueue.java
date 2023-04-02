package Model;

/**
 * The interface Priority queue.
 *
 * @param <E> the type parameter
 */
public interface IPriorityQueue<E extends  Comparable<E>>{

    /**
     * Gets first.
     *
     * @return the first
     */
    E getFirst();

    /**
     * Remove e.
     *
     * @return the e
     */
    E remove();

    /**
     * Add.
     *
     * @param value the value
     */
    void add(E value);

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    boolean isEmpty();

    /**
     * Size int.
     *
     * @return the int
     */
    int size();

    /**
     * Clear.
     */
    void clear();




}
